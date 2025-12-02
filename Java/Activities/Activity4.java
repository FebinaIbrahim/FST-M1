package activities;

import java.util.Arrays;

public class Activity4 {
	
	    static void ascendingInsertionSort(int array[]) {
	        int size = array.length;
	        int i;
	        
	        for (i = 1; i < size; i++)
	        {
	          
	     int key = array[i];
	            int j;
	            
	            for (j=i-1;j >= 0 && key < array[j];--j)
	            {
	                array[j + 1] = array[j];
	              
	            }
	            array[j + 1] = key;
	        }
	    }
	    
	    public static void main(String args[]) {
	        int[] array = { 10, 15, 11, 41, 23 };
	        System.out.println("Original Array: ");
	        System.out.println(Arrays.toString(array));
	        
	        ascendingInsertionSort(array);
	        System.out.println("Sorted Array in Ascending Order: ");
	        System.out.println(Arrays.toString(array));
	    }
	}


