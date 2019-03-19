package premitiveVariables;

public class JumpDemo {
//break, continue
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i <= 10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("value is "+i);
		}
		//continue will skip the particular condition
		for(int i =1; i <= 10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("value is "+i);
		}
	}

}
