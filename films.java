import java.util.*;

class films{
	public static void main(String[]args)
	{
		filmArray();
	}
	public static void filmArray()
	{
		String[] films = new String[5]; //Creating a String array called 'films' that has 5 indexes.
		films[0] = "Despicable Me 3"; //Declaring the names of the films to each array index.
		films[1] = "Wonder Woman";
		films[2] = "IT";
		films[3] = "Cars 3";
		films[4] = "Hidden Figures";

		int[] money = new int[films.length]; //Creating a new array of type int, that has the same number of indexes as films.
		
		for(int i = 0; i < films.length; i++)//i = 0, for everytime 'i' is less than the number of indexes the array 'films' has, execute the body, then add 1 to i.
		{
			System.out.println("How much money did "+films[i]+" take in millions of dollars?: "); //films[i] is going through each index of films and getting it's name.
			money[i] = input(); //taking what the user input and putting into the index of money array.
		}

		int largestAmountGrossed = money[0]; //equaled the largest amount to the first value at the money array.
		int indexVal = 0; //declare and initised variable to 0.
		for(int n = 0; n < money.length; n++)
		{
			if(largestAmountGrossed < money[n]) //If the index at array 'money' is larger than the value at 'largestAmountGrossed'... 
			{
				largestAmountGrossed = money[n]; //...(continuing from last comment)then the place the new value of largestAmountGrossed to be whatever the 'n' is at the array 'money'
				indexVal = n; //equal indexVal to whatever the index number is at.
			}
		}
		for(int a = 0; a < films.length; a++)
		{
			if(indexVal == a) //If indexVal is equal to/the same as what the number 'a' is right now... 
			{
				System.out.println("The most largest grossing film is "+films[a]+" with the amount of: "+largestAmountGrossed);//..(continue from last comment) then tell them what the largest grossing film was and how much it made.
				break; //Once the indexVal is equal to 'a', stop the for loop and break out of it.
			}	
		}
		System.out.println("All the film's with their gross amount:\n ");
		for(int j = 0; j < films.length; j++)
		{
			System.out.println(films[j]+", "+money[j]); //Since each film's name and the amount of money they've made is in the same index, just print them out. 
		}
	}
	public static int input()
	{
		Scanner scanner = new Scanner(System.in);
		int response = scanner.nextInt();
		return response;
	}
}