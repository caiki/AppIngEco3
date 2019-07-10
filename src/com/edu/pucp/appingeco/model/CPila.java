package com.edu.pucp.appingeco.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package mypackage;

/**
 * 
 * @author JuanEraclio Huamani Mendoza
 */
public class CPila {
	/* ATRIBUTOS */
	private Object aElemento;
	private CPila aSubPila;

	/* METODOS */
	// Constructores
	protected CPila() {
		aElemento = null;
		aSubPila = null;
	}

	// --------------------
	protected CPila(Object pElemento, CPila pSubPila) {
		aElemento = pElemento;
		aSubPila = pSubPila;
	}

	// -----------------------------
	public static CPila crearPila() {
		return new CPila();
	}

	// ------------------------------
	public static CPila crearPila(Object pElemento, CPila pSubPila) {
		return new CPila(pElemento, pSubPila);
	}

	/* MODIFCADORES */
	protected void asignarElemento(Object pElemento) {
		aElemento = pElemento;
	}

	// ------------------------------------------------
	protected void asignarPila(CPila pSubPila) {
		aSubPila = pSubPila;
	}

	/* SELECTORES */
	// ----------------------------------------------
	protected Object elemento() {
		return aElemento;
	}

	protected CPila subPila() {
		return aSubPila;
	}

	/* OPERACIONES DE BASE */
	// ------------------------------------------------
	public void apilar(Object pElemento) {
		aSubPila = new CPila(aElemento, aSubPila);
		aElemento = pElemento;
	}

	// -----------------------------------------------
	public void desapilar() {
		if (!esVacia()) {
			aElemento = aSubPila.aElemento;
			aSubPila = aSubPila.aSubPila;
		}
	}

	// -----------------------------------------------
	public Object cima() {
		if (esVacia())
			return null;
		else
			return elemento();
	}

	// ------------------------------------------
	public boolean esVacia() {
		return aElemento == null;
	}
}
