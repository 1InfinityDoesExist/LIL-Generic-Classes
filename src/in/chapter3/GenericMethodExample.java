package in.chapter3;

public class GenericMethodExample {
	public static void main(String[] args) {
		Integer[] ints = { 10, 20, 30, 40, 60, 70, 80, 90, 100 };
		String[] daysOfWeek = { "Monday", "Tuesday" };
		print(ints);
		print(daysOfWeek);

		System.out.println(countGreaterThan(ints, 50));

	}

	public static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem) {
		int count = 0;
		for (T element : list) {
			if (element.compareTo(elem) > 0) { // what type of element or elem is  : solution : <T extends Comparable<T>>
				count++;
			}
		}
		return count;
	}

	public static <E> void print(E[] list) {
		for (E element : list) {
			System.out.print(element + " ");
		}
		System.out.println("---------------------------");
	}
}
