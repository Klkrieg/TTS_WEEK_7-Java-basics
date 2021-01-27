package com.tts;
import java.util.Arrays;
import java.util.Scanner;
public class NumbersList {

  protected static long[] getArray(){
    Scanner input = new Scanner(System.in);
    System.out.println("--------------------");
    System.out.println("Please enter five numbers.");
    long[] longList = {0,0,0,0,0};
    int i = 0;
    while(i < longList.length){
      System.out.println( "----------"+ (i + 1) +"----------");
      long num = input.nextLong();
      longList[i] = num;
      i++;
    }
    System.out.println("Thank you. Your array is: " + Arrays.toString(longList));
    return longList;
  }
  protected static void arraySum(long[] arr){
    long total = 0;
    for(long num : arr){
      total += num;
    }
    System.out.printf("The sum of your array is: %d\n", total);
  }

  protected static void arrayProduct(long[] arr){
    long total = 1;
    for(long num : arr){
      total *= num;
    }
    System.out.printf("The product of your array is: %d\n", total);
  }

  protected static void findLargestInArray(long[] arr){
    long largest = 0;
    for(long num : arr){
      if(num > largest){
        largest = num;
      }
    }
    System.out.printf("The biggest integer in your array is: %d\n", largest);
  }

  protected  static void findSmallestInArray(long[] arr){
    long smallest = 0;
    for(long num : arr){
      if(num < smallest){
        smallest = num;
      }
    }
    System.out.printf("The smallest integer in your array is: %d\n", smallest);
  }

  protected static void init(long[] arr){
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
