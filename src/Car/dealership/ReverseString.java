package Car.dealership;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder( );
//		sb.reverse();
		
//		StringBuilder sb1 = new StringBuilder("Mayur");
//		System.out.println("string=" +sb1);
//		sb1.reverse();
//		System.out.println("string="+ sb1);
		
		String str = "Avinash";
		String rev = " ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		

	}

	

}