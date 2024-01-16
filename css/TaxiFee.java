import java.util.Scanner;
import java.text.DecimalFormat;
public class TaxiFee
{ //start class
	public static void main(String[] args)
	{ //start main method
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("R###.00");
		int iNumAdults, iNumBabies;
		double rFirstFee, rAdultFee, rBabyFee, rTotal;		
		final double MORE_THAN_6 = 40.0;
		final double FIRST_NUM = 6;
		final double BABY_PERC = 0.2;

		
		System.out.print("Number of adults: ");
		iNumAdults = keyboard.nextInt();
		System.out.print("Number of babies: ");
		iNumBabies = keyboard.nextInt();
		System.out.print("Fee for first 6 passengers: R");
		rFirstFee = keyboard.nextDouble();
		
		rAdultFee = FIRST_NUM * rFirstFee + (iNumAdults - FIRST_NUM) * MORE_THAN_6;
		rBabyFee = BABY_PERC * rFirstFee * iNumBabies;
		rTotal = rAdultFee + rBabyFee;
		
		System.out.println("Adults pay\t" + formatter.format(rAdultFee));
		System.out.println("Babies pay\t" + formatter.format(rBabyFee));
		System.out.println("===========================");
		System.out.println("Total cost\t" + formatter.format(rTotal));
		
  	} //end main method
} //end class