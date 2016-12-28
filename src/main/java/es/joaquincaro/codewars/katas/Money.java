package es.joaquincaro.codewars.katas;

public class Money {
	public static int calculateYears(double principal, double interest, double tax, double desired) {
		int years = 0;
		while (principal < desired) {
			double gain = principal * interest;
			double taxes = gain * tax;
			principal += gain - taxes;
			years++;
		}
		return years;
	}
}
