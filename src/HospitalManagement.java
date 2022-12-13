import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {

    ArrayList<Contacts> personDetails = new ArrayList<Contacts>();
    Contacts contacts = new Contacts(null, null, null, null, null, null, 0, 0);
    Scanner sc = new Scanner(System.in);


    public void addDetails() {

        System.out.println("Enter the first name: ");
        String firstName = sc.next();
        System.out.println("Enter the last name: ");
        String lastName = sc.next();
        System.out.println("Enter the address: ");
        String address = sc.next();
        System.out.println("Enter the city: ");
        String city = sc.next();
        System.out.println("Enter the state: ");
        String state = sc.next();
        System.out.println("Enter the email: ");
        String emailId = sc.next();
        System.out.println("Enter the zip code: ");
        int zip = sc.nextInt();
        System.out.println("Enter the phone number: ");
        long phoneNumber = sc.nextLong();

        contacts = new Contacts(firstName, lastName, address, city, state, emailId, zip, phoneNumber);
        personDetails.add(contacts);
    }

    public void display() {
        System.out.println(personDetails);
    }

}