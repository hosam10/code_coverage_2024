package code_coverage_4.code_coverage_4;

public class Power_calculator {
	private Multiplier multiplier;

    public Power_calculator(Multiplier multiplier) {
        this.multiplier = multiplier;
    }

    public double power(double base, double exponent) {
        double result = base;
        for (int i = 1; i < exponent; i++) {
            result = multiplier.multiply(result, base);
        }
        return result;
    }
}
