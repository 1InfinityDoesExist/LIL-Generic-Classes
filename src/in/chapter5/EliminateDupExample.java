package in.chapter5;

import java.util.ArrayList;

public class EliminateDupExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(3);
		
		System.out.println(removeDup(list));

	}

	// E is paramater Type
	public static <E extends Comparable<E>> ArrayList<E> removeDup(ArrayList<E> list) {
		boolean found = false;
		if (list.size() == 0) {
			return list;
		}
		ArrayList<E> newList = new ArrayList<>();
		newList.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			for (int j = 0; j < newList.size(); j++) {
				if (list.get(i).compareTo(newList.get(j)) == 0) {
					System.out.println(list.get(i) + " " + newList.get(j));
					found = true;
					break;
				}
			}
			if (found == false) {
				System.out.println("adding to newList : " + list.get(i));
				newList.add(list.get(i));
			}
			found = false;
		}
		return newList;
	}

}
