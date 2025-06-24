package Homwerk;



public class MyMathClass {

    String myName = "Elmar";

    int myClass = 8;



    String friendName = "Zakir";

    int friendClass = 9;



    void aboutMe() {

        System.out.println("Я " + myName + ", учусь в " + myClass + " классе");

    }



    void aboutFriend() {

        System.out.println("Мой друг " + friendName + ", он в " + friendClass + " классе");

    }



    public static void main(String[] args) {

        MyMathClass me = new MyMathClass();

        me.aboutMe();

        me.aboutFriend();



        // Делаем математику

        double x = 25.0;

        double y = -4.7;

        double z = 2.5;



        // Корень

        int root = 0;

        while(root * root <= x) {

            root++;

        }

        System.out.println("\nКорень из 25 примерно " + (root-1));



        // Модуль

        double absY = y;

        if(y < 0) absY = -y;

        System.out.println("Модуль -4.7 это " + absY);



        // Куб

        double cube = z;

        cube = cube * z * z;

        System.out.println("2.5 в кубе = " + cube);



        // Минимум и максимум

        if(x < z) {

            System.out.println("25 меньше чем 2.5? Серьезно?");

        } else {

            System.out.println("Из 25 и 2.5 меньшее: " + z);

        }



        System.out.println("А большее: " + x);



        // Округление

        System.out.println("-4.7 округлено вниз: " + (int)y);

        System.out.println("-4.7 округлено вверх: " + (int)(y + 0.999));

        System.out.println("-4.7 по правилам: " + (int)(y + 0.5));



        // Случайное число

        double randNum = 0;

        for(int i = 0; i < 3; i++) {

            randNum = Math.random();

        }

        System.out.println("Случайное число: " + randNum);



        // Проверка

        if((root-1) != 5) {

            System.out.println("Корень посчитан неверно!");

        }

    }

}