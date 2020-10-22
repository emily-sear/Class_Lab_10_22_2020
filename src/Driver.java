import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		GolfBag litmansGolfBag = new GolfBag("/src/golfClubs");
		System.out.println("Your Bag of Golf Clubs: ");
		for(int i = 0; i < litmansGolfBag.getGolfBag().size(); i++)
		{
			litmansGolfBag.getGolfBag().get(i).display();
		}
		System.out.println();
		System.out.println();
		
		System.out.println("How far do you want to hit your ball?");
		Scanner input = new Scanner(System.in);
		
		Driver.findClub(input.nextDouble(), litmansGolfBag);

	}
	
	public static void findClub(double distance, GolfBag golfBag)
	{
		ArrayList<GolfClub> golfBagList = golfBag.getGolfBag();
		GolfClub perfectOne = golfBagList.get(0);
		for(int i = 1; i < golfBagList.size(); i++ )
		{
			if(golfBagList.get(i).getDistance() > perfectOne.getDistance() && golfBagList.get(i).getDistance() <= distance)
			{
				perfectOne = golfBagList.get(i);
			}
			if(golfBagList.get(i).getDistance() > distance)
			{
				break;
			}
		}
		
		if(golfBagList.get(0).getDistance() > distance)
		{
			System.out.println("I am sorry there are no clubs that will hit under that amount. I can suggest your smallest club: ");
			golfBagList.get(0).display();
		}
		else
		{
			System.out.println("Your best selection is: \n");
			perfectOne.display();
		}
	}
}
