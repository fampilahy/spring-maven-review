package xml.based.aop;

public class Auditing {

	
	
	public Auditing(){
		
		
	}
	
	
	public void beforeAdvice(){
		System.out.println("Auditing.beforeAdvice()");
	}
	
	
	public void afterAdvice(){
		System.out.println("Auditing.afterAdvice()");
	}
	
	
	public void afterReturningAdvice(){
		System.out.println("afterReturningAdvice()");
	}
	
	
}
