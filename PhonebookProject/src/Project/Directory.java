package Project;

import java.util.Scanner;

public class Directory {

	private Contact[] contacts = new Contact[0];

	public Contact[] getContacts() {
		return contacts;
	}

	public void setContacts(Contact[] contacts) {
		this.contacts = contacts;
	}

	public void addContact(Contact contact) {
		// getting our current array of contacts from directory model and assign to
		// variable

		// create a updated contact array
		Contact[] updatedContacts = new Contact[contacts.length + 1];
		// add contacts from the original array to the updated array.
		for (int i = 0; i < contacts.length; i++) {
			updatedContacts[i] = contacts[i];
		}
		// now we have every element from original array
		// add the new contact to the end of the updated array
		updatedContacts[updatedContacts.length - 1] = contact;
		contacts = updatedContacts;
		System.out.println("Contact created!");

	}

	public Contact[] searchByFirstName(String firstName) {
		int count = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getFirstName().toLowerCase().equals(firstName.toLowerCase())) {
				count++;
			}
		}
		Contact[] tempArray = new Contact[count];
		int index = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getFirstName().toLowerCase().equals(firstName.toLowerCase())) {
				tempArray[index] = contacts[i];
				index++;

			}
		}
		return tempArray;
	}

	public Contact[] searchByLastName(String lastName) {
		int count = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				count++;
			}
		}
		Contact[] tempArray = new Contact[count];
		int index = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				tempArray[index] = contacts[i];
				index++;

			}
		}
		return tempArray;
	}

	public Contact[] searchByFullName(String fullName) {
		String[] splitFullName = splitFullName(fullName);
		String firstName = splitFullName[0];
		String lastName = splitFullName[1];
		
		int count = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getFirstName().toLowerCase().equals(firstName.toLowerCase()) && 
					contacts[i].getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				count++;
			}
		}
		Contact[] tempArray = new Contact[count];
		int index = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getFirstName().toLowerCase().equals(firstName.toLowerCase()) && 
					contacts[i].getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				tempArray[index] = contacts[i];
				index++;

			}
		}
		return tempArray;

	}

	public Contact[] searchByTelephoneNumber(String telephoneNumber) {
		int count = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getTelephoneNumber().equals(telephoneNumber)) {
				count++;
			}
		}
		Contact[] tempArray = new Contact[count];
		int index = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getTelephoneNumber().equals(telephoneNumber.toLowerCase())) {
				tempArray[index] = contacts[i];
				index++;

			}
		}
		return tempArray;
	}

	public Contact[] searchByCity(String city) {

		int count = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getAddress().getCity().toLowerCase().equals(city.toLowerCase())) {
				count++;
			}
		}
		Contact[] tempArray = new Contact[count];
		int index = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getAddress().getCity().toLowerCase().equals(city.toLowerCase())) {
				tempArray[index] = contacts[i];
				index++;
			}
		}
		return tempArray;
	}
	
	public Contact[] searchByState(String state) {

		int count = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
				count++;
			}
		}
		Contact[] tempArray = new Contact[count];
		int index = 0;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
				tempArray[index] = contacts[i];
				index++;
			}
		}
		return tempArray;
	}
	
	public void deleteAContact(String telephoneNumber) {
		// get current contacts array from the directory model
		Contact[] contacts = getContacts();
		// get contact with input number
		Contact contact = searchByTelephoneNumber(telephoneNumber)[0];
		// create a new contact array without the contact with the input number
		Contact[] updatedContacts = new Contact[contacts.length - 1];
		// traversing through current contacts
		for (int i = 0; i < contacts.length; i++) {
			Contact currContact = contacts[i];
			// add all contacts to our new updated contacts that are not the
			// contact with the input number
			if (currContact.equals(contact)) {
				continue;
			} else {
				updatedContacts[i] = currContact;
			}
		}
		System.out.println("Contact Deleted");
		// set our current contacts array to the updated contacts in directory model
		setContacts(updatedContacts);
		System.out.println("Updated Contacts Below");
		printRecords(updatedContacts);
	}

	public void updateAContact(String telephoneNumber) {
		// get contact by searching directory w/phone number
		Contact contact = searchByTelephoneNumber(telephoneNumber)[0];
		// ask user for new number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter new number: ");
		String newNumber = input.nextLine();
		// set current contact model number to the new given number
		System.out.println(contact.getFirstName() + "'s old number is: " + contact.getTelephoneNumber());
		contact.setTelephoneNumber(newNumber);
		System.out.println(contact.getFirstName() + " is updated to: " + contact.getTelephoneNumber());
		
	}

	public void sortAllContactsAscending() {

		for (int i = 0; i < contacts.length; i++) {
			for (int k = i + 1; k < contacts.length; k++) {
				if (contacts[i].getFirstName().compareTo(contacts[k].getFirstName()) > 0) {
					Contact person = new Contact();
					person = contacts[i];
					contacts[i] = contacts[k];
					contacts[k] = person;
				}
			}
		}
	}

	public void printRecords(Contact[] people) {

		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].toString());
		}
	}

	public void printRecords2(Contact[] people2) {

		for (int i = 0; i < people2.length; i++) {
			System.out.println(people2[i].toString());
		}
	}

	public void printRecords3(Contact[] people3) {

		for (int i = 0; i < people3.length; i++) {
			System.out.println(people3[i].toString());
		}
	}

	public void printRecords4(Contact[] telephone) {

		for (int i = 0; i < telephone.length; i++) {
			System.out.println(telephone[i].toString());
		}
	}

	public void printRecords5(Contact[] unit) {

		for (int i = 0; i < unit.length; i++) {
			System.out.println(unit[i].toString());
		}
	}
	
	public void printRecords6(Contact[] unit1) {

		for (int i = 0; i < unit1.length; i++) {
			System.out.println(unit1[i].toString());
		}
	}

	public String[] splitFullName(String fullName) {
		String[] result = fullName.split(" ");
		return result;
	}

}
