package search;

public class TowerOfHanoi {

	public static void main(String[] args) {
		solution(3,"A","B","C");

	}
	 public static void solution(int n,String start,String helper,String end) {
		  if(n==1) {
			  //MOVE LAST DISC TO TARGET POLE
			  System.out.print("MOVING "+start+ " to "+end+"\n");
			  
		  }else {
			  solution(n-1,start,end,helper);
			  System.out.print("MOVING "+start+ " to "+end+"\n");
			  solution(n-1,helper,start,end);
			  
		  }

}
}
