package com.edu.pucp.appingeco.model;

//package mypackage;

import java.util.*;


public class CCalculadora {
	/* ATRIBUTOS */
	private String aExpresion;

	/* METODOS */
	// CONSTRUCTORES
	public CCalculadora() {
		aExpresion = "";
	}

	public CCalculadora(String pExpresion) {
		aExpresion = pExpresion;
	}

	// MODIFICADORES
	public void asignarExpresion(String pExpresion) {
		aExpresion = pExpresion;
	}

	// SELECTORES
	public String expresion() {
		return aExpresion;
	}

	// OTROS METODOS
	public float evaluar() throws Exception {
		String expresionPosFijo;
		// Convertir expresion InFija a PosFija
		CConvertidorAPosFijo convertidorAPosFijo = new CConvertidorAPosFijo();

		expresionPosFijo = convertidorAPosFijo.convertir(aExpresion);

		// Evaluar Expresion PosFija
		CEvaluadorPosFijo evaluadorPosFijo = new CEvaluadorPosFijo();
		return evaluadorPosFijo.evaluar(expresionPosFijo);
	}

	public float evaluar(String expresion) throws Exception {
		aExpresion = expresion;
		return evaluar();
	}
}
