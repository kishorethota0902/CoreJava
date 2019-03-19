package premitiveVariables;
class Emp{
	int eid;
	int salary;
	static String CEO;//it will load into class loader memory not into heap
	
	public Emp() {
		eid = 1;
		salary = 1000;
	}
	static {
		//static block excutes only once
		CEO = "Gowtham Nandha";
		System.out.println("Inside Static Block");
	}
	public void show() {
		System.out.println(" "+eid+" "+salary+" "+CEO);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp Kishore = new Emp();
		//Kishore.eid= 10;
		//Kishore.salary = 5000;
		//Emp.CEO = "Gowtham";//we don't need object
		Emp Kumar = new Emp();
		Kumar.eid= 11;
		Kumar.salary = 2000;
		Kishore.show();
		Kumar.show();
	}

}
