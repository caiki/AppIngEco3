package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FactoresEquivalencia2Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facts_equivalencia2);
		
		TextView txtCambiado  = (TextView)findViewById(R.id.factsEqui3TextView1);
		txtCambiado.setText("Donde:\n"+
		"P:valor presente de la serie triángulo de pagos.\n"+
		"G:cambio aritmético constante del monto de un período al siguiente."+
		"(También llamada la gradiente lineal o gradiente aritmética).\n"+
		"i:tasa de interés compuesta en cada período.\n" +
		"n:cantidad de períodos.\n"+
		"A*:monto inicial en el primer período.\n"+
		"g:porcentaje de aumento o disminución de un período al siguiente.");
	}
}
