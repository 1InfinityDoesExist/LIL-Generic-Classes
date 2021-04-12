package in.chapter2;

public class GenericClassExample {

	public static void main(String[] args) {
		Person<Employee> e1 = new Person<>();

		Person<Contact> e2 = new Person<>();

		Employee e = new Employee("John", "Patel", "12345");

		Contact c = new Contact("Avinash", "Patel", "Fisher", "96325874125");
		e1.setPerson(e);
		e2.setPerson(c);
		System.out.println(e1.getPerson().toString());
		System.out.println(e2.getPerson().toString());

	}

}
