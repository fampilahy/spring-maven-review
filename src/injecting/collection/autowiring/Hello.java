package injecting.collection.autowiring;


public class Hello {

	private Address address;
	private Email email;
	
	
	
	public Address getAddress() {
		return address;
	}

	public Email getEmail() {
		return email;
	}

	public void setAddress(Address adress) {
		this.address = adress;
	}

	public void setEmail(Email email) {
		this.email = email;
	}



	
	
	
}
