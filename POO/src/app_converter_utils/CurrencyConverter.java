package app_converter_utils;

public class CurrencyConverter {
	public static double converterDolar(double value, double price) {
		return (value * price) * 1.06;
	}
}
