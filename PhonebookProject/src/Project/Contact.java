package Project;

public class Contact {
	private String firstName;
	private String lastName;
	private String telephoneNumber;
	private String middleName;
	private Address address;

	public Contact(String firstName, String lastName, String telephoneNumber, String middleName, Address address) {

		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephoneNumber = telephoneNumber;
		this.middleName = middleName;
		this.address = address;

	}

	public Contact() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact:" + " First Name: " + firstName + " Last Name: " + lastName + " Telephone Number: " + telephoneNumber + "\n" + address.toString();
	}
}
