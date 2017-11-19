import java.util.*;

public class lorry {
    public static void main(String[]args)
    {
        int noOfLorries = 0;
        int itteration = 0;
        boolean quit = true;
        while(quit){
            System.out.println("What kind of vehicle have you seen?");
            String vehicle = input();
            itteration++;
            if(vehicle.equalsIgnoreCase("lorry"))
                noOfLorries++;
            if(vehicle.equalsIgnoreCase("CLOSE")){
                itteration--;
                quit = false;
            }
        }
        int total = calculatePercentage(noOfLorries,itteration);
        System.out.println("You saw "+noOfLorries+" lorries. Lorries were "+total+"% of all the vehicles seen in this session.");

    }
    public static int calculatePercentage(int lorries, int itter)
    {
        int percentage = (lorries*100)/itter;
        return percentage;
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

}
