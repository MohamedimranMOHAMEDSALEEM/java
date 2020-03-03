package game;

import java.util.Scanner;

public class Game {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] mainArray = { "v", "a", "l" , "e" , "o" };
		String[] sampleArray = { "_", "_", "_" , "_" , "_" };
		int CHANCE = 5;
		int count=0,secondLimit,sampleCount=0;
		Scanner scan = new Scanner(System.in);
		for(int firstLimit = 0; firstLimit<CHANCE;firstLimit++)
		{
			String enterChracter = scan.next();
    		boolean found = true;


			for (secondLimit = 0; secondLimit < mainArray.length; secondLimit++)
			{
				if(enterChracter.equals(mainArray[secondLimit])) 
				{
				   System.out.println("Correct");
				   sampleCount++;
				   found = false;
				   firstLimit--;
				   break;
				}
			}
			
			if(found)
			{
				   System.out.println("Sorry Wrong");
				   System.out.println("you lossed one chance");

				   count++;
				   if(count==CHANCE-1)
				   {
				       System.out.println("This is the last chance : [HINT : FRANCE BASED AUTOMOBILE COMPANY]");
				   }
				   if(count==CHANCE)
				   {
					   System.out.println("The end");
					   break;

				   }

			}
			else
			{
			    for(int thirdLimit=0;thirdLimit<sampleArray.length;thirdLimit++)
			    {
			        if(secondLimit==thirdLimit)
			        {
			            System.out.print(mainArray[secondLimit]);
			            sampleArray[secondLimit] = mainArray[secondLimit];
			            mainArray[secondLimit] = null;
			        }
			        else
			        {
			            System.out.print(sampleArray[thirdLimit] + " ");

			        }
			    }
			}
			if(sampleCount==CHANCE)
			{
				   System.out.println("\nCongratzz....You Won");
				   break;

			}
		}

	}

}
