package twod.view;

import twod.controller.TwoDController;
import twod.model.Hipster;


public class GridView
{
	public void printIntInformation(int [][] currentArray)
	{
		System.out.println("foreach printing");
		for(int [] currentRow : currentArray)
		{
			for(int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray.length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void printStringInformation(String [][] currentArray)
	{
		System.out.println("foreach printing");
		for(String [] currentRow : currentArray)
		{
			for(String currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray.length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void printHipsterInformation(Hipster [][] currentArray)
	{
		System.out.println("foreach printing");
		for(Hipster [] currentRow : currentArray)
		{
			for(Hipster currentNumber : currentRow)
			{
				System.out.print(currentNumber.getName() + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray.length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col].getName() + ", " + currentArray[row][col].getHipsterPhrase() +  "\t");
			}
			System.out.println();
		}
		
	}

}
