package oops;
//int float double
//Integer
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =5;
		Integer ii = new Integer(i);//Boxing - Wrapping
		System.out.println(ii);
		
		int j = ii.intValue();//UnBoxing - Un Wrapping
		System.out.println(j);
		
		Integer value = i;//AutoBoxing
		int k = value; //AutoUnBoxing
		System.out.println(k);
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
