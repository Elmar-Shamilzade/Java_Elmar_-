package Homwerk;

import java.util.Scanner;

public class MyPet {

    int id = 5;


    String name;

     String type;

    double price;

     int ageRestriction;

     int customerAge;

    double MyMoney;



    void mypet_info() {

        System.out.println( "Имя" + "."+ name);

        System.out.println( "  Порода"+ "." + type);

        System.out.println("Цена" + "." + price);

        System.out.println( "Возрост" + "." + ageRestriction);

        System.out.println( " Ваш возрост" + "." + customerAge);

          System.out.println("У вас у вас не хватает денег " + MyMoney + "$")

        if (customerAge < ageRestriction) {

            System.out.println(" Вам " + customerAge + "лет.Я тепе его не продам");

        } else if (MyMoney < price) {

            System.out.println("У вас мало денг :(");

        }else{

            System.out.println("На твой петомиц");
             }
                  }

           }