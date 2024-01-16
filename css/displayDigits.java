import java.util.Scanner;
public class displayDigits
{ //start class
	public static void main(String[] args)
	{ //start main method
		Scanner keyboard = new Scanner(System.in);
		int iDigits, n, m, a, i=1, counter=0;
		System.out.print("Enter a three-digit number: ");
		n = keyboard.nextInt();

			m=n;
			while(n >3)
			{
				n = n/10;
				counter++;
			}
			while(m>0)
			{
				a = m%10;
				System.out.println("position :"+ a);
				m =m/10;
				counter--;
			}
  	} //end main method
} //end class