import java.util.Scanner;


public class OddEven
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int computerNum;
		int userGuess;
		int count;
		int win;
		int lose;
		int gamesPlayed;
		win=0;
		lose=0;
		gamesPlayed=0;
		System.out.println("Do you want to play? Enter 1 for Yes or 2 for No");
		count = input.nextInt();
		do
		{
	
			System.out.println ("Please guess if number odd or even, enter 1 for odd and 2 for even");
			computerNum = 1 + (int) (Math.random()*20);
			userGuess = input.nextInt();
			System.out.printf("The computer number is %d ",computerNum);
			System.out.println();
			if ( (computerNum % 2== 0 && userGuess == 2)  || (computerNum % 2== 1 && userGuess == 1) )
			{
				System.out.println (" correct guess");
				win++;
			}
			else
			{
				System.out.println("wrong guess");
				lose++;
			}
			System.out.println();
			System.out.println("Do you want to play again? Enter 1 for Yes or 2 for No");
			count = input.nextInt();
			gamesPlayed++;
			}
		while (count!=2);
		if (count==2)
		{
			System.out.println("You won " + win + " times");
			System.out.println("You lost " + lose + " times");
			System.out.println("We played " + gamesPlayed + " times");
		}
		if (win>lose)
		{
			System.out.println("You won!!!");
		}
		else if (win<lose)
		{
			System.out.println("You lost!!!");
		}
		else
		{
			System.out.println("Tied game!!!");
		}
	}

}
