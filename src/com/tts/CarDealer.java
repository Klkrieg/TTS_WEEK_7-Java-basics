package com.tts;
import java.util.Scanner;
import java.util.HashMap;

public class CarDealer {

  protected static HashMap<String, String> initDealer(){
    HashMap<String, String> inventory = new HashMap<String, String>();
    System.out.println("Welcome to the Hot Java Car Dealership! \nWhere your car dreams are exactly that...\nDreams!");
    inventory.put("Model Y", "Tesla");
    inventory.put("Model X", "Tesla");
    inventory.put("Model S", "Tesla");
    inventory.put("Model 3", "Tesla");
    inventory.put("Forrester", "Subaru");
    inventory.put("Outback", "Subaru");
    inventory.put("Crosstrek", "Subaru");
    inventory.put("Tacoma", "Toyota");
    inventory.put("Camry", "Toyota");
    inventory.put("Prius", "Toyota");
    inventory.put("Corolla", "Subaru");

    return inventory;
  }
  protected static void findCar(HashMap<String, String> inventory) {
    Scanner input = new Scanner(System.in);
    System.out.println("What model are you looking for?\nEx(Model Y)");
    String model = input.next();
    boolean isRunning = true;
    while(isRunning) {
      if (inventory.containsKey(model)) {
        String make = inventory.get(model);
        System.out.printf("Oh wow, looks like you are looking for a %s? Our %s selection is right over here...", model, make);
      } else {
        System.out.println("Oh we don't seem to have any of those. Make sure you spelled that right.");
      }
      isRunning = false;
    }
  }

}
