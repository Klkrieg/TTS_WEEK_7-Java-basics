#Loop and Map.Entry Exercises

    Write a program that does the following:
        - Asks the user for 5 numbers
        - Stores them in an array list
        - Finds the sum, product, largest, and smallest of those numbers


    You are a car dealer. Create a hash map of vehicles.
        - The model is the Key, the make is the Value.
        - Ask the customer what car (model) they are looking for. 
            Use the Hash Map to determine if you have that vehicle, 
            and what make it is.
        - (e.g. "Oh, you're looking for a Civic? Our Honda selection is right
            over here...")


#Data Structures: Arrays
    

    Write a program to sum all the values of a given Array in Java.
    What is the output?
          double[ ] exampleArray = {1,5,6,5,4,1};
          double maximum = examplesArray[0];
          int index = 0;
          for (int i = 1; i<exampleArray.length>; i++){
               if (exampleArray[ i ] > maximum) {
                    maximum = exampleArray[ i ];
                    index = i;
               }
          }

          System.out.println(index);
    Write a public static method called "toPower" that takes in as parameters
    two integers called size and power. The method should return an array of size "size" 
    with each array index raised to the value of "power." 
    So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," 
    the method should return the following result: [0,1,4,9].