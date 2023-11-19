import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class NumericArr {
	 public static void main(String[] args) 
	 {
		 	Scanner input = new Scanner(System.in);
		 
		 	ArrayList<Integer> arr = new ArrayList<>();
		 
		 	System.out.print("Length of the array: ");
	        int n = input.nextInt();

	        for (int i=1;i<=n;i++)
	        {
	        	int value = input.nextInt();
	        	arr.add(value);
	        }
	        
	        //sort 
	        Collections.sort(arr);
	        // print the array 
	        for (int i = 0; i < arr.size(); i++) {
			    int a = arr.get(i);
			    System.out.printf("%d ",a);
			}
	        //calculate the sum and avg
	        int sum=0;
	      	for (int i = 0; i < arr.size(); i++) {
			    int a = arr.get(i);
			    sum +=a;
	      	}
	      	double avg = sum*1.0/n;
	      	// display result
	      	System.out.printf("Sum of array elements = %d \n",sum);
	      	System.out.printf("Average of array elements = %.2f \n",avg);
	 }
}
		