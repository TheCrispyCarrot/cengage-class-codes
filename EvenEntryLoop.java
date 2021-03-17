/*
requests the user to enter an even nummber and checks if that numer is
even. program loops until the sentinal value of 999 is entered. 
*/

import java.util.Scanner;
public class EvenEntryLoop {
    public static void main (String args[]) {
    
        System.out.print("enter an even number: ");
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        while(choice != 999){
            
            choice = scan.nextInt();

            if (choice % 2 == 0){
                System.out.println("Good job!");
                System.out.print("enter another nubmer: ");
            }
            else if ((choice % 2 != 0) && (choice != 999)){
                System.out.print(choice + " is not an even number: ");
            }
        }
    }
}
