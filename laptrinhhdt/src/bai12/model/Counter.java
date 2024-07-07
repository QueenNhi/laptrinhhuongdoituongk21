package bai12.model;

public class Counter {
	private static int count = 0;

	public Counter() {
		super();
		// TODO Auto-generated constructor stub
		count = count ++;
	}

	public static int getCount() {
		return count;
	}
	 
	

}
