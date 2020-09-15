import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String numberAsAString = input.nextLine();
		int numberAsAnInt = Integer.parseInt(numberAsAString);
		System.out.println(Driver.decimalToBinary(numberAsAnInt));
		System.out.println(Driver.decimalToOctal(numberAsAnInt));
		System.out.println(Driver.decimalToDecimal(numberAsAnInt));
		System.out.println(Driver.decimalToHex(2989));
	}
	
	public static String decimalToHex(int numberAsAnInt)
	{
		String answer = "";
		String map = "0123456789ABCDEF";
		while(numberAsAnInt != 0)
		{
			int temp = (numberAsAnInt % 16);
			answer = map.charAt(temp) + answer;
			numberAsAnInt = numberAsAnInt / 16;
		}
		return answer;
	}
	
	public static String decimalToDecimal(int numberAsAnInt)
	{
		String answer = "";
		while(numberAsAnInt != 0)
		{
			answer = (numberAsAnInt % 10) + answer;
			numberAsAnInt = numberAsAnInt / 10;
		}
		return answer;
	}
	
	public static String decimalToOctal(int numberAsAnInt)
	{
		String answer = "";
		while(numberAsAnInt != 0)
		{
			answer = (numberAsAnInt % 8) + answer;
			numberAsAnInt = numberAsAnInt / 8;
		}
		return answer;
	}
	
	public static String decimalToBinary(int numberAsAnInt)
	{
		String answer = "";
		while(numberAsAnInt != 0)
		{
			answer = (numberAsAnInt % 2) + answer;
			numberAsAnInt = numberAsAnInt / 2;
		}
		return answer;
	}
}
