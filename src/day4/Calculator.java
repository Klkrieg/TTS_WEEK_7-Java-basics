package day4;

public class Calculator {

  public void add(int x, int y ){
    System.out.println(x+y);
  }

  public void subtract(int x, int y){
    System.out.println(x-y);
  }

  public void divide(int x, int y){
    if (y == 0) {
      System.out.println("You can't divide by 0!");
      return;
    }
    System.out.println(x / y);
  }
  public void multiply(int x, int y){
    System.out.println(x * y);
  }
  public void square(int x){
    System.out.println(Math.pow(x, 2));
  }

}
