import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String numberAsAString = input.nextLine();
		int numberAsAnInt = Integer.parseInt(numberAsAString);
		String answer = "";
		while(numberAsAnInt != 0)
		{
			answer = (numberAsAnInt % 2) + answer;
			numberAsAnInt = numberAsAnInt / 2;
		}
		System.out.println(answer);
	}
}
