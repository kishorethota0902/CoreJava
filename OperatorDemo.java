package premitiveVariables;

public class OperatorDemo {
	/*
	 * Arithematic +,-,*,/,%
	 * Bitwise
	 * Relational
	 * Logical
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=6 , n=4;
		int r1 = m+n;
		int r2 = m-n;
		int r3 = m*n;
		double r4 = (double)m/n;
		int r5 = m%n;
		n+=m;
		++n;// pre increment
		n++;// post increment
		n--;
		//m = ++n;
		m = n++;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(m);
		
	}

}
