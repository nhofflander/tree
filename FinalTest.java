/**
 * @(#)FinalTest.java
 *
 *
 * @author 
 * @version 1.00 2018/11/27
 */

import java.util.Scanner;
public class FinalTest 




{

    public static void main (String [] args)
    	
    	
   	{
   		
   		int path;
   		int runthis = 1; 
   		final int DIGITS = 3;
   		int Riddle;
   		
   		 
   		
   		
   		while (runthis == 1)
   		{
   		
   
   	
   		
   		Scanner scan = new Scanner (System.in);
   		Scanner gang = new Scanner (System.in);
   		Scanner bum = new Scanner (System.in);
   	
   		System.out.println ("You find yourself waking up in a dark cave, not knowing how you got there.");
   		System.out.println ("In front of you lies 3 different paths. One leads to treasure, the next leads to the exit, and the last leads to certain death.");
   		System.out.println ("Choose wisely!");
   		System.out.println ("To choose a path, enter either the number 1, 2, or 3.");
   		
   		path = scan.nextInt();
   		
   		
   		if (path == 1)
   		
   		
   		
   		{
   			System.out.println ("You walk down the path and turn a corner.\nAhead of you is a light that looks like it leads to the outside.\nYou get excited and break into a run, only to find yourself falling down a hole and into a pit of lava.\nYou have died.");	
   		}
   		
   		if (path == 2)
   			
   		{
   		
   		
   		{
   		
   			System.out.println ("You walk down the path for what seems to be hours.\nYou are just about to turn back when you notice a faint light up ahead.\nYou keep walking and you find the entrance to the cave.\nYou are stopped short of the entrace by a gate keeper who says that to exit, you have to solve a riddle.");
   			System.out.println ("The riddle is: What can run but never walks, what has a mouth but never talks, has a bed but never sleeps, has a head, but never weeps?.");
   			System.out.println ("Please enter either 1 for rain, 2 for human, 3 for river, or 4 for computer.");
   			Riddle = bum.nextInt();
   		}
   		
   		if (Riddle == 3)
   		{
   			System.out.println ("You have escaped.");
   		}
   		else 
   		{
   			System.out.println ("You have got the riddle wrong and are not allowed to exit the cave.");
   		}
   		
   		}
   		
   	
   		
   		
   		
   		
   		if (path == 3)
   		{
   			System.out.println ("You walk down the path and enter a vast chamber.\nIn the center of the chamber, you find a large chest.\nWhen you open the chest, you are surprised to find jewels are jems of every sort.\nYou take some of the treasure and head back the way you came.\nYou are able to choose another path.");
   			
   			System.out.println ("To choose the next path that you take, please select the either the number 4 or 5.");
   			
   			path= scan.nextInt();
   			
   			if (path == 4)
    			{
   			System.out.println ("You walk down the path for what seems to be hours.\nYou are just about to turn back when you notice a faint light up ahead.\nYou keep walking and you find the entrance to the cave.\nYou are stopped short of the entrace by a gate keeper who says that to exit, you have to solve a riddle.");
   			System.out.println ("The riddle is: What can run but never walks, what has a mouth but never talks, has a bed but never sleeps, has a head, but never weeps?.");
   			System.out.println ("Please enter either 1 for rain, 2 for human, 3 for river, or 4 for computer.");
   			Riddle = bum.nextInt();
   			
   			if (Riddle == 3)
   		{
   			System.out.println ("You have escaped.");
   		}
   		else 
   		{
   			System.out.println ("You have got the riddle wrong and are not allowed to exit the cave.");
   		}
    			}
   		
   			
   			if (path == 5)
   			{
   				System.out.println ("You walk down the path and turn a corner.\nAhead of you is a light that looks like it leads to the outside.\nYou get excited and break into a run, only to find yourself falling down a hole and into a pit of lava.\nYou have died.");
   			}
   		

   		
    
   	}
    	System.out.println (""); 
   			
   	System.out.println ("Do you want to play again? (Enter either 1 for yes or 2 for no)");
   		runthis = gang.nextInt();
 		
   	System.out.println ("");
    }
    
}

}