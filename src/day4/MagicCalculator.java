package day4;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class MagicCalculator extends Calculator{

  public void squareRoot(double x){
    System.out.println(Math.sqrt(x));
  }
  public void sin(double x){
    System.out.println(Math.sin(x));
  }
  public void cosine(double x){
    System.out.println(Math.cos(x));
  }
  public void tangent(double x){
    System.out.println(Math.tan(x));
  }
  public void factorial(int x){
    if(x == 0){
      System.out.println(1);
      return;
    }
    int i = 1;
    int factorial = 1;
    while(i<=x){
     factorial *= i;
     i++;
   }

    System.out.println(factorial);
  }
}
