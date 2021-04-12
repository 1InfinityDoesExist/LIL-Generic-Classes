
import java.util.ArrayList;

public class SyntaxExample {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(15);
		a.add("20");
		// Integer b = (Integer) a.get(1); // no error at compile time.

		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(15);
		// b.add("20"); // compile time error.
		Integer c = b.get(0); // no error at compile time.

		Pair<Integer, String> p1 = new OrderedPair<>(100, "Apple");
		Pair<String, Integer> p2 = new OrderedPair<String, Integer>("Banana", 200);
		print(p1.getKey(), p1.getValue());
		print(p2.getKey(), p2.getValue());
		print("Apple", "Orange");

	}

	public static <K, V> void print(K key, V value) {
		System.out.println("Key :" + key);
		System.out.println("Value : " + value);

	}
}
