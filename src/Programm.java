import java.util.Scanner;
public class Programm {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name: ");
       String UserName = scan.nextLine();
        System.out.print("Enter your SurName: ");
       String UserSurname = scan.nextLine();
        System.out.print("Enter your Location: ");
        String UserLocation = scan.nextLine();
        System.out.print("Enter your Age: ");
        int UserAge = scan.nextInt();
        scan.close();
        PassportUser(UserName, UserSurname, UserLocation,UserAge );
    }
    public static void PassportUser (String UserName, String UserSurname, String UserLocation, int UserAge){
        System.out.println("Your Passport Base");
        System.out.println("Passport User: " + UserName + " " + UserSurname);
        System.out.println("Passport Age: " + UserAge);
        System.out.println("Passport Location: " + UserLocation);

    }
}
