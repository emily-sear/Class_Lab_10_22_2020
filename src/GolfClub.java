public class GolfClub 
{
	private String name;
	private double distance;
	 
	public GolfClub(String name, double distance)
	{
		this.name = name;
		this.distance = distance; 
	}
	
	public GolfClub(String file)
	{
		String[] fileSpilt = file.split(":");
		this.name = fileSpilt[0];
		this.distance = Double.parseDouble(fileSpilt[1]);
	}
	public String getName()
	{
		return this.name;
	}
	
	public double getDistance()
	{
		return this.distance;
	}
	
	public void display()
	{
		System.out.println("Name of Golf Club: " + this.name + "\nHow far the ball goes when hit by club: " + this.distance);
	}
}
