/*
This program allows the user to enter up to nine values and calculates the mean and the median
of the entered data. The median is calculated by sorting the list with a quicksort and finding
the middle value. If the list has an even amount of numbers, the median is the lower of the 
two values. The mean is calculated by taking the sum of the numbers and dividing it by the total
numbers entered. The user can end the loop at any time by typing DONE (not case sensitive).
*/
import java.util.*;
class MeanMedian
{
	public static void main(String[] args)
	{
	      
		Scanner scan = new Scanner(System.in);
		int[] userNums = new int[9];
		String breakInput = "done";
		int stringCount = 0;
        int sum = 0;
        double mean;
        int median;
        
		   
		System.out.println("Welcome to the number calculating machine!");
		System.out.println("Enter up to 9 numbers or \"DONE\" to finish");
		   
		//loop that assigns the user's strings to an array
        for (int i=0; i<9; i++) {
            int userInt = 0;
			int stringNum = i+1;
            String userInput = "";
            boolean datatype = false;

            //loop that assures the users entry is valid
            while(!datatype){
                System.out.print("Enter string " + stringNum + ">> ");
                userInput = scan.nextLine();
                if(userInput.equalsIgnoreCase(breakInput)){
                    break;
                }
                try{
                    userInt = Integer.parseInt(userInput);
                    datatype = true;
                }
                catch(Exception e){
                    System.out.println("Incompatable entry. Try again:");
                }
            }

            //breaks the for loop if the entry is the quit value
            if(userInput.equalsIgnoreCase(breakInput)){
               break;
            }

            //assigns number to array,adds it to the sum, and increases the string count
			userNums[i] =  userInt;
            sum += userInt;
			++stringCount;
        }

        //creates a short array in case the user breaks the for loop before max values are entered
        int[] shortNums = new int[stringCount];
        for (int i=0; i<stringCount; i++)
            shortNums[i] = userNums[i];
        
        //calculates the mean and the median of the entered values
        int low = 0;
        int high = shortNums.length - 1;
        int[] sortedArr = quickSort(shortNums, low, high);
        median = sortedArr[(high+1)/2];
        mean = sum / (stringCount * 1.00); //this is for decimal places to make cengage happy

        //prints the desired output
        System.out.print("You entered: ");
        for (int i=0; i<stringCount; i++)
            System.out.print(sortedArr[i] + ", ");
        System.out.println("\nThem mean is " + mean + " and the median is " + median);
			   
	}

    //method for quicksorting data
    public static int[] quickSort(int[] arr, int low, int high) 
    {
        //determines and assigns a pivot from the array
        int pivotIndex = low + (high - low) / 2;
        int i = low; 
        int j = high;        
        int pivot = arr[pivotIndex];
 
        //first iteration of the quicksort algorithm that splits the list and puts the first element into place
        while (i <= j) 
        {
            //Check until all values on right side array are lower than pivot
            while (arr[i] < pivot) 
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot) 
            {
                j--;
            }
            //compare and swap
            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //the sorting algorithm is recursively called to sort the arrays on the left and right
        if (low < j){
        	quickSort(arr, low, j);
        }
        if (high > i){
        	quickSort(arr, i, high);
        }
        return arr;
	}
    //used to swap array values in the quicksort methods
    public static void swap (int array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}