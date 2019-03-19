package premitiveVariables;
class Calc1{
	int num1;
	int num2;
	int result;
	public Calc1(int num1, int num2){
		this.num1 = num1;//this keyword represents current obj
		this.num2 = num2;
	}
}
public class ConstructDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 obj = new Calc1(4,5);
		System.out.println(obj.num1 + obj.num2);
	}

}
