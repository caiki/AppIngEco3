package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ConceptosContablesActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.conceptos_contables);
		
		TextView txtCambiado = (TextView)findViewById(R.id.conceptsTextView01);
		txtCambiado.setText(
		"Son los bienes y derechos que son propiedad de la empresa a la fecha de emisión del balance general.Los activos se clasifican en:\n"+
		"Activos circulantes o corrientes.\n"+
		"Activos no circulantes o no corrientes.");

		TextView txtCambiado2 = (TextView)findViewById(R.id.conceptsTextView02);
		txtCambiado2.setText("Representan el total de deudas u obligaciones de pago que la empresa tiene con terceros (financiación con deuda o financiación ajena).Los pasivos se clasifican en:\n"+
		"Pasivo circulante o corriente.\n"+
		"Pasivo no circulante o no corriente." );
		
		TextView txtCambiado3 = (TextView)findViewById(R.id.conceptsTextView03);
		txtCambiado3.setText("Son las obligaciones de la empresa que tiene con los propietarios o dueños de ésta, así como las utilidades acumuladas desde la fecha de constitución del negocio");	
				
	}
	
}
