package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ObjectArrays oA = new ObjectArrays();
		Person s = new Person("Ben","Nockles",Borough.NY_BOROUGHS[0]);
		int x = 10;
		int[] a = {5,6,7};
		test2(s,x,a);
		System.out.println(s+", "+x+", "+ Arrays.toString(a));
       
	}
	/**
	 * Pass by value examples
	 */
    public static void test(Person s,int x,int[]arr) {
    	String name =s.getFirstName();
    	name = "Ilona";
    	x =5;
    	arr = new int[3];
    	arr[0] =1;
    	arr[1] =2;
    	arr[2] =3;
    }
    /**
     * CHANGE NAME AND ARRAY
     * No VOID method can permanently change an int 
     * ( you can if you set it at a return type)
     * 
     * @param s
     * @param x
     * @param arr
     */
    public static void test2(Person s,int x,int[]arr) {
    	s.setFirstName("Ilona");
    	x =5;
    	//arr = new int[3]; As long as you dont make a new array
    	//the reference themselves will change
    	arr[0] =1;
    	arr[1] =2;
    	arr[2] =3;
    }
}
    
