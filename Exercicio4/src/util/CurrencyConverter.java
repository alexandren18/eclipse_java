package util;

public class CurrencyConverter {
	public static double iof = 0.6;
	
	
	public static double dollarToReal(double mount, double dollarPrice) {
		return mount * dollarPrice * (1.0 + iof);
	}

}
