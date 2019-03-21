package premitiveVariables;

public class ArrayDemoEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,25};
		for(int k : a) {
			System.out.println(k);
		}
		
		int d[][]= {
				{1,2,3,4},
				{2,3,4},
				{5,6,7,8}
		};
		
		for(int i = 0;i<d.length;i++) {
			for(int j = 0;j<d[i].length;j++) {
				System.out.print(d[i][j]);	
			}	
			System.out.println();
		}
		//enhanced for loop
		for(int k[] : d) {
			for(int l : k)
			{
				System.out.print(" "+ l);
			}
			System.out.println();
		}
	}

}
