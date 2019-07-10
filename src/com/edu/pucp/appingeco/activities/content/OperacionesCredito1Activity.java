package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OperacionesCredito1Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.operaciones_credito1);
		
		   TextView txtCambiado = (TextView)findViewById(R.id.customTextView1);
		   txtCambiado.setText("Cálculo de la cuota:\nP = Cuota*(P/A, i, n)\nDónde: n=q-p\n"+
		   "n=Cantidad de periodos donde se amortiza la deuda\nq=Plazo del crédito\np=Periodos de gracia");	
	
		   TextView txtCambiado2 = (TextView)findViewById(R.id.customTextView2);
		   txtCambiado2.setText("Se utiliza la anterior ecuación para calcular la Cuota.\nConsiderando: n=q-p\n"+
		   "n=Cantidad de periodos donde se amortiza la deuda\nq=Plazo del crédito\np=Periodos de gracia");	
	
	}
	

}
