package arrays;

import java.util.Arrays;

public class ArraysMain {

	private String[] testArray;
	private int[] intRay;
	
	public ArraysMain() {
		intRay = new int[100];
        //populate(intRay);
		//checkOccurences(intRay,3,18);
		//populate1ToN(intRay);
		//shuffle(intRay);
		//reverseOrder(intRay);
	    //countLessThan(intRay,6);
	    //frontToBack(intRay);
	    //cycleThrough(intRay,6);
	    //longestConsecutiveSequence(intRay);
		//Arrays is a Utility class included in Java for formatting output
		//System.out.println(Arrays.toString(intRay));
		//int[] consecTest1 = {1,2,3,6,7,8,9,10,11,45,46,47};
		//System.out.println(longestConsecutiveSequence(consecTest1));
		
	}
	/**
	 * moves the front to the back repeatedly exactly n times
	 * @param arr
	 * @param r
	 */
 public void cycleThrough(int[]arr,int n) {
	 for(int i=0;i<n;i++)
	 {
		 frontToBack(arr);
	 }
 }
	private int countLessThan(int[] arr, int n) {
		int count =0;
		for(int value: arr) {
			  if(value < n) {
				  count++;
			  }
		  }
	  return count;
		
	}

	private int[] reverseOrder(int[] arr) {
	   int[]newArray = new int[arr.length];
	  for(int i = 0; i<arr.length;i++) {
		   newArray[i] = arr[arr.length-1-i];
	  }
		return newArray;
	}
	/**
	 * returns the length of the longest sequence of consequtive integers in arr
	 * @param arr
	 * @return
	 */
	public int longestConsecutiveSequence(int[]arr) {
		int highestCount = 0;
		int currentCount = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1 == arr[i+1])
			{
				currentCount++;
				if(currentCount >highestCount)
				{
					highestCount = currentCount;
				}
			}
			else
			{
				currentCount = 1;

			}
			
		}
		return highestCount;
	}
	public int longestConsecutivePos(int[]arr) {
		int pos =0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1 == arr[i+1])
			{
				pos = i;
				
			}
			else
			{
				if(arr[i] !=  )
			}
			
		}
		return pos;
	}
	public int[] longestConsecSeqAndPos(int[] arr) {
		int[] data = new int [2];
		data[0] = longestConsecutiveSequence(arr);
		data[1]= "";
			return data;
	}
	public boolean nextElementIsInSequence(int[] arr,int pos) {
		if(arr[pos]+1 == arr[pos+1])
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private void reverseOrderOriginal(int[] arr) {
		  for(int i = 0; i<arr.length/2;i++) {
			  swap(arr,i,arr.length-1-i);
		  }
			
		}
	/**
	 * remove the elemnt at index zero,push every other element up by one. 1 to 0, 2 t0 1,etc
	 * put the element that was at zero at the end of the arr
	 * @param arr
	 */
    public void frontToBack(int[] arr)
    {
    	int temp = arr[0];
       for(int i =0;i<arr.length-1;i++) {
    	   arr[i] = arr[i+1];
       }
       arr[arr.length-1] = temp;
    }
	private void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			swap(arr,(int)(Math.random()*arr.length), 
					(int)(Math.random()*arr.length));
		}
	}

	private void swap(int[] arr, int i, int j) {
		int placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeholder;
	}

	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]= i + 1;
		}
	}

	private void checkOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end-start+1];
		for(int value: arr) {
			counter[value-start]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("A "+(start+i)+" was "
					+ "rolled "+counter[i]+" times.");
		}
	}

	private void populate(int[] intRay) {
		for(int i =0; i < intRay.length; i++) {
			intRay[i] = diceRoll(3);
		}
//		//This does not work:
//		for(int value: intRay) {
//			value = diceRoll(2);
//		}
		
		
	}

	public void notes() {
		//1. collection of primitives or objects
		//SPECIAL NOTE: This is the ONLY collection of primitives
		
		//2. size cannot be modified
		
		/*
		 * 3. Elements of an array are REFERENCES to objects. 
		 * In other words, changing an element of an array changes 
		 * the REFERENCE, not the object (more on this later)
		 */
		
		//_________________________________________
		
		//There two types of constructors, the first we've seen already:
		int[] firstType = {3,14,-9,10};
		//this constructor can only be used at the declaration. Error:
		//firstType = {12,13,14,15};
		
		//the 2nd type:
		testArray = new String[50];
		/*SPECIAL NOTE: for primitive arrays, when they are instantiated,
		they are automatically populated with 0s. This is not the case with 
		Object arrays, which are populated with 'null'
		*/
		
		//standard 'for' loop
		for(int i = 0; i < testArray.length; i++) {
			System.out.println("The #"+i+" item is:"+testArray[i]);
		}
		
		//for each loop (useful only when you don't need to keep track of an index
		for(String value:testArray) {
			//"for each int in testArray..."
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();
	}
	
	/**
	 * Returns the result from rolling "numberOfDice" dice.
	 * @param numberOfDice
	 * @return
	 */
	public int diceRoll(int numberOfDice) {
		int roll = 0;
		for(int i = 0; i < numberOfDice; i++) {
			roll = roll + 1+(int)(Math.random()*6);
		}
		return roll;
	}

}

