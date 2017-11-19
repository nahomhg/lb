/*
AUTHOR: Nahom Ghilazghi:
This program is a big project compiled off 8 of the tasks (input/output, assignment expressions, decisions,
records, loops, arrays, loops in loop, Sorting and ADT). This program shows the user team GB and USA's medals
and asks them whether there is an update or not. If there is an update it asks for which team, then if the numbers for one
team is higher than the other, then it places the highest team as number 1.
This program includes: Arrays, Loops in loops and Sorts + ADT
*/
import java.util.Scanner;
class wholeProg
{
    public static void main(String[] args)
    {
        Team[] teams = new Team[2]; //Creates array of teams .

        initialiseTeams(teams);//Initializing teams

        displayMedalResults(teams);//Displaying the medal results with the 'teams' as an argument

        boolean updateAvailable = isThereUpdate(); //Update available calls the method 'isThereUpdate' that asks if there is an update
		
		/*While there is an update available, ask user which team they want to update, update the given team and display given results. 
		Ask the user if they'd like to update again. When there's no more update, then display a goodbye message.
		*/
        while (updateAvailable)
        {
            int selectedTeam;

            if (updateAvailable)
            {
                selectedTeam = teamsMenu(teams);
                updateMedals(teams[selectedTeam]);
            }
            sortingMedals(teams);
            System.out.println("In decending order of the winning team, the team with the highest medal is:");
            displayMedalResults(teams);
            updateAvailable = isThereUpdate();
        }
        System.out.println("Thank you for using our program"); //Goodbye message
    }
    public static void initialiseTeams(Team[] teams)
    {
        teams[0] = new Team(); //Instance 1
        teams[1] = new Team(); //Instance 2

        //This sets the name, amout of gold, amount of bronze and amount of silver medals of the team to another an index of the array 'teams'.
        teams[0] = setName(teams[0],"GB");
        teams[0] = setGold(teams[0], 27);
        teams[0] = setSilver(teams[0],23);
        teams[0] = setBronze(teams[0],17);

        //This sets the name, amout of gold, amount of bronze and amount of silver medals of the team to another an index of the array 'teams'.
        teams[1] = setName(teams[1],"USA");
        teams[1] = setGold(teams[1], 23);
        teams[1] = setSilver(teams[1],20);
        teams[1] = setBronze(teams[1],15);
    }
    public static void displayMedalResults (Team[] teams)
    {
        System.out.println("Team \t G \t S \t B \t Total");
        for(int i = 0; i<teams.length; i++)
        {
            System.out.println(getName(teams[i])+" \t"+getGold(teams[i])+"\t"+getSilver(teams[i])+"\t"+getBronze(teams[i])+"\t"+getTotalMedals(teams[i]));
            //Gets each team's information (name, gold medals, silver medals and bronze medals) by the itteration.
        }
    }
    public static Team updateMedals(Team t)
    {
        Scanner scanner = new Scanner(System.in);
        int gold, silver, bronze;
        System.out.println("How many gold won?");
        gold = scanner.nextInt(); //Places what the user inputs into the variable 'gold'.
        t = setGold(t,gold);

        System.out.println("How many silver won?");
        silver = scanner.nextInt(); //Places what the user inputs into the variable 'silver'.
        t = setSilver(t,silver);

        System.out.println("How many bronze won?");
        bronze = scanner.nextInt(); //Places what the user inputs into the variable 'bronze'.
        t = setBronze(t,bronze);

        return t;
    }
    public static int teamsMenu(Team[] teams)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("Welcome user to the 2016 medal update program");
        System.out.println("Please choose the country you'd like to update");
        for(int i = 0; i<teams.length; i++)
        {
            System.out.println(i+1+". "+teams[i].name);
        }
        int response = scanner.nextInt();
        return response-1;
    }
    public static boolean isThereUpdate()
    {
        System.out.println("Are there any updates to the medals? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Y"))
        {
            return true;
        }
        return false;
    }
    public static void sortingMedals (Team[] teams)
    {
        boolean sorted=false; //Declaring sort as a false/negative boolean

        while (!sorted) //saying while sorted is not true, execute what's in the body.
        {
            sorted = true; //Stating the sorted is true.

            for (int i=0; i < teams.length-1; i++)
            {
                if (getTotalMedals(teams[i]) < getTotalMedals(teams[i+1])) //If the team index 1 is higher than the index 0, than execute what's in the body.
                {
                    Team temp = teams[i+1];
                    teams[i+1] = teams[i];
                    teams[i] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static Team setName (Team t, String name)
    {
        t.name = name;
        return t;
    }
    public static Team setGold (Team t, int gold)
    {
        t.gold += gold; //Adds on the input value of gold into the old value of gold.
        return t;
    }
    public static Team setSilver (Team t, int silver)
    {
        t.silver += silver; //Adds on the input value of silver into the old value of silver.
        return t;
    }
    public static Team setBronze (Team t, int bronze)
    {
        t.bronze += bronze; //Adds on the input value of bronze into the old value of bronze.
        return t;
    }
    public static String getName (Team t)
    {
        return t.name; //returning the name from the class Team
    }
    public static int getGold (Team t)
    {
        return t.gold; //returning the gold from the class Team
    }
    public static int getSilver (Team t)
    {
        return t.silver; //returning the silver from the class Team
    }
    public static int getBronze (Team t)
    {
        return t.bronze; //returning the bronze from the class Team
    }
    public static int getTotalMedals (Team t)
    {
        t.total = t.gold + t.silver + t.bronze;
        return t.total; //Gets and returns the value of the total by adding the values of silver, gold and bronze.
    }
}
class Team
{
    String name; //Declaring variables
    int gold; //Declaring variables
    int silver; //Declaring variables
    int bronze; //Declaring variables
    int total; //Declaring variables
} 