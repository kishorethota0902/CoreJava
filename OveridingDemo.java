package oops;
class A1{
	public void show(){
		System.out.println("In A");
	}
}
class B1 extends A1{
	//If we override parent class method in child class method
	@Override
	public void show(){
		//super.show(); //super is keyword which refers super class methods or variables
		System.out.println("In B");
	}
	public void config()
	{
		System.out.println("config");
	}
}
class C1 extends A1{
	public void show() {
		System.out.println("In C1");
	}
}
public class OveridingDemo {
//complie time and run time
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new B1();//runtime polymorphism 
		obj.show();
		//obj.config();
		obj = new C1();
		obj.show();//Dynamic method dispatch
	}

}
