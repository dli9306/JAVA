package arr2d;

public class Main {

	public static void main(String[] args) {
	int[] list = {1,2,3,4,5,6};
	

	}
	/** 
	 * increases the element in arr at index psn
	 * and decreases the elements at psn-1 and psn+1
	 *if they exists
	 *THIS IDEA is another major topic in the AP CSA
	 *it is the idea of avoding an ArrayIndexOutOfBoundsException
	 *you will see it on quizzes,tests, and project rubrics
	 *So Always BE MINDFUL!
	 * @param arr
	 * @param psn
	 */
	public static void changeNeighbors(int[] arr,int psn) {
	   
		if(psn==0)
		{
		  arr[psn] +=1;
		  arr[psn+1]-=1;
		}
		else
		{
			if(psn==arr.length-1)
			{
				arr[psn] +=1;
				arr[psn-1] -=1;
			}
			else
			{
				arr[psn] +=1;
				arr[psn+1]-=1;
				arr[psn-1]-=1;
			}
		}
	}

}
