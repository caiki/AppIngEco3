package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class FactoresEquivalencia1Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facts_equivalencia1);
		
		TextView txtCambiado1 = (TextView)findViewById(R.id.factsEqui2TextView1);
		txtCambiado1.setText("Donde:\n"+
		"P:valor presente de la serie de pagos uniforme.\n"+
		"A:monto constante desembolsado cada período.\n"+
		"i:tasa de interés compuesta en cada período.\n"+
		"n:cantidad de períodos.\n"+
		"F:valor futuro de la serie de pagos uniforme");
	 
		
		
		
		
		
	}
}