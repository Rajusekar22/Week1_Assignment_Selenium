package week1.HomeAssignmentDataTypes;


public class Palindrome {

	public void palNumber(){
		int input=121,output=0,rem;
		int originalNumber=input;
		if(originalNumber<0) {
			System.out.println("The given number is not a Palindrome");
		}
			else {
		for (int i = input; i!=0; i=i/10) {
			rem=i%10;
			output=(output*10)+rem;
				
					}
		if(originalNumber==output) {
			System.out.println("The given number is a palindrome");
		}else
		{
			System.out.println("The given number is not a palindrome");
		}
			}
	}
	public static void main(String[] args) {
				Palindrome check=new Palindrome();
		check.palNumber();
	}
}
 