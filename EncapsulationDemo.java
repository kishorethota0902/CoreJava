package oops;
class Student{
	private int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Getters and setters
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setRollNo(15);
		System.out.println(s1.getRollNo());
		s1.setName("Kishore");
		System.out.println(s1.getName());

	}

}
