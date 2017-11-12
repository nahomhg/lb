import java.util.*;

class TrainRecords{
	public static void main(String[]args)
	{
		stationName();
	}
	public static void stationName()
	{

		boolean quit = false;
		while(!quit)
		{
			System.out.println("What station do you need to know about?");
			String stationName = input();
			Station stn = stations(stationName);

			/*if((!"Mile End".equalsIgnoreCase(stationName) || (!"Kings Cross".equalsIgnoreCase(stationName) || (!"Woodford".equalsIgnoreCase(stationName) || (!"Oxford Circus".equalsIgnoreCase(stationName))))))
				System.out.println("Is "+stationName+" a London Underground station? Maybe check your spelling.");*/
			//else
			if(getAccesibility(stn) !=  false)
				System.out.println(stationName+" is in "+getZone(stn)+" and it is Wheel Chair accessible");
			else 
				System.out.println(stationName+" is in "+getZone(stn)+" and it is not Wheel Chair accessible");

			System.out.println("Would you like to quit?");
			String end = input();
			if(end.equalsIgnoreCase("Y"))
			{
				quit = true;
			}
		}
	}
	public static Station stations(String name)
	{
		if(name.equalsIgnoreCase("Mile End"))
		{
			Station station1 = new Station();
			station1 = setZone(station1, 2);
			station1 = setAccesibility(station1, false);
			return station1;
		}
		else if(name.equalsIgnoreCase("Kings Cross"))
		{
			Station station2 = new Station();
			station2 = setZone(station2, 1);
			station2 = setAccesibility(station2, true);
			return station2;

		}
		else if(name.equalsIgnoreCase("Woodford"))
		{
			Station station3 = new Station();
			station3 = setZone(station3, 4);
			station3 = setAccesibility(station3, true);
			return station3;
		}
		else if(name.equalsIgnoreCase("Oxford Circus"))
		{
			Station station4 = new Station();
			station4 = setZone(station4, 1);
			station4 = setAccesibility(station4, false);
			return station4;
		}
		else
		{
			Station station5 = new Station();
			station5 = setDoesExist(station5, "Is "+name+" a London Underground station? Maybe check your spelling.");
			return station5;
		}
	}
	public static int getZone(Station s)
	{
		return s.zone;
	}
	public static boolean getAccesibility(Station s)
	{
		return s.wheelChairAccessible;
	}
	public static String getDoesExist(Station s)
	{
		return s.doesExist;
	}
	public static Station setZone(Station s, int zoneNum)
	{
		s.zone = zoneNum;
		return s;
	}
	public static Station setAccesibility(Station s, boolean isAccessiable)
	{
		s.wheelChairAccessible = isAccessiable;
		return s;
	}
	public static Station setDoesExist(Station s, String doesExist)
	{
		s.doesExist = doesExist;
		return s;
	}
	public static String input()
	{
		Scanner scanner = new Scanner(System.in);
		String response = scanner.nextLine();
		return response;
	}
}
class Station{
	int zone;
	boolean wheelChairAccessible;
	String doesExist;
}