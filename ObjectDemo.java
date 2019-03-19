package premitiveVariables;
class Calc{
	int num1;
	int num2;
	int result;
	public Calc()
	{
		//constructor has same name as class
		//does not return any value
		//whenever obj is created constructor will call automatically
		num1 = 5;
		num2 = 5;
		System.out.println("Inside the constructor");
	}
	public Calc(int n)
	{
		num1 =n;
		num2 = n;
	}
	//we can have multiple constructors with different signature
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calc obj = new Calc(8); //knows something(variables) and does something(methods) //constructor
			System.out.println(obj.num1);
	}

}
