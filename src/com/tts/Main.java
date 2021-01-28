package com.tts;
import day3.ArrayPractice;
import day4.MountainBike;
import day4.Pet;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
      //DAY 2 ASSIGNMENT
	    long[] myArr = NumbersList.getArray();
      NumbersList.init(myArr);
      HashMap<String, String> inventory = CarDealer.initDealer();
      CarDealer.findCar(inventory);

      //DAY 3 ASSIGNMENT
      int[] sampleArray = {1,4,5,6,2,4,7,2,3};
      ArrayPractice.answerQuestionTwo();
      int sumOfSample = ArrayPractice.getSum(sampleArray);
      System.out.println(sumOfSample);
      ArrayList<Integer> myArr = ArrayPractice.toPower(10, 5);
      System.out.println(myArr.toString());

//      DAY 4 ASSIGNMENT
      Pet myDog = new Pet("Tallis", 3, "Flagstaff", "Dog" );
      myDog.speak();
      System.out.println(myDog.getAge());
      myDog.setAge(4);
      System.out.println(myDog.getAge());

      MountainBike myBike = new MountainBike("Santa Cruz",
              27.5,
              150,
              150,
              "carbon",
              true,
              2.3);

      MountainBike aprilsBike = new MountainBike("Specialized",
              27.5,
              140,
              150,
              "carbon and aluminum",
              true,
              2.4);

      System.out.println(myBike.toString());
      System.out.println(aprilsBike.toString());
      myBike.setTireWidth(2.6);
      System.out.println(myBike.getTireWidth());
    }



}
