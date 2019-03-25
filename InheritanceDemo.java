//Is-A, Has-A
package oops;
class Calculator{ //Super class
	public int add(int i, int j)
	{
		return i+j;
	}
}
class CalcAdv extends Calculator{ //sub class Is-A relation
	
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class CalcVeryAdv extends CalcAdv{//sub class java supports multi level inheritance 
	//java doesnt multiple inheritance
	//supposes if we extend one class with multiple classes and same method presents in both the classes then complier will think with method we need to call then it was an ambiguty
	public int multi(int i,int j)
	{
		return i*j;
	}
}
public class InheritanceDemo {
//Has-A
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculator c1 = new Calculator();
		//System.out.println(c1.add(10, 20));
		CalcAdv c2 = new CalcAdv();
		System.out.println(c2.add(20, 50));
		CalcVeryAdv c3 = new CalcVeryAdv();
		System.out.println(c3.multi(10, 3));
		
		
	}

}
