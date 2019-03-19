package premitiveVariables;

public class SelectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		
		if(true)
			System.out.println("Kishore");
		if(false)
		System.out.println("Bug");
		
		if(n== 0)
			System.out.println("ZERO");
		else if(n%2 == 0)
			System.out.println("Even");
		else
			System.out.println("ODD");
		
		//ternary operator
		// ?: condition?expr1:expr2
		int i=8, j= 0;
		
		//if(i>6)
		//j=1;
		//else
			//j=2;
		j= i>6?1:2;
		System.out.println(j);
		int p=4;
		String s = "bbc" ;
	
		//switch case
		switch(s) {
		case "abc":
			System.out.println("Kishore");
			break;
		case "bbc":
			System.out.println("Anusha");
			break;
		case "ccd":
			System.out.println("Kalyani");
			break;
			default:
				System.out.println("Solo life");
		}
		
	}

}
