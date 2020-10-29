import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GolfBag
{
	private ArrayList<GolfClub> golfBag;
	
	public GolfBag()
	{
		this.golfBag = new ArrayList<GolfClub>();
	}
	
	public GolfBag(String file)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + file));
			while(input.hasNext())
			{
				this.golfBag.add(new GolfClub(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e)
		{
			System.out.println("No Golf Club found.");
		}
	}
	
	public void addClub(GolfClub golfClub)
	{
		this.golfBag.add(golfClub);
	}
	
	public ArrayList<GolfClub> getGolfBag()
	{
		return golfBag;
	}
}
