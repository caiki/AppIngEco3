package com.edu.pucp.appingeco.model;

//package mypackage;

import java.util.*;


public class CEvaluadorPosFijo {
	/* Metodos */
	private String aExpresion;

	/* ATRIBUTOS */
	// CONSTRUCTORES
	public CEvaluadorPosFijo() {
		aExpresion = "";
	}

	// ------------------------
	public CEvaluadorPosFijo(String pExpresion) {
		aExpresion = pExpresion;
	}

	/* MODIFICADORES */
	// ------------------------
	public String expresion() {
		return aExpresion;
	}

	// ------------------------
	public float potencia(float base, float exponente) {
		return (float) Math.exp(exponente * Math.log(base));
	}

	// ------------------------
	public void procesarToken(String token, CPila pila) throws Exception {
		/**
		 * Este metodo procesa un token, considerando tres casos : a) Si token
		 * es un operador (a,-,*,/,^) desapila dos operando de la pila, efectua
		 * la operacion y apila el resulado b) si token es un operando,
		 * simplemente apila en la pila c) si token es un blanco, simplemente se
		 * ignora
		 */
		if (token.equals("+") || token.equals("-") || token.equals("*")
				|| token.equals("/") || token.equals("^")) {
			// Recuperar operandos. Notar que el metodo cima() de la pila
			// devuelve un objeto mediante un casting
			float operandoDer = ((Float) pila.cima()).floatValue();
			pila.desapilar();
			float operandoIzq = ((Float) pila.cima()).floatValue();
			pila.desapilar();
			// ------ Efectuar operacion y apilar el resultado
			// Notar que el resultado de cada operacion se debe apilar como un
			// objeto de tipo Float
			if (token.equals("+"))
				pila.apilar(new Float(operandoIzq + operandoDer));
			if (token.equals("-"))
				pila.apilar(new Float(operandoIzq - operandoDer));
			if (token.equals("*"))
				pila.apilar(new Float(operandoIzq * operandoDer));
			if (token.equals("/"))
				pila.apilar(new Float(operandoIzq / operandoDer));
			if (token.equals("^"))
				pila.apilar(new Float(potencia(operandoIzq, operandoDer)));
		} else if (!token.equals(" ")) // --- token es un operando

			pila.apilar(Float.valueOf(token));
	}

	// -----------------------------------------------------------
	public float evaluar() throws Exception {
		// Declara Objetos
		CPila pila = new CPila();
		StringTokenizer st;
		String token;

		// ---- Crear un objeto Tokenizer
		st = new StringTokenizer(aExpresion, "+-*/^ ", true);
		// ----- Evaluar expresion, descomponiendo en tokens
		if (st.countTokens() > 0)
			do {
				token = st.nextToken();
				procesarToken(token, pila);
			} while (st.hasMoreTokens());
		// ----- Obtener el resultado
		return ((Float) pila.cima()).floatValue();
	}

	// ---------------------------------------------------------------
	public float evaluar(String expresion) throws Exception {
		aExpresion = expresion;
		return evaluar();
	}
}
