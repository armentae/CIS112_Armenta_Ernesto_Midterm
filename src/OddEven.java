import java.util.Scanner;


public class OddEven
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int computerNum;
		int userGuess;
		String Word;
		System.out.println("Do you want to play, Yes or No?");
		Word = input.next();
		while (!Word.equals("No"))
		{
			
			System.out.println ("Please guess if number odd or even, enter 1 for odd and 2 for even");
			computerNum = 0 + (int) (Math.random()*10);
			userGuess = input.nextInt();
			System.out.printf("The computer number is %d ",computerNum);
			System.out.println();
			if (computerNum % 2== 0 && userGuess == 2) 
			{
				System.out.println (" correct guess");
			}
			else
			{
				System.out.println("wrong guess");
			}
			System.out.println("Do you want to play, Yes or No?");
		}
		
	}

}