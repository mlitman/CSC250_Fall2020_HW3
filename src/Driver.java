import java.util.Random;

public class Driver 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int[] ar = new int[100];
		for(int i = 0; i < ar.length; i++)
		{
			/*
			int temp = r.nextInt();
			if(temp < 0)
			{
				temp = temp * -1;
			}
			temp = temp % 15;
			temp++;
			*/
			/*
			int temp;
			do
			{
				temp = r.nextInt();
			}
			while(temp < 1 || temp > 15);
			System.out.println(temp);
			*/
			int temp = r.nextInt(15)+1;
			ar[i] = temp;
		}
		Driver.printIntArray(ar);
	}
	
	public static void printIntArray(int [] ar)
	{
		for(int i : ar)
		{
			System.out.println(i);
		}
	}
}
