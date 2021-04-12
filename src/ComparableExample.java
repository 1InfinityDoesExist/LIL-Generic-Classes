

import java.util.Date;

public class ComparableExample {
	public static void main(String[] args) {
//		Comparable c = new Date();
//		System.out.println(c.compareTo("Monday"));

		Comparable<Date> c = new Date();
		//System.out.println(c.compareTo("Monday")); // error

	}

}
