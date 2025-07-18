package OOPS;

public class ObjectMenthodsClass {
	
	String name;
	int age;
	int marks;
	
	public void student() {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMenthodsClass obj = new ObjectMenthodsClass();
		obj.name = "Prabha";
		obj.age = 34;
		obj.marks = 950;
		obj.student();
				
		
	}

}
