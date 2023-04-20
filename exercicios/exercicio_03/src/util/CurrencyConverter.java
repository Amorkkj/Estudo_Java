package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollar, double qttDollar) {
		double valueWithTax = (dollar * qttDollar);
		return valueWithTax += valueWithTax * IOF;
	}
}
