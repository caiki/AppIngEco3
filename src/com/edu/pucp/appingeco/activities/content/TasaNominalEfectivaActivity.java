package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TasaNominalEfectivaActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tasa_nom_y_efect);
		TextView txtCambiado   = (TextView)findViewById(R.id.tasNomEfecTextView1);
		txtCambiado.setText("Es la tasa referencial que por convención se enuncia o nombra para realizar cualquier operación financiera.");
		
		TextView txtCambiado1   = (TextView)findViewById(R.id.tasNomEfecTextView2);
		txtCambiado1.setText("Es la tasa de interés que sí considera el proceso de capitalización.");
		
		
		TextView txtCambiado2  = (TextView)findViewById(R.id.tasNomEfecTextView3);
		txtCambiado2.setText("Donde:\n"+
		"Iex = Tasa de interés efectiva requerida con período de capitalización “x”.\n"+
		"Iey = Tasa de interés efectiva conocida con período de capitalización “y”.\n"+
		"m = Números de períodos de capitalización “y” comprendidos en el período de capitalización “x”.");
	 
		
		 
		
	}
}
