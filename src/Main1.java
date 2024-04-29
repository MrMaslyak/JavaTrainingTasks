import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your passworld Andrew");
        int andrewPassworld = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Your Login Andrew");
        String andrewLogin = scan.nextLine();
//        scan.nextLine();
        System.out.println("Enter Your passworld Alex");
        int alexPassworld = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Your Login Alex");
        String alexLogin = scan.nextLine();
        HowCreateSteamAcc(andrewPassworld, andrewLogin, alexPassworld, alexLogin);

    }

    public static void HowCreateSteamAcc(int UserPassword, String UserLogin, int UserPassword1, String UserLogin1) {
String task1 = "Open Steam";
String task2 = "Enter your passworld and login";
String task3 = UserPassword + " " + UserLogin;
        String task4 = UserPassword1 + " " + UserLogin1;
        String task5 = "Nice! You open your Steam account";
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);
        System.out.println(task5);
    }
}
