import java.util.Scanner;

public class TravelTimeCalculator 
{

	public static void main(String[] args)
	{
		System.out.println("Welcome!  This App will calculate Travel times using \n"
				+ "distance and speed.\n");
		
		String choice = "Y";
		Scanner sc = new Scanner(System.in);
		
				
		while(choice.equalsIgnoreCase("Y")) 
		{
			System.out.print("\nDistance traveled in miles: ");
			double miles = sc.nextDouble();
			System.out.print("\nAverage speed in mph: ");
			double mph = sc.nextDouble();
			
			int hours = (int) ((int)miles/mph);
			int minutes= (int) ((int)miles%mph);
			
			System.out.println("\n  It will take approximately \n\n"
							+ hours + " hour(s), and " + minutes + " minutes \n\n"
									+ "to reach your destination!");
			while (!choice.equalsIgnoreCase("n")) 
			{
				System.out.print("\n\tWould you like to do another?  y/n:  ");
				choice = sc.next();
				if(choice.equalsIgnoreCase("y"))
				{
					break;
				}
			}
		}
		sc.close();
		System.out.println("Okay then, bye bye now!");
	}

}


