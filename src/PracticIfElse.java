
import java.util.Scanner;

public class PracticIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String User1 = "Alex";
        String User2 = "Jack";
        String User3 = "Freddy";
        String User4 = "Andrew";
        String User5 = "John";
        String InfUser1 = User1 + " - Junior Java Developer";
        String InfUser2 = User2 + " - Senior Python Developer";
        String InfUser3 = User3 + " - Middle Java Developer";
        String InfUser4 = User4 + " - TeamLead C++ Developer";
        String InfUser5 = User5 + " - Senior Puthon Developer";
        String Rank1 = "Admin";
        String Rank2 = "Redactor";
        String Rank3 = "Supporter";
        String task1 = User1 + " - What are your plans for the future in Java?";
        String task2 = User2 + " - What is your plan to become a lead by the end of the year?";
        String task3 = User3 + " - How will you help a junior rise in level?";
        String task4 = User4 + " - Would you like to improve your salary further?";
        String task5 = User5 + " - Will you team up with a second Python developer? to improve teamwork";
        FullRanksCompany(Rank1, Rank2, Rank3);
        System.out.print("Enter your rank: ");
        String rank = scanner.nextLine();
        System.out.print("Enter your password: ");
        int pass = scanner.nextInt();
        if (rank.equals("Admin") && pass == 12345) {
            System.out.println("Welcome Admin! ");
            FullInformationList(InfUser1, InfUser2, InfUser3, InfUser4, InfUser5);
        }  else if   (rank.equals("Redactor") && pass == 56789) {
            System.out.println("Welcome Redactor! ");
            FullUsersList(User1, User2, User3, User4, User5);
        }else if   (rank.equals("Supporter") && pass == 901901) {
            System.out.println("Welcome Supporter! ");
            SupporterQuetionsCompany(task1, task2, task3, task4, task5);
        }
        else {
            System.out.println("Not Correct, please enter correct information");
        }
    }

    public static void FullRanksCompany (String Rank1, String Rank2,String Rank3 ){
        String rank1 = Rank1;
        String rank2 = Rank2;
        String rank3 = Rank3;
        System.out.println("What is your role in the company?");
        System.out.println(rank1);
        System.out.println(rank2);
        System.out.println(rank3);
    }

    public static void SupporterQuetionsCompany(String task1, String task2, String task3, String task4, String task5){
String Task1 = task1;
        String Task2 = task2;
        String Task3 = task3;
        String Task4 = task4;
        String Task5 = task5;
        System.out.println("Ask the team questions");
        System.out.println(Task1);
        System.out.println(Task2);
        System.out.println(Task3);
        System.out.println(Task4);
        System.out.println(Task5);

    }
public static void FullInformationList(String InfUser1, String InfUser2, String InfUser3, String InfUser4, String InfUser5){
        String Welcome = "Here is the full information user list:";
        String JuniorPay = "600$";
    String MiddlePay = "1750$";
    String SeniorPay = "3000$";
    String TeamLeadPay = "6000$";
        String FullListUsers = InfUser1 + " " + JuniorPay + "\n" +  InfUser2 + " " +  SeniorPay + "\n" +InfUser3  + " " + MiddlePay + "\n" +InfUser4 + " " + TeamLeadPay + "\n" +InfUser5 + " " + SeniorPay;
    System.out.println(Welcome + "\n" + FullListUsers);

}
    public static void FullUsersList(String User1, String User2, String User3, String User4, String User5) {
        String Welcome = "Here is the full user list: ";
        System.out.println(Welcome);
        System.out.println(User1);
        System.out.println(User2);
        System.out.println(User3);
        System.out.println(User4);
        System.out.println(User5);
    }
}
