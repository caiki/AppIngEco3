package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FactoresEquivalenciaActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facts_equivalencia);

		TextView txtCambiado = (TextView)findViewById(R.id.factsEqui1TextView1);
		txtCambiado.setText("Dos cantidades de dinero ubicadas en diferentes puntos del tiempo son equivalentes si al trasladarlas al mismo punto se hacen  iguales en magnitud." );
	
		TextView txtCambiado2 = (TextView)findViewById(R.id.factsEqui1TextView2);
		txtCambiado2.setText("Donde:\n"+
				"P:  	valor presente.\n"+
				"Fn=?:  valor futuro.\n"+
				"i:   	tasa de interés compuesta en cada período.\n"+
				"n:  	cantidad de períodos.");
			
		
	}	
}
