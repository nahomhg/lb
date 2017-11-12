import java.util.*;

class Rhyme
{
	public static void main(String[] args)
	{
		execution();
	}
	public static void execution()
	{
		System.out.println("How mamy bottles are there?: ");
		int input = input();

		for(int i = input; i >= 0; i--)
		{
			if(i > 1){
				System.out.println(i+" green bottles, standing on a wall, \n "+i+" green bottles standing on a wall,\n but if 1 green bottle should accidentally fall\n There will be...");
				i -= 1;
				System.out.println(i+" green bottles, standing on the wall, \n"+i+" green bottles standing on a wall,\n but if 1 green bottle should accidentally fall\n There will be...");
			}
			else if(i == 1){
				System.out.println(i+" green bottles, standing on a wall, \n "+i+" green bottles standing on a wall,\n but if 1 green bottle should accidentally fall\n There will be...");
				i -= 1;
				System.out.println("No green bottles hanging on the wall.");
			}
			else 
				System.out.println("No green bottles hanging on the wall.");
		}
	}
	public static int input()
	{
		Scanner input = new Scanner(System.in);
		int response = input.nextInt();
		return response;
	}
}