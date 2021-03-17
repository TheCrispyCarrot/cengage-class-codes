import java.util.Scanner;
public class DistanceFromAverage {
    public static void main (String[] args) {
        //declaring varribales
        double[] nums = new double[15];
        int numsLength = nums.length;
        double sum = 0;
        int finalLength = 0;
        double average;
        double scannedValue;
        Scanner scan = new Scanner(System.in);
        
        //first message is different because cengage wants it to be
        System.out.print("Enter a numeric value or 99999 to quit >> ");
        nums[0] = scan.nextDouble();

        //scans amd stores the rest of the values
        for (int i=1; i<numsLength; ++i){
            System.out.print("Enter next numeric value or 99999 to quit >> ");
            scannedValue = scan.nextDouble();
            if (scannedValue == 99999) break;
            nums[i] = scannedValue;
        }

        //calculates the sum and finds the final length of the array
        for (int i=0; i<numsLength; ++i) 
        {
            sum = sum + nums[i];
            if(nums[i] != 0.00) ++finalLength;
        }

        //calculates the average
        average = sum/finalLength;

        System.out.println("You entered " + finalLength + " numbers and their average is " + average);
        for (int i=0; i<finalLength; ++i){
            double distance = nums[i] - average;
            System.out.println(nums[i] + " is " + distance + " away from the average");
        }
    }
}
