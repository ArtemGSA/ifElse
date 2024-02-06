public class Main {

    //ЗАДАЧА1
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        int age = 15;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        //ЗАДАЧА2
        System.out.println("ЗАДАЧА 2");
        int currentTemp = 6;
        System.out.println("На улице " + currentTemp + " градусов.");
        if (currentTemp <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
        //ЗАДАЧА3
        System.out.println("ЗАДАЧА 3");
        int currentSpeed = 50;
        if (currentSpeed > 60) {
            System.out.println("Если скорость " + currentSpeed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + currentSpeed + ", то можно ездить спокойно.");
        }
        //ЗАДАЧА4
        System.out.println("ЗАДАЧА 4");
        age = 20;
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if ((age <= 6) && (age >= 2)) {
            System.out.println("в детский сад.");
        } else if ((age > 6) && (age <= 17)) {
            System.out.println("в школу.");
        } else if ((age >= 18) & (age <= 24)) {
            System.out.println("в университет.");
        } else if (age > 24) {
            System.out.println("на работу.");
        }        //ЗАДАЧА5
        System.out.println("ЗАДАЧА 5");
        age = 4;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого.");
        }
        //ЗАДАЧА6
        System.out.println("ЗАДАЧА 6");
        int colichestvoZanytMest = 30;
        int vsegoMest = 102;
        int sidychihMest = 60;
        if(colichestvoZanytMest>vsegoMest){
            System.out.println("Места нет. Вагон забит.");
        } else if (colichestvoZanytMest>sidychihMest) {
            System.out.println("Место есть. Место стоячее.");
        } else{
            System.out.println("Место есть. Место сидячее.");
        }
        //ЗАДАЧА 7
        System.out.println("ЗАДАЧА 7");
        int one = 7;
        int two = 6;
        int three = 8;
        if(one>two){
            if(one>three){
                System.out.println("one Больше всех. Оно равно " + one);
            }else {
                System.out.println("three Больше всех. Оно равно "+ three);
            }
        } else if (three>two) {
            System.out.println("three Больше всех. Оно равно " + three);
        }else {
            System.out.println("two Больше всех. Оно равно "+ two);
        }
    }
}