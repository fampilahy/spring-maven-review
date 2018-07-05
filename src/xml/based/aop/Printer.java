package xml.based.aop;

public class Printer {
	
	public Printer(){
		
	}
	
	
	public static void print(){
		System.out.println("We are inside printer");
	}

	public void printing(Object generatedObject){
		System.out.println("We are inside printer.printing() ==> "+generatedObject.getClass());
	}
	
	
//	public void print(){
//		System.out.println("We are inside printer ==> "+Printer.class);
//	}
	
}
