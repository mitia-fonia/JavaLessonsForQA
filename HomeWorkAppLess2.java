package java1.lessonsforqa.lesson2;

import java.util.Scanner;

public class HomeWorkAppLess2 {

    public static void main(String[] args) {
        boolean sum = checkSum();
        System.out.println(sum);
        checkPositive();
        boolean neg = checkNegative();
        System.out.println(neg);
        printLines();
        boolean year = checkYear();
        System.out.println(year);

    }

    public static boolean checkSum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a");
        int a = in.nextInt();
        System.out.println("Введите значение b");
        int b = in.nextInt();
        return (a+b >= 10) && (a+b<=20) ? true : false;
    }

    public static void checkPositive() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a");
        int a = in.nextInt();
        if (a>=0 ) {
            System.out.println("Число " + a + " положительное");
        }
        else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean checkNegative(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a");
        int a = in.nextInt();

        return a<0 ? true : false;
    }

    public static void printLines() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите жлаемое кол-во напечаташых строк");
        int a = in.nextInt();
        //System.out.println("Введите текст");
        //String b = in.nextLine(); Не могу понято почему не работает
        String b = ("Hello world!");
        for (int i=0; i<a; i++) {
            System.out.println(b);
        }
    }

    public static boolean checkYear(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a");
        int a = in.nextInt();

        return (a%4==0)&&(a%100!=0)||(a%400==0) ? true : false;
    }

}
