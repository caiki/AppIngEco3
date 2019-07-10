package com.edu.pucp.appingeco.model;

 
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseExpandableListAdapter {
public Context context;
public static String []parentList={	"Interés",
					 	"Factores de Equivalencia",
						"Tasa Nominal y Efectiva",
						"Operaciones de Crédito",
						"Devaluación",						 
						"Bonos",
						"Inflación",
						"Conceptos Contables",
						"Acciones",
						"Costo Pond. del Capital",
						"Depreciación", 
						"Eval. de Proyectos"};
//Ver si aumentas analisis de sensibilidad
public static String [][]childList={
		{
			"Interés Simple y Compuesto" 
		},
		{
			"Pagos Únicos(Pagos Simples)","Pago Uniforme(Anualidad)","Pago con Gradiente Lineal y Geometrica"
		},
		{
			"Tasa Nominal y Tasa Efectiva"
		},
		{
			"-Cuotas Iguales\n-Cuotas con amortizacion Cte\n-Cuotas Crecientes(Suma de Digitos)"
			,"-Cuotas Iguales y Periodos de Gracia\n-Cuotas Iguales e int pag por adelantado\n-Cuotas Iguales y Periodos de Gracia e Intereses Adelantados\n-Crédito Comercial(FLAT)"
		},
		{
			"-Conceptos\n-Conversion de Flujo de Caja\n-Revaluación" 
		},
		{
			"-Flujo de Caja del emisor\n-Flujo de Caja del adquiriente"
		},
		{
			"-Índice de Precios del Consumidor\n-Inflación\n-Relación Interes Real y Corriente\n-Deflactación" 
		},
		{
			"-Cuentas de Balance General\n-Cuentas de Estado Ganancias y Perdidas"
		},
		{
			"-Acciones Preferentes y Comunes" 
		},
		{
			"-Costo Ponderado del Capital(K)\n-Escudo Tributario por Gastos Financieros\n-Costo Ponderado del Capital Después de Impuestos"
		},
		{
			"-Definición\n-Métodos de Depreciación\n-Escudo Tributario por Depreciación"
		},
		{
			"-Flujo de Caja Económico\n-Evaluación Economica de Proyectos\n-Evaluación Proyectos con Vidas Diferentes"
		}
};
	public MyAdapter(Context context) {
		// TODO Auto-generated constructor stub
	this.context=context;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean IsLastChild, View convertView,
			ViewGroup parent) {
		// TODO Auto-generated method stub
		TextView tv=new TextView(context);
		tv.setText(childList[groupPosition][childPosition]);
		//tv.setPadding(0, 0, 0, 0);holder.	 
		
		tv.setTextSize(20);
		tv.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tv.setTextColor(Color.parseColor("#009090")); 
		return tv;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		
		return childList[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return parentList.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub		
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean childPosition, View arg2, ViewGroup arg3) {
		// TODO Auto-generated method stub
		TextView tv=new TextView(context);
		tv.setText(parentList[groupPosition]);
		tv.setPadding(30, 0, 0,0);
		tv.setTextSize(23);
		tv.setTextColor(Color.parseColor("#FFFFFF")); 
		tv.setBackgroundColor(Color.parseColor("#009090"));
		//tv.setTextColor(color.holo_green_dark); 	 
		return tv;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	}

}
