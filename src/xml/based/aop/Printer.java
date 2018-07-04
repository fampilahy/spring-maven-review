package xml.based.aop;

public class Printer {
	
	public Printer(){
		
	}
	
	
//	public static void print(){
////		System.out.println("We are inside printer");
//	}

	public static void print(Object obj){
		System.out.println("We are inside printer ==> "+obj.getClass());
	}
	
}
