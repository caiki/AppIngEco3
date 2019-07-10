package com.edu.pucp.appingeco.activities;

import com.example.appingeco3.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;
import com.edu.pucp.appingeco.activities.content.*;
import com.edu.pucp.appingeco.model.*;

public class FormularioActivity extends Activity implements OnClickListener {
	ExpandableListView exv;
	public Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.formulario_activity);
		exv=(ExpandableListView)findViewById(R.id.expandableListView1);
		MyAdapter adapter=new MyAdapter(this);
		exv.setAdapter(adapter);
		
		exv.setOnChildClickListener(new OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v, int groupPosition,
					int childPosition, long id) {
				// TODO Auto-generated method stub
				String itemclicked=MyAdapter.childList[groupPosition][childPosition];
				Toast.makeText(FormularioActivity.this, itemclicked ,Toast.LENGTH_SHORT).show();
				onClick(itemclicked);
				return false;
			}
		});
	}
	public void onClick(String itemf) {
		if ("Interés Simple y Compuesto".equalsIgnoreCase(itemf)) {
			Intent j = new Intent(this, InteresActivity.class);
			startActivity(j);
		}
		if ("Pagos Únicos(Pagos Simples)".equalsIgnoreCase(itemf)) {
			Intent j = new Intent(this, FactoresEquivalenciaActivity.class);
			startActivity(j);
		}
		if ("Pago Uniforme(Anualidad)".equalsIgnoreCase(itemf)) {
			Intent j = new Intent(this,  FactoresEquivalencia1Activity.class);
			startActivity(j);
		}
		if ("Pago con Gradiente Lineal y Geometrica".equalsIgnoreCase(itemf)) {
			Intent j = new Intent(this, FactoresEquivalencia2Activity.class);
			startActivity(j);
		}
		if ("Tasa Nominal y Tasa Efectiva".equalsIgnoreCase(itemf)) {
			Intent j = new Intent(this, TasaNominalEfectivaActivity.class);
			startActivity(j);
		}
		if ("-Cuotas Iguales\n-Cuotas con amortizacion Cte\n-Cuotas Crecientes(Suma de Digitos)".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this, OperacionesCreditoActivity.class);
			startActivity(j);
		}
		if ("-Cuotas Iguales y Periodos de Gracia\n-Cuotas Iguales e int pag por adelantado\n-Cuotas Iguales y Periodos de Gracia e Intereses Adelantados\n-Crédito Comercial(FLAT)".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this, OperacionesCredito1Activity.class);
			startActivity(j);
		}
		if ("-Conceptos\n-Conversion de Flujo de Caja\n-Revaluación".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this,  DevaluacionActivity.class);
			startActivity(j);
		}
		if ("-Flujo de Caja del emisor\n-Flujo de Caja del adquiriente".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this,  BonosActivity.class);
			startActivity(j);
		}
		if ("-Índice de Preci del Consumidor\n-Inflación\n-Relación Interes Real y Corriente\n-Deflactación".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this,  InflacionActivity.class);
			startActivity(j);
		}
		if ("-Cuentas de Balance General\n-Cuentas de Estado Ganancias y Perdidas".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this,  ConceptosContablesActivity.class);
			startActivity(j);
		}
		if ("-Acciones Preferentes y Comunes".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this,  AccionesActivity.class);
			startActivity(j);
		}
		if ("-Costo Ponderado del Capital(K)\n-Escudo Tributario por Gastos Financieros\n-Costo Ponderado del Capital Después de Impuestos".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this,  CostoPonderadoActivity.class);
			startActivity(j);
		}
		if ("-Definición\n-Métodos de Depreciación\n-Escudo Tributario por Depreciación".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this,  DepreciacionActivity.class);
			startActivity(j);
		}
		if ("-Flujo de Caja Económico\n-Evaluación Economica de Proyectos\n-Evaluación Proyectos con Vidas Diferentes".equalsIgnoreCase(itemf))
		{
			Intent j = new Intent(this,  EvaluacionPrysActivity.class);
			startActivity(j);
		}
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
 