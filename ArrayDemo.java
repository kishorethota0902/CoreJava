package premitiveVariables;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D Array
		int nums[] = new int[4];
		nums[0] = 8;
		nums[1]= 10;
		nums[2]= 15;
		nums[3]= 30;
		
		//2D Array
		int a[] = {1,2,3,4};
		int b[] = {2,3,4,5};
		int c[] = {5,6,7,8};
		
		int d[][]= {
				{1,2,3,4},
				{2,3,4},
				{5,6,7,8}
		};
		//d.length gives num of rows
		for(int i = 0;i<d.length;i++) {
			for(int j = 0;j<d[i].length;j++) {
				System.out.print(d[i][j]);	
			}	
			System.out.println();
		}
		
		
	}

}
