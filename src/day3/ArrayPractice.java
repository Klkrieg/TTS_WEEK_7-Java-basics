package day3;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayPractice {

    public static int getSum(int[] arr){
      int total = 0;
      for(int num : arr){
        total += 0;
      }
      return total;
    }

    public static void answerQuestionTwo(){
      System.out.println("Question 2 Asks: What is the output...?");
      System.out.println("double[] exampleArray = {1,5,6,5,4,1};");
      System.out.println("double maximum = examplesArray[0];");
      System.out.println("int index = 0;");
      System.out.println("for(int i=1; i<exampleArray.length; i++){");
      System.out.println("\tif (exampleArray[i] > maximum{");
      System.out.println("\t\tmaximum = exampleArray[i];");
      System.out.println("\t\tindex = i");
      System.out.println("\t}");
      System.out.println("}");
      System.out.println("System.out.println(index)");

      System.out.println("This will iterate through the array of doubles.\n " +
              "It tracks the index and value of the largest double.");
      System.out.println("It will then print the index of the larges double to the console.");
    }

    public static ArrayList<Integer> toPower(int size, int power){
      int index = 0;
      ArrayList<Integer> exponentialArray = new ArrayList<>();
      while(index < size) {
        exponentialArray.add((int) Math.pow(index, power));
        index++;
      }
      return exponentialArray;
    }

}
