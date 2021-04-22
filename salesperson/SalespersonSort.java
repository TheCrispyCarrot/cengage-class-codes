/*
In Chapter 8, Programming Exercise 6 you created a Salesperson class with fields for an ID number and sales values. 
Now, create an application that allows a user to enter values for an array of seven Salesperson objects. Offer the 
user the choice of displaying the objects in ascending order by either (I)D number or (S)ales value
*/
import java.util.Scanner;
import java.util.Arrays;
public class SalespersonSort
{
   public static void main(String[] args)
   {
      //instanciates scanner and creates a null array of salespeople that is the requested size
      Salesperson[] salesPeople = new Salesperson[7];
      Scanner scan = new Scanner(System.in);   
      
      //for loop that allows the user to enter data for the sales people
      for (int i=0; i<salesPeople.length; i++){
          //requests the user to input sales id and sales for the employees
          System.out.print("Enter ID for salesperson " + i + ">> ");
          int id = scan.nextInt();
          System.out.print("Enter sales for salesperson " + i + ">> ");
          double sales = scan.nextDouble();
          
          //inserts the data that was entered by the user into the array 
          salesPeople[i] = new Salesperson(id, sales);
        }

        //allows the user to choose how to sort the array loop assures a choice is made
        boolean decided = false;
        while(!decided){
            System.out.println("By which field do you want to sort?");
            System.out.print("(I)d number or (S)ales  >> ");
            Character choice = scan.next().charAt(0);
            
            //choice that sorts by id
            if(choice.equals('I')){
                Salesperson[] sortedById = sortById(salesPeople);
                for (int i=0; i<salesPeople.length; i++){
                System.out.println("ID: " + sortedById[i].getId() + "  sales: " + sortedById[i].getSales());
                }   
                decided = true;         
            }

            //choice that sorts by sales
            else if (choice.equals('S')){
                Salesperson[] sortedBySales = sortBySales(salesPeople);
                for (int i=0; i<salesPeople.length; i++){
                System.out.println("ID: " + sortedBySales[i].getId() + "  sales: " + sortedBySales[i].getSales());
                }  
                decided = true;          
            }
            else{
                System.out.print("Invalid choice");
            }
        }
   }

    //method for sorting the array of salespeople by ID
    public static Salesperson[] sortById (Salesperson[] salesPeople){
        int[] idArr = new int[salesPeople.length];
        for (int i=0; i< salesPeople.length; i++){
            idArr[i] = salesPeople[i].getId();
        }

        //bubble sort that sorts both the salespeople array and the id
        for (int i = 0; i < idArr.length-1; i++)
            for (int j = 0; j < idArr.length-i-1; j++)
                if (idArr[j] > idArr[j+1])
                {
                    // swap [j+1] and [j]
                    int idTemp = idArr[j];
                    idArr[j] = idArr[j+1];
                    idArr[j+1] = idTemp;

                    Salesperson personTemp = salesPeople[j];
                    salesPeople[j] = salesPeople[j+1];
                    salesPeople[j+1] = personTemp;
                }
        //returns the sorted salespeople array
        return salesPeople;
    }
    
    //method for sortiung the salespeople array by sales
    public static Salesperson[] sortBySales (Salesperson[] salesPeople){
        double[] saleArr = new double[salesPeople.length];
        for (int i=0; i< salesPeople.length; i++){
            saleArr[i] = salesPeople[i].getSales();
        }

        //bubble sort that sorts both the salespeople array and the id array
        for (int i = 0; i < saleArr.length-1; i++)
            for (int j = 0; j < saleArr.length-i-1; j++)
                if (saleArr[j] > saleArr[j+1])
                {
                    // swap [j+1] and [j]
                    double saleTemp = saleArr[j];
                    saleArr[j] = saleArr[j+1];
                    saleArr[j+1] = saleTemp;

                    Salesperson personTemp = salesPeople[j];
                    salesPeople[j] = salesPeople[j+1];
                    salesPeople[j+1] = personTemp;
                }
        //returns the sorted salespeople array
        return salesPeople;
    }
    
}
