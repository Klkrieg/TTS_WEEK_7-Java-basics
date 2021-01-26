package com.tts;
import java.util.Arrays;
import java.util.Scanner;
public class NumbersList {

  protected static int[] getArray(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter five numbers.");
    System.out.println("First Number: ");
    int num1 = input.nextInt();
    System.out.println("Second Number: ");
    int num2 = input.nextInt();
    System.out.println("Third Number: ");
    int num3 = input.nextInt();
    System.out.println("Fourth Number: ");
    int num4 = input.nextInt();
    System.out.println("Fifth Number: ");
    int num5 = input.nextInt();
    int[] intArr = {num1, num2, num3, num4, num5};
    System.out.println("Thank you. Your array is: " + Arrays.toString(intArr));
    return intArr;
  }
}
