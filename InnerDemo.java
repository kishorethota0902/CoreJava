package premitiveVariables;
/*
 * Inner Class
 *  Member class
 *  Static class
 *  Anonymous class
 * 
 * 
 */
class Outer{
	int a;
	public void show() {
		
	}
	static class Inner
	{
		public void display() {
			System.out.println("In Display");
		}
	}
}
public class InnerDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		//Outer.Inner obj1 = obj.new Inner();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}

}
