package java1.lessonsforqa.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkAppLess3 {

    public static void main(String[] args){
        System.out.println(Arrays.toString(changeNumbers(10)) + "\n ______________________________________________________________");
        System.out.println(Arrays.toString(array100(100)) + "\n ______________________________________________________________");
        System.out.println(Arrays.toString(multiplyTheArray()) + "\n ______________________________________________________________");
        squareMatrix(8);
        System.out.println("______________________________________________________________");
        System.out.println(Arrays.toString(arrayWithLenElements())+ "\n ______________________________________________________________");
        minMax(10);
        System.out.println("______________________________________________________________");
        boolean parts = sumOfParts(6);;
        System.out.println(parts);
    }
    public static int[] changeNumbers(int count){
        Random rand = new Random();
        int newArray[]= new int[count];
        for (int i=0; i< count; i++){
            newArray[i]=rand.nextInt(2);
        }
        System.out.println(Arrays.toString(newArray));
        for (int i=0; i< count; i++){
            if (newArray[i] == 0){
                newArray[i] = 1;
            }
            else newArray[i] = 0;
        }
        return newArray;
    }
    public static int[] array100(int count){

        int newArray[]= new int[count];
        for (int i=0; i< count; i++){
            newArray[i]=i+1;
        }
        return newArray;
    }
    public static int[] multiplyTheArray() {
        int newArray[]={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(newArray));
        for (int i=0; i< newArray.length; i++){
            if(newArray[i]<6){
                newArray[i]=newArray[i]*2;;
            }
        }
        return newArray;
    }
    public static void squareMatrix(int count){
        int[][] table = new int[count][count];
        for (int i=0;i < count;i++){
            for (int j = 0; j < count; j++){
                if ((i == j)||(i + j == count - 1)) table[i][j]=1;
                else table[i][j]=0;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrayWithLenElements(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива");
        int len = in.nextInt();
        System.out.println("Введите заполнение массива");
        int initialValue = in.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }

    public static void minMax(int count){
        Random rand = new Random();
        int newArray[]= new int[count];
        int min = 20;
        int max = 0;
        for (int i=0; i< count; i++){
            newArray[i]=rand.nextInt(20);
            if (newArray[i]<min){
                min=newArray[i];
            }
            if (newArray[i]>max){
                max=newArray[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println("Минимальное число в массиве " + min + ", а максимальное " + max);
    }

    public static boolean sumOfParts(int count){
        Random rand = new Random();
        int newArray[]= new int[count];
        int leftPart = 0;
        int rightPart = 0;
        for (int i=0; i< count; i++){
            newArray[i]=rand.nextInt(3);
        }
        System.out.println(Arrays.toString(newArray));
        for (int i=0; i< count-1; i++){
            System.out.println("Шаг " + (i+1));
            leftPart = 0;
            rightPart = 0;
            for(int j=0;j<=i;j++ ){
                leftPart=leftPart+newArray[j];
            }

            for(int k=i+1;k<count;k++ ){
                rightPart=rightPart+newArray[k];
            }
            System.out.println(leftPart +" " +rightPart);
//
        }
        return leftPart == rightPart ? true : false;
    }
}
