package hospitalstay;

import java.util.Scanner;

public class hospitalstay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	double medicalCharge = 0, labService = 0, hospitalCharges = 0,totalCost;
	String response = "";
	

	do{
		if(checkForOvernight() == true)
		{
			System.out.println("Enter the cost of Hospital Stay: ");
			hospitalCharges = in.nextDouble();
		}
		else
		{
			hospitalCharges = 0;
		}
		System.out.println("Enter the cost of Medical Charges: ");
		medicalCharge = in.nextDouble();
		
		System.out.println("Enter the cost of Lab Service: ");
		labService = in.nextDouble();
		
		totalCost = hospitalCharges + medicalCharge + labService;
		
		System.out.println(totalCost);
		
		System.out.println("Do you have another patient? (Y/N) ");
		response = in.next();
	} while(response.equalsIgnoreCase("y"));
	}
	
	public static boolean checkForOvernight()
	{
		Scanner in = new Scanner(System.in);
		String response = "";
		System.out.println("Do you have another patient? (Y/N) ");
		response = in.next();
	if(response.equalsIgnoreCase("y"))
	return true;
	else
	return false;
	}
		public static void printTotal(double totalCost)
		{
			
			System.out.printf("The total cost for the paitent is: $%6.2f", totalCost);
		}
		
	}

