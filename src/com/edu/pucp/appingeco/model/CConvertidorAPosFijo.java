package com.edu.pucp.appingeco.model;

//package mypackage;

/**
 *
 * @author JuanEraclio Huamani Mendoza
 */
import java.util.*;


public class CConvertidorAPosFijo {
	/* ATRIBUTOS */
	private String aExpresion;

	/* CONSTRUCTORES */
	public CConvertidorAPosFijo() {
		aExpresion = "";
	}

	// ------------------------------
	public CConvertidorAPosFijo(String pExpresion) {
		aExpresion = pExpresion;
	}

	/* MODIFICADORES */
	// ------------------------------
	public void modificarExpresion(String pExpresion) {
		aExpresion = pExpresion;
	}

	/** SELECTORES */
	// ----------------------------
	public boolean okPrecedencia(String token1, String token2) {
		if (token1.equals("+") || token1.equals("-"))
			return (!token2.equals("("));
		else if ((token1.equals("*") || token1.equals("/"))
				&& (token2.equals("*") || token2.equals("/") || token2
						.equals("^")))
			return true;
		else
			// Ì‚^
			return false;
	}

	// -----------------------------------------------------------------------------
	private static boolean isNumeric(String cadena) {
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	// ----------------------------------------------------------------------------
	public String procesarToken(String token, CPila pila,
			String expresionPosFijo) {
		COpIngeco op = new COpIngeco();
		// si token = ")" desapilar todos los opeadores hasta encontar "("

		if (token.equals(")")) {

			while ((!pila.esVacia()) && (!((String) pila.cima()).equals("("))) {
				expresionPosFijo = expresionPosFijo + (String) pila.cima();
				// ---- Desapilar Operador
				pila.desapilar();
			}
			// ------ quitar de la pila el ")"
			if (!pila.esVacia())
				pila.desapilar();
		} else if (token.equals("+") || token.equals("-") || token.equals("*")
				|| token.equals("/") || token.equals("^")) {
			// Desapilar operdores, si existen de acuerdo a su precedencia
			while ((!pila.esVacia())
					&& okPrecedencia(token, (String) pila.cima())) {
				// Agregar operador a la expresion PosFijo
				expresionPosFijo = expresionPosFijo + (String) pila.cima();
				// --- Desapila Operador
				pila.desapilar();
			}
			// apilar nuevo operador
			pila.apilar(token);
		} else

		// si es "(" apilar
		if (token.equals("("))
			pila.apilar(token);
		else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("F|P"))//
		{
			expresionPosFijo += " " + String.valueOf(op.FdadoP(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("P|F"))//
		{
			expresionPosFijo += " " + String.valueOf(op.PdadoF(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("P|A"))//
		{
			expresionPosFijo += " " + String.valueOf(op.PdadoA(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("A|F"))//
		{
			expresionPosFijo += " " + String.valueOf(op.AdadoF(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("F|A"))//
		{
			expresionPosFijo += " " + String.valueOf(op.FdadoA(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("A|P"))//
		{
			expresionPosFijo += " " + String.valueOf(op.AdadoP(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("P|G"))//
		{
			expresionPosFijo += " " + String.valueOf(op.PdadoG(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("A|G"))//
		{
			expresionPosFijo += " " + String.valueOf(op.AdadoG(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("F|G"))//
		{
			expresionPosFijo += " " + String.valueOf(op.FdadoG(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("F|Ä"))//
		{
			expresionPosFijo += " " + String.valueOf(op.FdadoAgeom(token));
		} else if (!isNumeric(token)
				&& token.substring(0, 3).equalsIgnoreCase("P|Ä"))//
		{
			expresionPosFijo += " " + String.valueOf(op.PdadoAgeom(token));
		} else
		// Si no es " " agregar token a expresionPosFijo, caso contrario ignorar
		// token.

		if (!token.equals(" "))
			expresionPosFijo = expresionPosFijo + " " + token;

		// retornar valor de expresion posFijo
		return expresionPosFijo;
	}

	// -------------------------------
	public String convertir() {
		// declarar objetos
		CPila pila = new CPila();
		// Stack <Object> pila=new Stack<Object>();
		StringTokenizer st = new StringTokenizer(aExpresion, "+-*/^() ", true);

		String token;
		String expresionPosFijo = "";
		// ---- Convertir expresion, descomponiendo en tokens
		if (st.countTokens() > 0)
			do {
				token = st.nextToken();
				expresionPosFijo = procesarToken(token, pila, expresionPosFijo);
			} while (st.hasMoreTokens());
		// Desapilar todos los operdores que quedan en la pila
		while (!pila.esVacia()) {
			// ---- Agregar operador a la expresion PosFijo
			expresionPosFijo = expresionPosFijo + (String) pila.cima();
			// ------- Desapilar Operador
			pila.desapilar();
		}
		return expresionPosFijo;
	}

	// ------------------------------------------
	public String convertir(String expresion) {
		aExpresion = expresion;
		return convertir();
	}

}
