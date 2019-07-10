package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CostoPonderadoActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.costo_ponderado);
		
		TextView txtCambiado = (TextView)findViewById(R.id.costopondTextView01);
		 txtCambiado.setText("Dónde:\n"+
		"D:	importe de la financiación con deuda (o deuda con terceros).\n"+
		"C:	importe del aporte propio.\n"+
		"KD: tasa de costo efectivo de la deuda."+
		"KC: tasa de costo efectivo del aporte propio.");
		 TextView txtCambiado1 = (TextView)findViewById(R.id.costopondTextView02);
		 txtCambiado1.setText( 
		"ESCUDO TRIBUTARIO POR GASTOS FINANCIEROS = Gastos Financieros* T\n"+
		"ESCUDO TRIBUTARIO POR GASTOS FINANCIEROS = i*D*T");
		 TextView txtCambiado2 = (TextView)findViewById(R.id.costopondTextView03);
		 txtCambiado2.setText("Dónde:\n"+
		"i: 	tasa de interés de la deuda con terceros.\n"+
		"D: 	monto de la deuda con terceros.\n"+
		"i*D: 	monto de los intereses (gastos financieros).\n"+
		"T: 	tasa del Impuesto a la Renta.");
		 TextView txtCambiado3 = (TextView)findViewById(R.id.costopondTextView04);
		 txtCambiado3.setText("Dónde:\n"+
		 "KD(d.i.):	tasa de costo efectivo de la deuda después de Impuesto a la Renta.");
		 
	}
}
