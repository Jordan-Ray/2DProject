package twod.controller;

import twod.model.Hipster;
import twod.view.GridView;

public class TwoDController 
{
	private String[][] myNames;
	private int[][] myNumbs;
	private Hipster[][] myHipster;  
	
	
	public void start()
	{
		GridView myView = new GridView();	
		fillNames();
		myView.printStringInformation(myNames);
		
		fillNumbs();
		myView.printIntInformation(myNumbs);
		
		fillHipster();
		myView.printHipsterInformation(myHipster);
		
	}
	
	public TwoDController()
	{
		myNames = new String[4][4];
		myNumbs = new int[3][3];
		myHipster = new Hipster[2][2];
		
		
	}
	
	private void fillHipster()
	{
		myHipster[0][0] = new Hipster();
		myHipster[0][1] = new Hipster();
		
		myHipster[1][0] = new Hipster();
		myHipster[1][1] = new Hipster();
		
	}
	
	private void fillNames()
	{
		myNames[0][0] = "Jordan";
		myNames[0][1] = "Whitney";
		myNames[0][2] = "Emily";
		myNames[0][3] = "Bridger";
		myNames[1][0] = "Clark";
		myNames[1][1] = "Phineas";
		myNames[1][2] = "Ferb";
		myNames[1][3] = "Perry";	
		myNames[2][0] = "Aang";
		myNames[2][1] = "Starley";
		myNames[2][2] = "Seig";
		myNames[2][3] = "May";	
		myNames[3][0] = "Mitch";
		myNames[3][1] = "Morrie";
		myNames[3][2] = "Katniss";
		myNames[3][3] = "Peta";
		
	}
	
	private void fillNumbs()
	{
		myNumbs[0][0] = 16;
		myNumbs[0][1] = 26;
		myNumbs[0][2] = 18;
		myNumbs[1][0] = 76;
		myNumbs[1][1] = 59;
		myNumbs[1][2] = 95;
		myNumbs[2][0] = 28;
		myNumbs[2][1] = 11;
		myNumbs[2][2] = 37;
		
	}
	
	
}
