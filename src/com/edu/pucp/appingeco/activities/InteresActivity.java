package com.edu.pucp.appingeco.activities;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class InteresActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.interes_activity);
		TextView txtCambiado = (TextView)findViewById(R.id.interesTextView1);
		txtCambiado.setText("Incremento del valor inicial P a lo largo de n períodos y que al final de este se ha transformado en un valor Fn ." );
		
		TextView txtCambiado2 = (TextView)findViewById(R.id.interesTextView2);
		txtCambiado2.setText("Donde:\n"+
		"P:   monto del préstamo, principal, capital inicial, valor monetario hoy (t=0).\n"+
		"i%: tasa de interés por período.\n"+
		"n:   cantidad de períodos.\n"+
		"Fn:  valor monetario o capital final al final del n-ésimo período.");
		
	}
}
