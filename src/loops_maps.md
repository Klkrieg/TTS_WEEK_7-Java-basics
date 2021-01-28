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

#Day 4 OOP

    Pet.java 

        Create a "Pet" Class with the following instance variables: 
        - name (PRIVATE) 
		- age (PRIVATE) 
		- location (PRIVATE) 
		- type (PRIVATE) 

		two constructors 
			- empty 
			- all attributes 

	    Code to be able to access the following (Get Methods): 
        - name 
		- age 
		- type 

        Code to be able to change (Set Methods): 
		- name 
		- age 
		- location 

    Create a Custom Class (anything you want - car, phone, holiday, etc.). 
        Requirements: 
		- Minimum 3 private instance variables 
		- An empty constructor 
		- A constructor that uses only 2 of your 3 variables 
		- A constructor that uses all 3 of your instance variables 
		- Get methods for all 3 of your instance variables 
		- Set methods for all 3 of your instance variables 
		- A method that returns a Boolean A method that returns a String 
			For example, if I created a Santa Custom Class, 
			my code would look something like the attached Santa.java file. 



        Create a Java Calculator Class that does the following five commands:
        An add method that takes in two integer numbers and adds them together the call
            to that method would look like this: add(int num1, int num2)
        A subtraction method that takes in two integers and subtracts them from one
            another would look like this: subtract( int num1, int num2)
        A multiplication method that takes in two integer numbers and multiplies them 
            together the call to that method would look like this: multiply(int num1, int num2)
        A division method that takes in two integer numbers and divides them the call 
            to that method would look like this: divide(int num1, int num2)
        A square method that takes in one integer and squares it: square(int num1, int num2)
         Create a MagicCalculator that inherits its basic functionality from your calculator and
            does the following functions:
        Finds the square root of a number
        Finds the sin (trigonometry) of a number. [Note: Feel free to use the MATH class]
        Finds the cosine (trigonometry) of a number. [Note: Feel free to use the MATH class]
        Finds the tangent (trigonometry) of a number. [Note: Feel free to use the MATH class]
        Finds the factorial (!) of the number
        Submit a link to your GitHub repository 