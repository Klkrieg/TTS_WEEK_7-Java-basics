package com.tts;
import day3.ArrayPractice;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
//	    long[] myArr = NumbersList.getArray();
//      NumbersList.init(myArr);
//      HashMap<String, String> inventory = CarDealer.initDealer();
//      CarDealer.findCar(inventory);
      int[] sampleArray = {1,4,5,6,2,4,7,2,3};
      ArrayPractice.answerQuestionTwo();
      int sumOfSample = ArrayPractice.getSum(sampleArray);
      System.out.println(sumOfSample);
      ArrayList<Integer> myArr = ArrayPractice.toPower(10, 5);
      System.out.println(myArr.toString());
    }
}
