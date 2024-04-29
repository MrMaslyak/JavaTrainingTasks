public class Tasks {
    public static void main(String[] args) {
        task1(1);
        task1(0);
        task1(-3);
        System.out.println("----------------");
        task2(1);
        task2(0);
        task2(-3);
        System.out.println("----------------");
        task3(1);
        task3(0);
        task3(-3);
        System.out.println("----------------");
        task4(1);
        task4(0);
        task4(-3);
        System.out.println("----------------");
        task5(1);
        task5(0);
        task5(-3);
        System.out.println("----------------");
        task6(1);
        task6(0);
        task6(-3);
        System.out.println("----------------");
     task7("test");
        task7("тест");
        task7(String.valueOf(3));
        System.out.println("----------------");
        task8("1");
        task8(String.valueOf(1));
        task8(String.valueOf(3));
        System.out.println("----------------");
        task9(true);
        task9(false);
        System.out.println("----------------");
        task9short(true);
        task9short(false);
        System.out.println("----------------");
        task10(true);
        task10(false);
        System.out.println("----------------");
        task10short(true);
        task10short(false);
        System.out.println("----------------");
        task11(5);
        task11(0);
        task11(-3);
        task11(2);
        System.out.println("----------------");
        task12(5);
        task12(0);
        task12(-3);
        task12(2);
        System.out.println("----------------");
        task13(1,3);
        task13(0,6);
        task13(3,5);
        System.out.println("----------------");
        task14(5,7);
        task14(0,6);
        task14(1,1);
        System.out.println("----------------");
        task15(3);
        System.out.println("----------------");
        task16(22);
        task16(12);
        task16(31);
        task16(1);
        System.out.println("----------------");
        task17(1);
        task17(12);
        task17(15);
        task17(4);
        System.out.println("----------------");
    }

    public static  void  task1 (int a){
        if(a==0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static  void  task2 (int a){
        if(a>0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static  void  task3 (int a){
        if(a<0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static  void  task4 (int a){
        if(a>=0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static  void  task5 (int a){
        if(a<=0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static  void  task6 (int a){
        if(a!=0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static  void  task7 (String a){
        if(a.equals ("test")){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static void task8(String a) {
        if (a == "1") {
            System.out.println("Верно");
        } else {
            System.out.println("Неверно");
        }
    }
    public static void task9(boolean test ){
        if (test) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
    public static void task9short(boolean test ){
        System.out.println(test ? "Верно" : "Неверно");
    }
    public static void task10(boolean test ){
        if (!test) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
    public static void task10short(boolean test ){
        System.out.println(!test ? "Верно" : "Неверно");
    }
    public static  void  task11 (int a){
        if(a>0 && a<5){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static  void  task12 (double a){
        if(a == 0 || a==2){
            System.out.println(a+7);
        }else {
            System.out.println(a/10);
        }
    }
    public static  void  task13 (int a, int b){
        if(a<=1 && b>=3){
            System.out.println(a+b);
        }else {
            System.out.println(a-b);
        }
    }
    public static  void  task14 (int a, int b){
        if(a>2 && a<11 || b>=6 && b<14){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
    public static  void  task15 (int num){
        switch (num){
            case 1 :
                System.out.println("зима");
                break;
            case 2 :
                System.out.println("весна");
                break;
            case 3 :
                System.out.println("лето");
                break;
            case 4 :
                System.out.println("осень");
                break;
        }
    }
    public static void  task16(int day) {
        if (day >= 1 && day < 10) {
            System.out.println("1 decada");
        } else if (day >= 11 && day < 20) {
            System.out.println("2 decada");
        }
        else if (day >= 20 && day < 30) {
            System.out.println("3 decada");
        }else if (day >= 30 && day <=32) {
            System.out.println("4 decada");
        } else {
            System.out.println("We haven`t day > 32");
        }
    }
    public static void  task17(int month) {
        if (month >= 1 && month <= 3) {
            System.out.println("зима");
        } else if (month >= 4 && month <= 6) {
            System.out.println("весна");
        }
        else if (month >= 7 && month <= 9) {
            System.out.println("лето");
        }else if (month >= 10 && month <=12) {
            System.out.println("осень");
        }else {
            System.out.println("We haven`t > 12 month");
        }
    }
}
