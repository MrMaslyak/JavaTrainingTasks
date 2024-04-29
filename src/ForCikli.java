import java.util.Scanner;

public class ForCikli {
    public static void main(String[] args) {

//    task1();
//        task2();
//        task3();
//        task4();
//task5();
//task6();
        task7();
    }

    public static void task1(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Element: " + i);
        }
    }
    public static void task2(){
        for (int i = 5; i >= 1; i--) {
            System.out.println("Element: " + i);
        }
    }

    public static void task3(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + 3*i);
        }
    }
    public static void task4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void task5(){
     int a = 7;
     while (a <= 98){
         System.out.println(a + 7);
        }
    }
    public static void task6(){
        int a = 1;
        while (a <= 512){
            System.out.println(a + " ");
            a*=2;
        }
    }
    public static void task7(){
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 11; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
  }

