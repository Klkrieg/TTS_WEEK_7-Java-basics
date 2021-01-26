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
  protected static void arraySum(int[] arr){
    int total = 0;
    for(int num : arr){
      total += num;
    }
    System.out.printf("The sum of your array is: %d\n", total);
  }

  protected static void arrayProduct(int[] arr){
    int total = 1;
    for(int num : arr){
      total *= num;
    }
    System.out.printf("The product of your array is: %d\n", total);
  }

  protected static void findLargestInArray(int[] arr){
    int largest = 0;
    for(int num : arr){
      if(num > largest){
        largest = num;
      }
    }
    System.out.printf("The biggest integer in your array is: %d\n", largest);
  }

  protected  static void findSmallestInArray(int[] arr){
    int smallest = 0;
    for(int num : arr){
      if(num < smallest){
        smallest = num;
      }
    }
    System.out.printf("The smallest integer in your array is: %d\n", smallest);
  }

  protected static void init(int[] arr){
    boolean isRunning = true;
    Scanner input = new Scanner(System.in);
    while(isRunning) {
      System.out.println("What operation would you like to perform on your list of number?");
      System.out.print("Sum\nProduct\nFind Largest\nFind Smallest\n");
      String answer = input.next();
      switch (answer) {
        case "sum":
        case "Sum":
          arraySum(arr);
          break;
        case "product":
        case "Product":
          arrayProduct(arr);
          break;
        case "find largest":
        case "Find Largest":
        case "largest":
        case "Largest":
         findLargestInArray(arr);
          break;
        case "find smallest":
        case "Find Smallest":
        case "smallest":
        case "Smallest":
         findSmallestInArray(arr);
          break;
        default:
          System.out.println("Please double check your spelling and case.");
          continue;
      }
      System.out.println("Would You Like to Perform Another operation on your array?[yes | no]");
      String yesOrNo = input.next();
      if (yesOrNo.equalsIgnoreCase("no") || yesOrNo.equalsIgnoreCase("n")) {
        System.out.println("Thank you for choosing A Ray: Your friendly neighborhood array folks.");
        isRunning = false;
      }
    }
  }
}
