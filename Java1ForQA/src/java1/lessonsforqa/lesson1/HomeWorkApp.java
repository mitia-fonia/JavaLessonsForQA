package java1.lessonsforqa.lesson1;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWord();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWord() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    public static void checkSumSign(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a");
        int a = in.nextInt();
        System.out.println("Введите значение b");
        int b = in.nextInt();
        if ((a+b)>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение value");
        int value = in.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a");
        int a = in.nextInt();
        System.out.println("Введите значение b");
        int b = in.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
