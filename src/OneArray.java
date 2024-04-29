import java.util.Scanner;

public class OneArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter numbers: ");
            int value = scan.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < i){
                min = arr[i];
                System.out.print("Minimal: " + min);
            }
        }
    }
}
