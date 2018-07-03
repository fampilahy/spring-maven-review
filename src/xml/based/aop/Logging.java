package xml.based.aop;

public class Logging {
	
	public void beforeAdvice(){
		System.out.println("Going to start the service ");
	}
	
	public void afterAdvice(){
		System.out.println("After the service ");
	}
	
	public void afterReturningValueAdvice(Object value){
		System.out.println("Returning a value "+value.toString());
	}
	
	public void afterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("Throwing an exception "+ex.getMessage());
	}
	
//	public void aroundAdvice(){
//		System.out.print("Around the advice ");
//	}
	
	public Logging(){
		
	}
}
