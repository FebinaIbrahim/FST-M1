package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int[] intArray= {10,77,10,54,-11,10};
		System.out.println("Array: "+Arrays.toString(intArray));
	
		int fixedSum=30;
		int searchValue=10;
		
		System.out.println("Is Sum of 10's in array equals 30: "+result(intArray,searchValue,fixedSum));
	}
	
	public static boolean result(int[] intArray,int searchValue,int fixedSum)
	{
		int sum=0;
		for(int i=0;i<intArray.length;i++)
		{
		if (intArray[i]==searchValue)	
		sum+=intArray[i];
		}
		System.out.println("Sum of 10's in the array: "+sum);
		return sum==fixedSum;
	

	}

	}

