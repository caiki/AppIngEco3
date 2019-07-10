package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class InflacionActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inflacion);
		TextView txtCambiado = (TextView)findViewById(R.id.inflaTextView1);
		txtCambiado.setText("La inflación es una subida duradera del nivel general de precios de los bienes y servicios de la economía."+
		"A partir del IPC (Índice de Precios al Consumidor) la inflación se determina así:");
		
		TextView txtCambiado1 = (TextView)findViewById(R.id.inflaTextView2);
		txtCambiado1.setText("Deflactar un flujo de caja significa expresarlo en términos de una moneda de poder adquisitivo constante, esta es la moneda real.");
	
	}
}
