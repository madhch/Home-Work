package org.madhu;

public class ArrayDemo {

	public static void main(String[] args) {

		String[] status = new String[] {"New","Open","Active","ReOpen","Resolved","Complete","Close"};


		System.out.println(status[0]);
		System.out.println(status[3]);
		System.out.println(status[4]);

		String[] statusArray = StaticDemo.getstatus();
		System.out.println(statusArray.length);

		if(statusArray.length>=8) {
			System.out.println(status[6]);
		}
		else
			System.out.println(status[5]);
	}

}
