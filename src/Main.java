public class Main {

            //ЗАДАЧА1
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        int ageMax = 20;
        int ageMin = 15;
        if (ageMax < 18) {
            System.out.println("Если возраст человека равен " + ageMax + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + ageMax + ", то он совершеннолетний.");
        }
        ;
        if (ageMin < 18) {
            System.out.println("Если возраст человека равен " + ageMin + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + ageMax + ", то он совершеннолетний.");
        }
        ;
                    //ЗАДАЧА2
        System.out.println("ЗАДАЧА 2");
        int tempLessThanFive = 0;
        int tempMoreThanFive = 7;
        System.out.println("На улице " + tempMoreThanFive + " градусов.");
        if (tempMoreThanFive <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
        System.out.println("На улице " + tempLessThanFive + " градусов.");
        if (tempLessThanFive <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
                        //ЗАДАЧА3
        System.out.println("ЗАДАЧА 3");
        int speedLessThanSixty = 50;
        int speedMoreThanSixty = 72;
        if (speedMoreThanSixty > 60) {
            System.out.println("Если скорость " + speedMoreThanSixty + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedMoreThanSixty + ", то можно ездить спокойно.");
        }
        ;
        if (speedLessThanSixty > 60) {
            System.out.println("Если скорость " + speedLessThanSixty + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedLessThanSixty + ", то можно ездить спокойно.");
        }
        ;
            //ЗАДАЧА4
        System.out.println("ЗАДАЧА 4");
        int ageLessThanSix = 4;
        int ageLessThanSeventeen = 14;
        int ageLessThanTwentyFour = 20;
        int ageMoreThanTwentyFour = 30;
        int age = ageLessThanSix;
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if ((age <= 6) && (age >= 2)) {
            System.out.println("в детский сад.");
        } else if ((age > 6) && (age <= 17)) {
            System.out.println("в школу.");
        } else if ((age >= 18) & (age <= 24)) {
            System.out.println("в университет.");
        } else if (age >= 24) {
            System.out.println("на работу.");
        }
        ;
        age = ageLessThanSeventeen;
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if ((age <= 6) && (age >= 2)) {
            System.out.println("в детский сад.");
        } else if ((age > 6) && (age <= 17)) {
            System.out.println("в школу.");
        } else if ((age >= 18) & (age <= 24)) {
            System.out.println("в университет.");
        } else if (age >= 24) {
            System.out.println("на работу.");
        }
        ;
        age = ageLessThanTwentyFour;
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if ((age <= 6) && (age >= 2)) {
            System.out.println("в детский сад.");
        } else if ((age > 6) && (age <= 17)) {
            System.out.println("в школу.");
        } else if ((age >= 18) & (age <= 24)) {
            System.out.println("в университет.");
        } else if (age >= 24) {
            System.out.println("на работу.");
        }
        ;
        age = ageMoreThanTwentyFour;
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if ((age <= 6) && (age >= 2)) {
            System.out.println("в детский сад.");
        } else if ((age > 6) && (age <= 17)) {
            System.out.println("в школу.");
        } else if ((age >= 18) & (age <= 24)) {
            System.out.println("в университет.");
        } else if (age >= 24) {
            System.out.println("на работу.");
        }
        ;
        //ЗАДАЧА5
        System.out.println("ЗАДАЧА 5");
        int ageLessThanFive = 4;
        int ageLessThanFourteen = 12;
        int ageMoreThanFourteen = 20;
        age = ageLessThanFive;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого.");
        };
        age = ageLessThanFourteen;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого.");
        };age = ageMoreThanFourteen;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого.");
        };
        //ЗАДАЧА6
        System.out.println("ЗАДАЧА 6");
        int colvoMest = 102;
        int colvoSidych = 60;
        int mnogoZanyt = 70;
        int maloZanyt = 30;
        int ochenMnogoZanyt = 130;
        int colichestvoZanytMest = maloZanyt; 
        if(colichestvoZanytMest>colvoMest){
            System.out.println("Места нет. Вагон забит.");
        } else if (colichestvoZanytMest>colvoSidych) {
            System.out.println("Место есть. Место стоячее.");
        } else if (colichestvoZanytMest<colvoSidych) {
            System.out.println("Место есть. Место сидячее.");
        };
        colichestvoZanytMest = mnogoZanyt;
        if(colichestvoZanytMest>colvoMest){
            System.out.println("Места нет. Вагон забит.");
        } else if (colichestvoZanytMest>colvoSidych) {
            System.out.println("Место есть. Место стоячее.");
        } else if (colichestvoZanytMest<colvoSidych) {
            System.out.println("Место есть. Место сидячее.");
        };
        colichestvoZanytMest = ochenMnogoZanyt;
        if(colichestvoZanytMest>colvoMest){
            System.out.println("Места нет. Вагон забит.");
        } else if (colichestvoZanytMest>colvoSidych) {
            System.out.println("Место есть. Место стоячее.");
        } else if (colichestvoZanytMest<colvoSidych) {
            System.out.println("Место есть. Место сидячее.");
        };
        //ЗАДАЧА 7
        System.out.println("ЗАДАЧА 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if(one>two){
            if(one>three){
                System.out.println("one Больше всех. Оно равно " + one);
            }else {
                System.out.println("two Больше всех. Оно равно "+ two);
            }
        } else if (three>two) {
            System.out.println("three Больше всех. Оно равно " + three);
        }else {
            System.out.println("two Больше всех. Оно равно "+ two);
        }
    }
}