/* Author S.Y (Eric) Kim. Mini Project Assignment.
   This is the sports quiz program about Manchester United.

*/

import java.util.*; // input method

public class sportQuiz {
    public static void main(String[]args) {
        Teams[] manUnited = new Teams[3];
        boolean start = false;
        System.out.println("Welcome to the sports quiz! Enter 1 to begin: ");
        int response = userInput();
        if (response == 1) {
            start = true;
        }
        while (start) {
            menu(); //goes to menu method

            int catagoryChoice = userInput(); //takes user input and puts it in variable
            quiz(catagoryChoice, manUnited); //quiz method takes variable.
            System.out.println("Would youl like to continue with the program? (Y/N)");
            String isContinue = strInput();
            if (isContinue.equalsIgnoreCase("y")) {
                menu();
            } else {
                System.out.println("Thank you for using thr program");
                System.exit(0);
            }
            break;
        }
    }
    public static void menu()
    {
        System.out.println("Chose from the following 2 catagories:\n ");
        System.out.println("1 - Cups and Wins.");
        System.out.println("2 - Most Goal Scored.");
        System.out.println("3 - Most Appearances.");
        System.out.println("4 - Most Spent on player");

    }
    public static int quiz(int catagoryChoice, Teams[] team)
    {
        int score = 0;
        if(catagoryChoice == 1)
        {
            boolean isRightCat1 = catagory1();
            if(isRightCat1)
            {
                System.out.println("You're correct!");
                score++;
                System.out.println("Your current score: "+score);
            }
            else
                System.out.println("Incorrect!");
        }
        if(catagoryChoice == 2)
        {
            boolean isRightCat2 = catagory2();
            if(isRightCat2)
            {
                System.out.println("You're correct!");
                score++;
                System.out.println("Your current score: "+score);
            }
        }
        return score;
    }
    public static boolean catagory1()
    {
        Teams[] manUnited = new Teams[3];
        System.out.println("How many FA cups have manchester united won?: ");
        int cupsAnswer = userInput();
        answers(manUnited);
        int score = 0;
        if(cupsAnswer == getFaCups(manUnited[0]))
        {
            return true;

        }
        else
            System.out.println("You're incorrect!");

        return false;
    }
    public static boolean catagory2()
    {
        Teams[] manUnited = new Teams[3];
        System.out.println("What's the most goals score and who scored them?");
        int mostGoals = userInput();
        String scoredBy = strInput();
        answers(manUnited);
        int score = 0;
        if(mostGoals == getMostGoalScored(manUnited[1]) && scoredBy == getMostGoalScorer(manUnited[1]))
        {
            return true;
            /* score = 2;
            System.out.println(score);*/
        }
        else
            System.out.println("You're incorrect!");

        return false; //return score;
    }
    public static void answers(Teams[] manUntd)
    {
        manUntd[0] = new Teams();
        manUntd[1] = new Teams();
        manUntd[2] = new Teams();
        //manUntd[3] = new Teams();


        manUntd[0] = setFaCups(manUntd[0],12);
        manUntd[1] = setMostGoalScored(manUntd[1], 963);
        manUntd[1] = setMostGoalScorer(manUntd[1], "Ryan Giggs");
        manUntd[2] = setMostPaidForPlayer(manUntd[2],80000000);
        manUntd[2] = setmostExpensiveTransferedPlayer(manUntd[2],"Paul Pogba");
        //manUntd[3] = setMostGoalScorer(manUntd[3],"Ryan Giggs");

    }

    public static int getFaCups(Teams m) {
        return m.faCups;
    }

    public static Teams setFaCups(Teams m, int faCups) {
        m.faCups = faCups;
        return m;
    }

    public static int getMostGoalScored(Teams m) {
        return m.mostGoalScored;
    }

    public static Teams setMostGoalScored(Teams m, int mostGoalScored) {
        m.mostGoalScored = mostGoalScored;
        return m;
    }

    public int getMostPaidForPlayer(Teams m) {
        return m.mostPaidForPlayer;
    }

    public static Teams setMostPaidForPlayer(Teams m,int mostPaidForPlayer) {
        m.mostPaidForPlayer = mostPaidForPlayer;
        return m;
    }

    public static String getMostGoalScorer(Teams m) {
        return m.mostGoalScorer;
    }

    public static Teams setMostGoalScorer(Teams m, String mostGoalScorer) {
        m.mostGoalScorer = mostGoalScorer;
        return m;
    }

    public static String getPlayerMostAppearances(Teams m) {
        return m.playerMostAppearances;
    }

    public static Teams setPlayerMostAppearances(Teams m, String playerMostAppearances) {
        m.playerMostAppearances = playerMostAppearances;
        return m;
    }

    public static String getMostExpensiveTransferedPlayer(Teams m) {
        return m.mostExpensiveTransferedPlayer;
    }

    public static Teams setmostExpensiveTransferedPlayer(Teams m,String mostExpensiveTransferedPlayer) {
        m.mostExpensiveTransferedPlayer = mostExpensiveTransferedPlayer;
        return m;
    }
    public static int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        int respones = scanner.nextInt();
        return respones;
    }
    public static String strInput()
    {
        Scanner scanner = new Scanner(System.in);
        String respones = scanner.nextLine();
        return respones;
    }

}
class Teams {
    int faCups; //12 963
    int mostGoalScored;
    int mostPaidForPlayer;
    String mostGoalScorer;
    String playerMostAppearances;
    String mostExpensiveTransferedPlayer;
}