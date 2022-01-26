package exercicio_proposto_4_poo;

public class CurrencyConverter {

	public static final double IOF = (1 + 0.06);

	public static double conversao(double dolar, double montante) {
		return dolar * montante * IOF;
	}

}
