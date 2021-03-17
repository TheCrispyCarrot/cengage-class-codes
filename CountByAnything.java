/*
program that counts by fives and breaks lines at a designated point
*/ 

public class CountByFives {
    public static void main (String args[]) {
        int initialValue = 5;
        int finalValue = 500;

        while (initialValue<=finalValue){
           if (initialValue % 50 != 0){
                System.out.print(initialValue + " ");
                initialValue = initialValue + 5;           
           }
            if (initialValue % 50 == 0){
                System.out.println(initialValue);
                initialValue = initialValue +5;

            }

        }
   
   
   
    }
}
