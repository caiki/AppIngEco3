package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DevaluacionActivity extends Activity {
protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.devaluacion);
		
		   TextView txtCambiado = (TextView)findViewById(R.id.devCustomTextView1);
		   txtCambiado.setText("La devaluación desde “0” hasta “t” se calcula  y expresa en términos porcentuales así:");	
		   TextView txtCambiado2 = (TextView)findViewById(R.id.devCustomTextView2);
			txtCambiado2.setText("El tipo de cambio es el precio de la moneda extranjera en términos de la moneda local." );
		
	}
}
