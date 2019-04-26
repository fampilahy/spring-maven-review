package xml.schema.based.aop;

public class CalculatorService {

	public Double addition(double arg1, double arg2) {
		return new Double(arg1 + arg2);
	}

	public Double multiplication(double arg2, double arg3) {
		return new Double(arg2 * arg3);
	}

	public CalculatorService() {

	}

}
