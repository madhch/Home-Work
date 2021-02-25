package org.madhu;

public class StaticDemo {
	//private StaticDemo() {
	//}
	public String getMessage() {
		return "Good Morning";
	}
	public static int getSum(int a,int b,int c) {
		return a + b +c;		
	
	}
	public static String[] getstatus(){
		return new String [] {"New","Open","Active","ReOpen","Resolved","Complete","Close"};
	

}
}