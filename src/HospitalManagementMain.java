import java.util.Scanner;

public class HospitalManagementMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Hospital Management");
        Scanner sc = new Scanner(System.in);

        HospitalManagement details = new HospitalManagement();

        int choice = 1;
        while (choice == 1){
            System.out.println("Choose One of the Given Choices as per Requirement: ");
            System.out.println("1.Add Details\n2.Display Details\n0.Exit");

            switch (sc.nextInt()){
                case 1:
                    details.addDetails();
                    break;
                    case 2:
                    details.display();
                    break;
                default:
                    choice = 0;
            }
        }
    }
}