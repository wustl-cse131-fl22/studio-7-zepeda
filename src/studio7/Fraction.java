package studio7;

public class Fraction {

	private static double Numerator;
	private static double Denominator;
	
	public Fraction(Double initNumerator, Double initDenominator) {
		Numerator = initNumerator;
		Denominator = initDenominator;
	}
 	 
	public double Numerator(Double initNumerator) {
		Numerator = initNumerator;
		return Numerator;
	}
	
	public double Denominator(Double initDenominator) {
		Denominator = initDenominator;
		return Denominator;
	}
	
	public void print() {
	}
	
	
	public void denominator() {
		
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(5.0, 5.0);
		Fraction f2 = new Fraction(5.0, 5.0);
		//if ( f1.Denominator(Denominator) != f2.Denominator(Denominator) ) {
			System.out.println( (f1.Numerator(Numerator) * f2.Numerator(Numerator)) + "/" + (f1.Denominator(Denominator) * f2.Denominator(Denominator)));
			
		//}
	}

}
