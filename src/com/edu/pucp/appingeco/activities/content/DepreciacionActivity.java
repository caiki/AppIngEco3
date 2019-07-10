package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DepreciacionActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.depreciacion); 
		 TextView txtCambiado = (TextView)findViewById(R.id.depreciacionTextView01);
		 txtCambiado.setText( 
		"Dónde:\n"+
		"VLt : 	valor en libros del activo fijo o valor que muestra la contabilidad a la fecha “t”.\n"+
		"S: 	es la suma de los dígitos que identifican a cada período.\n"+
		"R: 	es el valor  de  recuperación.\n"+
		"P: 	costo  inicial.\n"+
		"Dt :	es  la  depreciación  acumulada y muestra los gastos de depreciación acumulados de cada período hasta la fecha “t”.");
		 TextView txtCambiado2 = (TextView)findViewById(R.id.depreciacionTextView03);
		 txtCambiado2.setText("ESCUDO TRIBUTARIO POR GASTOS DE DEPRECIACIÓN= Gastos de Depreciación* T\n"+
		"ESCUDO TRIBUTARIO POR GASTOS DE DEPRECIACIÓN = dt * T\n"+
		"Dónde:\n"+
		"dt:	es el gasto de depreciación en el período “t”.\n"+
		"T: 	tasa del Impuesto a la Renta.");
}}
