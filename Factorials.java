/*
displays the numbers 1-10 and thier factorials
*/

public class Factorials
{
   public static void main (String args[])
   {
    int initalFact = 1;
    int finalFact = 10;
 
      for(int currentNumber=initalFact; currentNumber<=finalFact; ++currentNumber){
          int factorial = 1;   
          int multiplier = 1; 
          while(multiplier <= currentNumber){
              factorial *= multiplier;
              ++multiplier;
          }
             System.out.println("The factorial of " + currentNumber + " is " + factorial);

      } 
   }
}
