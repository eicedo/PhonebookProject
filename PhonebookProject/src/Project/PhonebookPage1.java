package Project;
import java.util.Scanner;


public class PhonebookPage1 {

	public static void main(String[] args) {
		//instantiate a new directory, phone book methods and scanner
		Directory directory = new Directory();
		//PhonebookMethods phonebookMethods = new PhonebookMethods();
		Scanner input = new Scanner(System.in);
		int question = 0;
		while (question != 11) {
			question = menu();
			switch (question) {

			case 1:
				
				System.out.println("Add an entry: ");
				
				System.out.println("Enter first name: ");
				String firstName = input.nextLine();
				System.out.println("Enter middle initial: ");
				String middleName = input.nextLine();
				System.out.println("Enter last name: ");
				String lastName = input.nextLine();
				System.out.println("Enter telephone number: ");
				String telephoneNumber = input.nextLine();
				System.out.println("Enter street number: ");
				String street = input.nextLine();
				System.out.println("Enter city: ");
				String city = input.nextLine();
				System.out.println("Enter state: ");
				String state = input.nextLine();
				System.out.println("Enter zip code: ");
				String zipCode = input.nextLine();
		
				//setting address model
				Address address = new Address(); 
				address.setCity(city);
				address.setState(state);
				address.setStreet(street);
				address.setZipCode(zipCode);
				
				//setting contact model
				Contact contact = new Contact();
				contact.setFirstName(firstName);
				contact.setLastName(lastName);
				contact.setMiddleName(middleName);
				contact.setTelephoneNumber(telephoneNumber);
				contact.setAddress(address);
				//contact.setFullName(fullName.toUpperCase());
				//adding the contact to the directory model
				directory.addContact(contact);
				System.out.println("\n");
				
				break;

			case 2:
				
				System.out.println("Update an existing contact: ");
				System.out.println("Enter current phone number: ");
				String updatedNumber = input.nextLine();
				directory.updateAContact(updatedNumber);
				System.out.println("\n");
				
				break;

			case 3:

				System.out.println("Delete a contact: ");
				System.out.println("Enter a phone number: ");
				String contactNumber = input.nextLine();
				directory.deleteAContact(contactNumber);
				System.out.println("\n");
				
				break;
			case 4:

				System.out.println("Search by first name: ");
				System.out.println("Enter first name: ");
				String firstNameInput = input.nextLine();
				Contact[] people = directory.searchByFirstName(firstNameInput);
				directory.printRecords(people);
				System.out.println("\n");
				
				break;
			case 5:

				System.out.println("Search by last name: ");
				System.out.println("Enter last name: ");
				String lastNameInput = input.nextLine();
				Contact[] people2 = directory.searchByLastName(lastNameInput);
				directory.printRecords2(people2);
				System.out.println("\n");
				
				break;

			case 6:
				System.out.println("Search by full name: ");
				System.out.println("Enter full name: ");
				String fullNameInput = input.nextLine();
				Contact[] people3 = directory.searchByFullName(fullNameInput); 
				directory.printRecords(people3);
				System.out.println("\n");
				
				break;
				
			case 7:

				System.out.println("Search by city: ");
				System.out.println("Enter city: ");
				String cityInput = input.nextLine();
				Contact[] unit = directory.searchByCity(cityInput);
				directory.printRecords5(unit);
				System.out.println("\n");
				
				break;
			
			case 8:

				System.out.println("Search by state: ");
				System.out.println("Enter state: ");
				String stateInput = input.nextLine().toUpperCase();
				Contact[] unit1 = directory.searchByState(stateInput);
				directory.printRecords5(unit1);
				System.out.println("\n");
				
				break;
			
			case 9:

				System.out.println("Search by telephone number: ");
				System.out.println("Enter telephone number: ");
				String telephoneNumberInput = input.nextLine();
				Contact[] telephone = directory.searchByTelephoneNumber(telephoneNumberInput);
				directory.printRecords4(telephone);
				System.out.println("\n");
				
				break;
			
			case 10:

				System.out.println("Show all records alphabetically: ");
				directory.sortAllContactsAscending();
				directory.printRecords(directory.getContacts());
				System.out.println("\n");
				
				break;
			
			case 11:

				System.out.println("Goodbye");
				break;
				
			default:
				
				System.out.println("Please enter a number 1-10");
				input.close();
				break;
			}
		}
	}

	public static int menu() {
		Scanner questionInput = new Scanner(System.in);
		System.out.println("Constellation Phone Book");
		System.out.println("Select Case Number: ");
		System.out.println("1 - Select 1 to add an entry");
		System.out.println("2 - Select 2 to update an entry");
		System.out.println("3 - Select 3 to delete a contact");
		System.out.println("4 - Select 4 to search by first name");
		System.out.println("5 - Select 5 to search by last name");
		System.out.println("6 - Select 6 to search by full name");
		System.out.println("7 - Select 7 to search by city");
		System.out.println("8 - Select 8 to search by state");
		System.out.println("9 - Select 9 to search by telephone number");
		System.out.println("10 - Select 10 to show directory alphabetically");
		System.out.println("11 - Select 11 to Exit");
		System.out.println("                          ");

		int question = questionInput.nextInt();
		System.out.println();
		
		return question;
		
	}
}
