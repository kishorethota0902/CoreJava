package premitiveVariables;
class Cal{
	public int add(int ...n) { //(10, 20, 1,25,15,58) Variable length arguments
		int sum=0;
		for(int k:n) {
			sum= sum + k;
		}
		return sum;
		
	}
}
class Disp{
	public String show(String ...p) {
		String m="";
		for(String j:p)
		{
			m = m.concat(j);
		}
	return m;	
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal obj = new Cal();
		System.out.println(obj.add(10, 20, 1,25,15,58));
		Disp dis = new Disp();
		System.out.println(dis.show("Kishore", " Thota"," 0902"));
	}

}
