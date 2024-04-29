public class IfElse {
    public static void main(String[] args) {
        makeday(8);
       price(74);
    }

    public static void makeday(int day) {
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("We don't have more than 7 days");
        }
    }

    public static void  price (int num){
        if (num>=90  && num<=100 ){
            System.out.println("your grade A");
        } else if (num>=75 && num<90){
            System.out.println("your grade B");
        }else if (num>=60 && num<=75){
            System.out.println("your grade C");
        }else {
            System.out.println("Your grade <C");
        }
    }
}
