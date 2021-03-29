/*
This code prompts the user to enter strings. Once the user enters a desired amount of strings,
they are sorted into arrays by how many words they contain. This is determined by the amount
of spaces they contain. The user is then allowed to select which array of strings they would like 
to see. If an invalid choice is entered, all the strings are displayed. 
*/
import java.util.*;
public class CategorizeStrings
{
   // Modify the code below
   public static void main (String[] args)
   {
      final int MAX = 20;
      final String QUIT = "ZZZ";
      int stringsEntered = 0;
      String entry;
      Scanner input = new Scanner(System.in);
      int longCount = 0;
      int twoWordCount = 0;
      int oneWordCount = 0;
      String[] longStrings = new String[MAX];
      String[] twoWordStrings = new String[MAX];
      String[] oneWordStrings = new String[MAX];

      //while loop that allows the user to enter strings
      System.out.print("Enter a string or " + QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT) && (stringsEntered < MAX))
      {
          //resets desired variables when running the next itieration of the loop
          int length = entry.length();
          int whitespaceCount = 0;

          //for loop that counts the spaces within the entered string
          for (int i=0; i<length; ++i){
              if (Character.isWhitespace(entry.charAt(i))) ++whitespaceCount;
          }

        //chunk of if statements that sorts the entered strings into corisponding arrays
        if(whitespaceCount == 0){
            oneWordStrings[oneWordCount] = entry;
            ++oneWordCount;
        }
        if(whitespaceCount == 1){
            twoWordStrings[twoWordCount] = entry;
            ++twoWordCount;
        }
        if(whitespaceCount>1){
            longStrings[longCount] = entry;
            ++longCount;
        }
        else{
            System.out.print("invalid input");
        }

        //if statement that ends the while loop if the maximum amount of strings has been entered
         ++stringsEntered;
         if(stringsEntered < MAX)
         {
            System.out.print("Enter a string or " + QUIT + " to quit >> ");
            entry = input.nextLine();
         }
      }

      //initial input for upcomming while loop
      System.out.println("\nDo you want to see the list of one-word strings, two-word strings, or longer strings?");
      System.out.print("Please enter O, T, or L, or " + QUIT + " to quit >> ");
      entry = input.nextLine();
      
      //loop that allows the user to select which array they would like to see
      while(!entry.equals(QUIT))
      {
        if(entry.substring(0, 1).toLowerCase().equals("o"))
            display(oneWordStrings, oneWordCount);
        else if(entry.substring(0, 1).toLowerCase().equals("t"))
            display(twoWordStrings, twoWordCount);
        else if(entry.substring(0, 1).toLowerCase().equals("l"))
            display(longStrings, longCount);
        else{
            display(oneWordStrings, oneWordCount);
            display(twoWordStrings, twoWordCount);
            display(longStrings, longCount);            
        }

        //prompts the user for another input
        System.out.println("\nDo you want to see the list of one-word strings, two-word strings, or longer strings?");
        System.out.print("Please enter O, T, or L, or " + QUIT + " to quit >> ");
        entry = input.nextLine();
      }
   }

   //method that displays the selected aray to the max value
   public static void display(String[] array, int max)
   {
      System.out.println();
      if(max == 0)
         System.out.println("The list is empty");
      else
         for(int x = 0; x < max; ++x)
            System.out.println(array[x]); 
   }
}
