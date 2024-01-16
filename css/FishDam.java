import java.util.Scanner;
import java.text.DecimalFormat;
public class FishDam
{ //start class
	public static void main(String[] args)
	{ //start main method
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard1 = new Scanner(System.in);
		int iCoats, iLitres, iTins, iDepth; 
		double rDepth, rTins, rLitres;
		DecimalFormat formatter = new DecimalFormat( "###,###.00"); //you need to enter a formatting pattern
		
		System.out.print("Depth of dam: ");
		rDepth = keyboard.nextDouble();
		System.out.print("Number of coats to paint: ");
		iCoats = keyboard1.nextInt();
		rLitres = 10*15*rDepth;
		System.out.print("You will need "+ rLitres+" Litres water");
		rTins= (rDepth*10*15)/(rDepth*1.5);
		System.out.print("You need to buy "+ rTins +" tins of paint.");

		
  	} //end main method
} //end class