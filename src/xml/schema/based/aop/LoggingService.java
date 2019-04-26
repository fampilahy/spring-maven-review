package xml.schema.based.aop;

public class LoggingService {

	public void beforeAdvice() {
		System.out.println("Here inside before Advice");

	}

	public Double aroundAdvice() {
		System.out.println("Here inside around Advice");
		return new Double(10);
	}

	public void afterAdvice() {
		System.out.println("Here inside after Advice");

	}

	public void afterReturningAdvice() {
		System.out.println("Here inside after Returning");
	}

	public void afterThrowingAdvice() {
		System.out.println("Here inside after throwing");
	}

	public LoggingService() {

	}

}
