package week1.HomeAssignmentDataTypes;

public class FibonacciSeries {
	
	public void fibonacci()
	{
		int n1=0,n2=1,n3,range=8;	
		System.out.println(n1+"\n"+n2);
		for(int i=3;i<=range;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
			
	}
	
	public static void main(String[] args) {
		FibonacciSeries fibseries=new FibonacciSeries();
		fibseries.fibonacci();
	
	}

}
