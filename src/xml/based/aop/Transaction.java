package xml.based.aop;

public class Transaction {

	private int id;

	private String description;

	public int getId() {
		return id;
	}

	public String getDescription() {
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
	
	public void printException(){
		System.out.println("Exception raised up");
		throw new IllegalArgumentException();
	}

}
