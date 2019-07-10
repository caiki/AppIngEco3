package com.edu.pucp.appingeco.model;

import java.util.StringTokenizer;

public class COpIngeco {
	public String[] Extraer(String SubToken) {
		// declarar objetos

		StringTokenizer st = new StringTokenizer(SubToken, "[], ", false);
		String[] t = new String[st.countTokens()];
		for (int i = 0; i < t.length; i++) {
			t[i] = st.nextToken();
		}

		return t;
	}

	// / ---------------------FACTORES-------------------------
	public Double FdadoP(String Token) {
		// public static String Ecuacion="F|P[3,5]";
		// String [] flag =Extraer(Token);
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		Double Rpta = Math.pow((1 + (i / 100)), n);
		return Rpta;
	}

	public Double PdadoF(String Token) {
		// public static String Ecuacion="P|F[3,5]";
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		Double Rpta = (1 / Math.pow((1 + i / 100), n));
		return Rpta;
	}

	public Double PdadoA(String Token) {
		// public static String Ecuacion="F|P[3,5]";
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		i = i / 100;
		Double Rpta = (Math.pow((1 + i), n) - 1) / (i * Math.pow((1 + i), n));
		return Rpta;
	}

	// ////////////////////////////////////////
	public Double PdadoAinf(String Token) {
		// public static String Ecuacion="F|P[3,@]";
		double i = Double.valueOf(Extraer(Token)[1]);

		return 1 / i;
	}

	// ////////////////////////////////////////
	public Double AdadoF(String Token) {
		// public static String Ecuacion="F|P[3,5]";
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		i = i / 100;
		Double Rpta = i / (Math.pow((1 + i), n) - 1);
		return Rpta;
	}

	public Double FdadoA(String Token) {
		// public static String Ecuacion="F|P[3,5]";
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		i = i / 100;
		Double Rpta = (Math.pow((1 + i), n) - 1) / i;
		return Rpta;
	}

	public Double AdadoP(String Token) {
		// public static String Ecuacion="F|P[3,5]";
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		i = i / 100;
		Double Rpta = (i * Math.pow((1 + i), n)) / (Math.pow((1 + i), n) - 1);
		return Rpta;
	}

	public Double PdadoG(String Token) {
		// public static String Ecuacion="F|P[3,5]";
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		i = i / 100;
		double c = Math.pow((1 + i), n);
		Double Rpta = (c - 1) / (i * i * c) - n / (c * i);
		return Rpta;
	}

	public Double AdadoG(String Token) {
		// public static String Ecuacion="F|P[3,5]";
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		i = i / 100;
		double c = Math.pow((1 + i), n);
		Double Rpta = (1 / i) - n / (c - 1);
		return Rpta;
	}

	public Double FdadoG(String Token) {
		// public static String Ecuacion="F|P[3,5]";
		double i = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double n = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		i = i / 100;
		double c = Math.pow((1 + i), n);
		Double Rpta = (1 / i) * ((c - 1) / i - n);
		return Rpta;
	}

	// //////////////FALTA AUMENTAR LOS GEOMETRICOS
	public Double PdadoAgeom(String Token) {
		// public static String Ecuacion="P|A*[g,3,5]";
		double g = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double i = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		double n = Double.valueOf(Extraer(Token)[3]);
		i = i / 100;
		g = g / 100;
		Double Rpta;
		if (i != g) {
			Rpta = (1 - Math.pow((1 + g) / (1 + i), n)) / (i - g);
		} else {
			Rpta = 1 / (i + 1);
		}
		return Rpta;
	}

	public Double FdadoAgeom(String Token) {
		// public static String Ecuacion="P|A*[g,3,5]";
		double g = Double.valueOf(Extraer(Token)[1]);
		// System.out.println(i);
		double i = Double.valueOf(Extraer(Token)[2]);
		// System.out.println(n);
		double n = Double.valueOf(Extraer(Token)[3]);
		i = i / 100;
		g = g / 100;
		Double Rpta;
		if (i >= g) {
			Rpta = (Math.pow((1 + i), n)+ Math.pow((1 + g), n))/(g+i);
		} else {
			Rpta = (Math.pow((1 + i), n)+ Math.pow((1 + g), n))/(g-i);
		}	
		return Rpta;
	}
	// ----------TASAS EQUIVALENTES--------------------------

	// ----------CALENDARIO DE PAGOS--------------------------

	// ----------Devaluacion--------------------------------

	// ---------Bonos--------------------------------------

	// ----------Inflacion----------------------------------

	// ----------Formulario--------------------------------
}
