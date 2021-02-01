package com.academy.lecture06;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        //задача 1
        String weekDay;
        Scanner scanner = new Scanner(System.in);
        int name = scanner.nextInt();

        switch (name) {

            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;

            default:
                weekDay = "Unknown week day";
        }
        System.out.println("The week day is " + weekDay);


        //задача 2
        String myString = "Въведете дължина на правоъгълника";
        System.out.println(myString);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();

        String myString1 = "Въведете височина на правоъгълника";
        System.out.println(myString1);
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner.nextInt();

        int c = (a + b) * 2;
        int d = a * b;

        System.out.println("Обиколката на правоъгълника е " + c);
        System.out.println("Лицето на правоъгълника е " + d);


        //задача 3 - За съжаление не се сещам кой оператор да изпползвам :(

        //задача 4
        String myString2 = "Въведете първото число";
        System.out.println(myString2);
        Scanner scanner3 = new Scanner(System.in);
        int e = scanner.nextInt();

        String myString3 = "Въведете второто число";
        System.out.println(myString3);
        Scanner scanner4 = new Scanner(System.in);
        int f = scanner.nextInt();

        String myString4 = "Въведете третото число";
        System.out.println(myString4);
        Scanner scanner5 = new Scanner(System.in);
        int g = scanner.nextInt();

        if (e > f && e > g) {
            System.out.println("Най-голямото въведено число е " + e);
        } else if (e > f && e < g) {
            System.out.println("Най-голямото въведено число е " + g);
        } else if (e < f && f < g) {
            System.out.println("Най-голямото въведено число е " + g);
        } else if (e < f && f > g) {
            System.out.println("Най-голямото въведено число е " + f);
        }
    }

}
