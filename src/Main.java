import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static boolean godVisocosniy(int year){
        boolean b = true;
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            b = true;
        }
        else{
            b = false;
        }
        return b;
    }
    public static int deliveryTime(int range){
        int time = 0;
        if(range<20){
            time = 1;
        } else if (range<60) {
            time = 2;
        } else if (range<100) {
            time = 3;
        }
        return time;
    }
    public static int printTaskNumber(int i){
        System.out.println("//ЗАДАЧА" + i);
        i+=1;
        return i;
    }

    public static void versionControl(int polzovatelYear, int appleAndroid){
        int currentYear = LocalDate.now().getYear();
        if(currentYear>polzovatelYear){
            System.out.print("Установите облегченную версию приложения для ");
        }
        if(appleAndroid == 1){
            System.out.println("Android по ссылке");
        }
        else{
            System.out.println("iOS по ссылке");
        }
    }

    public static void task1(){
        int i = 1;
        i = printTaskNumber(i);
        int year = 2021;
        System.out.print(year);
        if(godVisocosniy(year)){
            System.out.println(" год - високосный год.");
        }
        else{
            System.out.println(" год - невисокосный год.");
        }
        //ЗАДАЧА2
        i = printTaskNumber(i);
        versionControl(2015,0);
        //ЗАДАЧА3
        i = printTaskNumber(i);
        int deliveryDistance = 95;
        int dt = deliveryTime(deliveryDistance);
        if(dt!=0){
            System.out.println("Потребуется дней: " + dt);
        }
        else{
            System.out.println("Доставки нет");
        }
    }
}