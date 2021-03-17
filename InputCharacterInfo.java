/*
Asks the user to enter a character and displays information 
about that character to the user. 
*/

import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) {
        
        //varriables
        Character enteredChar;
        String stringValue;
        
        //scans for a string and takes the first char and displays value
        Scanner scan = new Scanner(System.in); //instanciates scanner
        System.out.print("Enter a character... "); //requests char
        enteredChar = scan.nextLine().charAt(0);
        System.out.println("The character is "+enteredChar);

        //checks for upper case
        if(Character.isUpperCase(enteredChar)){
            System.out.println(enteredChar + " is uppercase");
        }
        else {
            System.out.println(enteredChar + " is not uppercase");
        }

        //checks for lower case
        if (Character.isLowerCase(enteredChar)){
            System.out.println(enteredChar + " is lowercase");

        }
        else {
            System.out.println(enteredChar + " is not lowercase");
        }

        //to upper and lowe case
        System.out.println("After toLowerCase(), aChar is " + Character.toLowerCase(enteredChar));
        System.out.println("After toUpperCase(), aChar is " + Character.toUpperCase(enteredChar));

        //checks for letter or digit
        if (Character.isLetterOrDigit(enteredChar)){
            System.out.println(enteredChar + " is a letter or digit");
        }
        else {
            System.out.println(enteredChar + " is neither a letter nor a digit");
        }

        //checks for white space
        if (Character.isWhitespace(enteredChar)){
            System.out.println(enteredChar + " is whitespace");
        }
        else {
            System.out.println(enteredChar + " is not whitespace");
        }

    }
}
