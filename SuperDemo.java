package oops;

class A{
	public A() {//super class
		System.out.println("Inside A");
	}
	public A(int i) {
		System.out.println("Inside A int");
	}
}
class B extends A{//sub class
	public B() {
		super(5);
		System.out.println("Inside B");
	}
	public B(int i) {
		super(i);
		System.out.println("Inside B int");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		
	}

}
