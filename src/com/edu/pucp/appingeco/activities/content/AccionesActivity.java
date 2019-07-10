package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AccionesActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acciones);
		TextView txtCambiado = (TextView)findViewById(R.id.accionesTextView01);
		txtCambiado.setText("Dónde:\n"+"D = dividendos\n"+
		"PC= precio de colocación\n"+
		"GE= gastos de emisión\n"+
		"D1= dividendos el primer periodo\n"+
		"g%= crecimiento esperado de dividendos");
		TextView txtCambiado1 = (TextView)findViewById(R.id.accionesTextView02);
		txtCambiado1.setText("-Preferencia en cuanto al pago de dividendos\n"+
		"-Preferencia en caso de bancarrota\n"+
		"-No participan del crecimiento de las ganancias: sólo cobran un dividendo fijo\n"+
		"-No asume el riesgo empresarial.\n"+
		"-No confiere el derecho a voto");
		TextView txtCambiado2 = (TextView)findViewById(R.id.accionesTextView03);
		txtCambiado2.setText("-Confieren derecho de PROPIEDAD de la sociedad.\n"+ 
		"-Tienen control de las actividades de la empresa: Derecho a Voto\n"+
		"-Ofrecen un dividendo variable; ya que depende directamente de las utilidades obtenidas en el ejercicio.\n"+
		"-Los dividendos por estas acciones sólo se pagan cuando lo acuerda la Junta Directiva.");
	}
}
