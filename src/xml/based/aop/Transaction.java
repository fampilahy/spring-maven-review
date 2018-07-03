package xml.based.aop;

public class Transaction {

	private int id;

	private String description;

	public int getId() {
		System.out.println("Inside getId() "+id); 
		return id;
	}

	public String getDescription() {
		System.out.println("Inside getDescription() "+description); 
		return description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Transaction() {

	}

	public void printException() throws IllegalArgumentException {
		System.out.println("Exception raised up");
		throw new IllegalArgumentException();
	}

}
