import java.util.Scanner;

public class Q1{
	
	public static int findMissingNumber( int [] arr ){
		int n = arr.length + 1;
		int totalSum = n * ( n + 1 ) / 2;
		int arrSum = 0;
		for( int m : arr ){
			arrSum += m;
		}
		return totalSum - arrSum;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array : ");
		int m = sc.nextInt();
		
		System.out.println();
		
		int [] n = new int[m];
		
		System.out.println("Enter numbers to find missing number : ");
		for(int i=0; i < m; i++){
			n[i] = sc.nextInt();
		}
		
		System.out.println("Missing Number is : " + findMissingNumber(n));
	}
}


/*
					FlowChart
					
					Start 
					  |
					Read Array Size 
					  |
					Read Array Elements 
					  |
					Calculate Expected Sum
					  |
					Calculate Actual Sum
					  |
					Missing Number = Expected Sum - Actual Sum 
					  |
					Print Result 
					  | 
					End
					
					
					Time Complexity  = O(n)
					Space Complexity = O(1)
					
					Logic :
					
					1. Calculate Expected Sum using sum of n natural numbers formula 
							sum =  n * ( n + 1 ) / 2
					2. Calculate Actual sum of array 
					3. Then missing number = Expected Sum - Actual Sum

*/