package com.edu.pucp.appingeco.activities;


import com.edu.pucp.appingeco.model.CCalculadora;
import com.example.appingeco3.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.PorterDuff;

public class CalculadoraActivity extends Activity implements OnClickListener,
		OnFocusChangeListener {

	public int posicionCursor;
	public static double Resultado;
	public String Ecuacion;

	public String getEcuacion() {
		return Ecuacion;
	}

	public void setEcuacion(String ecuacion) {

		Ecuacion = ecuacion;
	}

	// que escriba donde esta el cursor android
	// podria crear una copia del texto
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculadora_activity);

		EditText editText1 = (EditText) findViewById(R.id.ET_Rpta);
		editText1.setOnClickListener(this);
		editText1.setOnFocusChangeListener(this);

		//InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
		//imm.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		
		// Aqui le pasa la vista al onClick
		View Bclear = findViewById(R.id.B_C);
		Bclear.setOnClickListener(this);
		Bclear.getBackground().setColorFilter(0xffff0000,
				PorterDuff.Mode.MULTIPLY);

		View Bcero = findViewById(R.id.B_cero);
		Bcero.setOnClickListener(this);
		Bcero.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Buno = findViewById(R.id.B_uno);
		Buno.setOnClickListener(this);
		Buno.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Bdos = findViewById(R.id.B_dos);
		Bdos.setOnClickListener(this);
		Bdos.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Btres = findViewById(R.id.B_tres);
		Btres.setOnClickListener(this);
		Btres.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Bcuatro = findViewById(R.id.B_cuatro);
		Bcuatro.setOnClickListener(this);
		Bcuatro.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Bcinco = findViewById(R.id.B_cinco);
		Bcinco.setOnClickListener(this);
		Bcinco.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Bseis = findViewById(R.id.B_seis);
		Bseis.setOnClickListener(this);
		Bseis.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Bsiete = findViewById(R.id.B_siete);
		Bsiete.setOnClickListener(this);
		Bsiete.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Bocho = findViewById(R.id.B_ocho);
		Bocho.setOnClickListener(this);
		Bocho.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Bnueve = findViewById(R.id.B_nueve);
		Bnueve.setOnClickListener(this);
		Bnueve.getBackground().setColorFilter(0xff1e90ff,
				PorterDuff.Mode.MULTIPLY);

		View Bpor = findViewById(R.id.B_por);
		Bpor.setOnClickListener(this);
		Bpor.getBackground().setColorFilter(0xffFFFF00,
				PorterDuff.Mode.MULTIPLY);

		View Bmas = findViewById(R.id.B_mas);
		Bmas.setOnClickListener(this);
		Bmas.getBackground().setColorFilter(0xffFFFF00,
				PorterDuff.Mode.MULTIPLY);

		View Bmenos = findViewById(R.id.B_menos);
		Bmenos.setOnClickListener(this);
		Bmenos.getBackground().setColorFilter(0xffFFFF00,
				PorterDuff.Mode.MULTIPLY);

		View Bentre = findViewById(R.id.B_entre);
		Bentre.setOnClickListener(this);
		Bentre.getBackground().setColorFilter(0xffFFFF00,
				PorterDuff.Mode.MULTIPLY);

		View B_FdadoP = findViewById(R.id.B_F_P);
		B_FdadoP.setOnClickListener(this);
		B_FdadoP.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_PdadoF = findViewById(R.id.B_P_F);
		B_PdadoF.setOnClickListener(this);
		B_PdadoF.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_PdadoA = findViewById(R.id.B_P_A);
		B_PdadoA.setOnClickListener(this);
		B_PdadoA.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_FdadoA = findViewById(R.id.B_F_A);
		B_FdadoA.setOnClickListener(this);
		B_FdadoA.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_PdadoG = findViewById(R.id.B_P_G);
		B_PdadoG.setOnClickListener(this);
		B_PdadoG.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_FdadoG = findViewById(R.id.B_F_G);
		B_FdadoG.setOnClickListener(this);
		B_FdadoG.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_PdadoGg = findViewById(R.id.B_P_Gg);
		B_PdadoGg.setOnClickListener(this);
		B_PdadoGg.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_FdadoGg = findViewById(R.id.B_F_Gg);
		B_FdadoGg.setOnClickListener(this);
		B_FdadoGg.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_left = findViewById(R.id.B_left);
		B_left.setOnClickListener(this);
		B_left.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		View B_right = findViewById(R.id.B_right);
		B_right.setOnClickListener(this);
		B_right.getBackground().setColorFilter(0xffC0FFFF,
				PorterDuff.Mode.MULTIPLY);

		/*
		 * View B_FdadoG = findViewById(R.id.B_A_F);
		 * B_FdadoG.setOnClickListener(this);
		 * 
		 * View B_FdadoG = findViewById(R.id.B_A_P);
		 * B_FdadoG.setOnClickListener(this);
		 * 
		 * View B_FdadoG = findViewById(R.id.B_A_G);
		 * B_FdadoG.setOnClickListener(this);
		 */

		View B_open_parentesis = findViewById(R.id.B_open_parentesis);
		B_open_parentesis.setOnClickListener(this);

		View B_close_parentesis = findViewById(R.id.B_close_parentesis);
		B_close_parentesis.setOnClickListener(this);

		View B_punto = findViewById(R.id.B_punto);
		B_punto.setOnClickListener(this);

		View B_coma = findViewById(R.id.B_coma);
		B_coma.setOnClickListener(this);

		View Bigual = findViewById(R.id.B_igual);
		Bigual.setOnClickListener(this);

		View Bdelete = findViewById(R.id.B_delete);
		Bdelete.setOnClickListener(this);
		Bdelete.getBackground().setColorFilter(0xFFFF0000,
				PorterDuff.Mode.MULTIPLY);

		Ecuacion = "";

	}

	// Tambien se puede hacer con metodos el Onclick segun
	/*
	 * http://www.aprendeandroid.com/l4/interface2.htm public void btn_uno(){}
	 */
	public void delete() {

		EditText rpta = (EditText) findViewById(R.id.ET_Rpta);
		try {
			if (Ecuacion != null) {
				int posCur = rpta.getSelectionStart();
				String textoAntesCursor = Ecuacion.substring(0, posCur);
				String textoDespuesCursor = Ecuacion.substring(posCur);
				// Ecuacion = Ecuacion.substring(0,Ecuacion.length()-1);
				Ecuacion = textoAntesCursor.substring(0, posCur - 1) + ""
						+ textoDespuesCursor;
				rpta.setText(Ecuacion);
				rpta.setSelection(posCur - 1, posCur - 1);
				// coloca el cursor antes de la barra
				/*
				 * if(textoDespuesCursor.equalsIgnoreCase("")){ Ecuacion =
				 * Ecuacion.substring(0,Ecuacion.length()-1); }else { Ecuacion =
				 * textoAntesCursor.substring(0,posCur-1)+""+textoDespuesCursor;
				 * rpta.setText(Ecuacion); } rpta.setSelection(posCur-2,
				 * posCur-2);
				 */

			}
		} catch (Exception e) {
		}
	}

	private void igual() {
		try {
			CCalculadora calculadora = new CCalculadora();
			EditText rpta = (EditText) findViewById(R.id.ET_Rpta);
			setEcuacion(rpta.getText().toString());

			if ((Ecuacion != null) || (Ecuacion != "")) {

				rpta.setText(String.valueOf(calculadora.evaluar(Ecuacion)));

				// int posicionDetrasCursor=rpta.getText().toString().length();
				// rpta.setSelection(posicionDetrasCursor,
				// posicionDetrasCursor);//Ecuacion.length+2

				if (Ecuacion.substring(0, 1).equalsIgnoreCase("(")
						&& Ecuacion.substring(Ecuacion.length() - 1,
								Ecuacion.length()).equalsIgnoreCase(")")) {
				} else {
					Ecuacion = "(" + Ecuacion + ")";
				}

				posicionCursor = Ecuacion.length();

				rpta.setSelection(rpta.getText().toString().length(), rpta
						.getText().toString().length());
			}
		} catch (Exception e) {
			System.out.print(e);
		}

	}

	public void salida(String value, int cursorpositition) {
		try {
			EditText rpta = (EditText) findViewById(R.id.ET_Rpta);
			// ------------------------Arreglar si ecuacion fue calculada y
			// desea añadir un nuevo operando,entonces que se agregue al final
			// de la ecuacion

			int posCur = rpta.getSelectionStart();
			if (posicionCursor == Ecuacion.length()) {
				posCur = posicionCursor;
			}

			String textoAntesCursor = Ecuacion.substring(0, posCur);
			String textoDespuesCursor = Ecuacion.substring(posCur);

			Ecuacion = textoAntesCursor + value + textoDespuesCursor;
			// Pegamos en el EditText el nuevo texto con la "/"

			rpta.setText(Ecuacion);
			// rpta.setCursorVisible(true);
			// coloca el cursor despues de la barra
			posCur = posCur + 1 + cursorpositition;
			rpta.setSelection(posCur, posCur);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void Clear() {
		Ecuacion = "";
		EditText rpta = (EditText) findViewById(R.id.ET_Rpta);
		rpta.setText(Ecuacion);
		posicionCursor = 0;
	}

	private void mover_der() {
		EditText rpta = (EditText) findViewById(R.id.ET_Rpta);
		try {
			if (Ecuacion != null) {

				int posCur = rpta.getSelectionStart();
				if (posCur < Ecuacion.length() + 1)
					rpta.setSelection(posCur + 1, posCur + 1);

			}
		} catch (Exception e) {
		}

	}

	private void mover_izq() {
		EditText rpta = (EditText) findViewById(R.id.ET_Rpta);
		try {
			if (Ecuacion != null) {

				int posCur = rpta.getSelectionStart();
				if (posCur > 0)
					rpta.setSelection(posCur - 1, posCur - 1);

			}
		} catch (Exception e) {
		}

	}

	// final EditText editText1 = (EditText) findViewById(R.id.ET_Rpta);
	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		// Cuando el enfoque cambia disparar un evento.,podria ser que no
		// muestre el teclado android
		EditText editText1 = (EditText) findViewById(R.id.ET_Rpta);
		// editText1.setOnFocusChangeListener(this);
		if (v.getId() == R.id.ET_Rpta && hasFocus) {
			InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
			editText1.setSelection(editText1.getSelectionStart(),
					editText1.getSelectionStart());
		}
	}

	@Override
	public void onClick(View v) {
		// el onClick recepciona la vista del onCreate

		EditText rpta = (EditText) findViewById(R.id.ET_Rpta);
		onFocusChange(rpta, true);
		InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(rpta.getWindowToken(), 0);
 
		switch (v.getId()) {
		case R.id.B_cero:
			salida("0", 0);
			break;
		case R.id.B_uno:
			salida("1", 0);
			break;
		case R.id.B_dos:
			salida("2", 0);
			break;
		case R.id.B_tres:
			salida("3", 0);
			break;
		case R.id.B_cuatro:
			salida("4", 0);
			break;
		case R.id.B_cinco:
			salida("5", 0);
			break;
		case R.id.B_seis:
			salida("6", 0);
			break;
		case R.id.B_siete:
			salida("7", 0);
			break;
		case R.id.B_ocho:
			salida("8", 0);
			break;
		case R.id.B_nueve:
			salida("9", 0);
			break;
		case R.id.B_por:
			salida("*", 0);
			break;
		case R.id.B_mas:
			salida("+", 0);
			break;
		case R.id.B_menos:
			salida("-", 0);
			break;
		case R.id.B_entre:
			salida("/", 0);
			break;
		case R.id.B_F_P:
			// Hacerle una salida especial
			salida("F|P[]", 3);
			Toast.makeText(rpta.getContext(), "Formato: F|P[i,n]",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.B_P_F:
			// Hacerle una salida especial
			salida("P|F[]", 3);
			Toast.makeText(rpta.getContext(), "Formato: P|F[i,n]",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.B_P_A:
			// Hacerle una salida especial
			salida("P|A[]", 3);
			Toast.makeText(rpta.getContext(), "Formato: P|A[i,n]",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.B_F_A:
			// Hacerle una salida especial
			salida("F|A[]", 3);
			Toast.makeText(rpta.getContext(), "Formato: F|A[i,n]",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.B_P_G:
			// Hacerle una salida especial
			salida("P|G[]", 3);
			Toast.makeText(rpta.getContext(), "Formato: P|G[i,n]",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.B_F_G:
			// Hacerle una salida especial
			salida("F|G[]", 3);
			Toast.makeText(rpta.getContext(), "Formato: F|G[i,n]",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.B_P_Gg:
			// Hacerle una salida especial¢¶
			salida("P|Ä[]", 3);
			Toast.makeText(rpta.getContext(), "Formato: P|Ä[g,i,n]",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.B_F_Gg:
			// Hacerle una salida especial
			salida("F|Ä[]", 3);
			Toast.makeText(rpta.getContext(), "Formato: F|Ä[g,i,n]",
					Toast.LENGTH_LONG).show();
			break;
		// case R.id.B_A_F:
		// Hacerle una salida especial
		// salida("A|F[,]");
		// break;
		// case R.id.B_A_P:
		// Hacerle una salida especial
		// salida("A|P[,]");
		// break;
		// case R.id.B_A_G:
		// Hacerle una salida especial
		// salida("A|G[,]");
		// break;
		case R.id.B_open_parentesis:
			salida("(", 0);
			break;
		case R.id.B_close_parentesis:
			salida(")", 0);
			break;
		case R.id.B_punto:
			salida(".", 0);
			break;
		case R.id.B_coma:
			salida(",", 0);
			break;
		case R.id.B_C:
			Clear();
			break;
		case R.id.B_igual:
			igual();
			break;
		case R.id.B_delete:
			delete();
			break;
		case R.id.B_left:
			mover_izq();
			break;
		case R.id.B_right:
			mover_der();
			break;
		default:
			salida("", 0);
			break;
		}
	}

}
/*
 * 
 * Procesador Qualcomm Snapdragon 800 MHz, GPU Adreno 200 Memoria
 * 
 * Expansión memoria microSD (hasta 32 Gb) Memoria RAM 384 Mb Memoria teléfono
 * 1024 Mb
 * 
 * Pantalla
 * 
 * Membrana pantalla Capacitiva Pantalla colores 256000 Pantalla tipo TFT
 * Resolución pantalla (Ancho) 240 Pixels Resolución pantalla (Largo) 320 Pixels
 * Sensores Acelerómetro , Compás , Sensor de proximidad Tamaño 3,2 Pulgadas
 * Tecnologia pantalla tactil Multitouch
 */

// Puedes aumentar personalizacion para el usuario, ejemplo que pueda agregar
// coma o no.