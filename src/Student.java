
public class Student {
	
    // static method
	public static void m1() {
		System.out.println("This is Static M1 method");
	}

	// Non static method
	public void m2() {
		System.out.println("This is Not-static method m2");
	}
	
    // static return type
	public static int addNum() {
		return 5;
	}
	public static String name() {
		return "Ganesh";
	}
	
	// non static return type
	public int addNum1() {
		return 10;
	}
	public String name1() {
		return "Jirage";
	}
	
	//passing arguments in non static method
	public int addNum2(int id) {
		return id;
	}
	public String name2(String name) {
		return name;
	}
	public void employee(String name) {
		System.out.println("Employee name is " + name);
	}
	
	//passing arguments to static method
	public static int addNum3(int n) {
		return n;
	}
	public static String name3(String name) {
		return name;
	}
	
	public static void main(String[] args) {

		Student s = new Student(); // creation of object

		Student.m1(); // Printing static method by using class
		s.m1(); // Printing static method by using object
		m1(); // Printing static method by using method

		s.m2(); // printing not static method
		
		System.out.println(addNum());
		System.out.println(s.addNum1());
		
		System.out.println(name());
		System.out.println(s.name1());
		
		System.out.println(s.addNum2(3));
		System.out.println(s.name2("Baramati"));
		
		System.out.println(addNum3(7));
		System.out.println(name3("Pune"));
		
		s.employee("Ganesh jirage");
		
	}

}
