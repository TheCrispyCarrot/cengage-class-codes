/*
code that requests the user to enter a password and check that it meets
spesific criteia. The password must have a minimum of two uppercase letters,
three lowerccase letters, and one digit. 
*/

import java.util.Scanner;
public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean passowrdStatus = false;
        
        //loop that requests password form user until a valid one is entered
        while(passowrdStatus == false){
            System.out.println("Please enter a password with at least 2 capitals, 3 lowers, and one number");
            String inputString = scan.nextLine();
            if(validate(inputString)){
                passowrdStatus = true;
            }
        }
    }
    
    //method for validating pass
    public static boolean validate(String inString){
        int length = inString.length();
        int lowerCount = 0;
        int upperCount = 0;
        int numCount = 0;
        
        //scans for criteria within entered string
        for (int i = 0; i < length; ++i){
            Character indexChar = inString.charAt(i);
            if (Character.isUpperCase(indexChar)) ++upperCount;
            if (Character.isLowerCase(indexChar)) ++lowerCount;
            if (Character.isDigit(indexChar)) ++numCount;
        }

        //checks for criteria
        if(upperCount>1 && lowerCount>2 && numCount>0){
            System.out.println("Valid password");
            return true;
        }
        
        //returnss false as well as criteria that is not met
        else{
            System.out.println("The password did not have enough of the"+
            " following:");
            if(upperCount<2) System.out.println("uppercase letters");
            if(lowerCount<3) System.out.println("lowercase letters");
            if(numCount<1) System.out.println("digits");
            return false;
        } 
    }
}
