package simplecalulator;
import java.util.Scanner;
public class simplecalulator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double w,l,h;
		double numWin, winWidth,winHeight;
		double numDoors, doorWidth, doorHeight;
		double surfaceArea;
		
		System.out.println("Please Enter the Width, Length and Height of " + 
"the house to be painted");
		
		Scanner in = new Scanner(System.in);
		w = in.nextDouble();
		l = in.nextDouble();
		h = in.nextDouble();
		
		System.out.println("Please Enter the the number of Windows, the width and the height");
		numWin = in.nextDouble();
		winWidth = in.nextDouble();
		winHeight = in.nextDouble();
		
		System.out.println("Please Enter the number of Doors, width and height");
		numDoors = in.nextDouble();
		doorWidth = in.nextDouble();
		doorHeight = in.nextDouble();
		
		surfaceArea =(w * h * 2 + 1 * h * 2)- (numWin * winWidth * winHeight + numDoors * doorWidth * doorHeight);
		
	
		System.out.print("The total paint for surface area needed is" + " "+ surfaceArea);

	}

}
