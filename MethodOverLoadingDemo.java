package premitiveVariables;
class Casio{
	//Method OverLoading
	//public void add(int i , int j) {
		//System.out.println(i+j);
	//}
	//public void add(int i, int j, int k)
	//{
		//System.out.println(i+j+k);
	//}
	//Constructor OverLoading
	int num1;
	int num2;
	String Name;
	public Casio() {
		num1 = 1;
		num2 = 2;
		Name = "Kishore";
	}
	public Casio(int i) {
		num1 = i;
		num2 =2;
		Name = "Kishore";
	}
	public Casio(int i, int j, String na) {
		num1 = i;
		num2 =j;
		Name = na;
	}
	
}
public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj= new Casio(10,20,"Bug");
		//obj.add(10, 15, 25);
		
		System.err.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.Name);
	}

}
