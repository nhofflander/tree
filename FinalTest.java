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

    public static void main(String[] args) 
    {
    	int path;
    	int runthis = 1;
    	int Riddle;
    	int sword;
    
    	final int DIGITS = 3;
    	
    	while (runthis == 1)
    	{
    	  	
    	Scanner scan = new Scanner (System.in);
    	
    	
    	System.out.println("You have been on a ship for days when a terrible storm comes along and destroys the ship that you are on and everyone on it is killed.\nYou managed to survive the storm and make way to the life raft.");
    	System.out.println("Just before you give up hope you see an island in the distance. \nAs you approach the shore you see natives coming to you, leaving the shore.");
    	System.out.println("Before the men reach you, you go unconcious from lack of food and water. That is the last thing you remember. ");
    	System.out.println("When you wake up you find yourself in a dark room.");
    	System.out.println("In front of you lies three opitions, three doors that will have a profound effect on your life.");
    	System.out.println("Behind one door lies a vast amount of treasure. ");
    	System.out.println("One door leads to Freedom. ");
    	System.out.println("One door leads to certain death. ");
    	System.out.println("Enter 1, 2 or 3 to determine your path. ");
    	
    	path = scan.nextInt();
    	path = (int) (Math.random() * DIGITS);
    	
    	
    	if (path == 1)
    	{
       		System.out.println("You have found the Treasure!!");
       		
       		System.out.println("Now select 4 or 5 in order to leave the room. Choose wisely for it might cost you your life");
       		
       		path = scan.nextInt();
       		
       		if (path == 4)
       
       		{
       			System.out.println("You have found the EXIT!! Freedom is near. \nYou have one more trial that you need to overcome in order to be released from the treacherous room.\nAnswer the following questions, but take your time for it means your life.");
       			System.out.println("Who has the record for must rushing yards in a NFL season? \nEnter 1 for Walter Payton \nEnter 2 for Barry Sanders \nEnter 3 for Eric Dickerson \nEnter 4 for Emmit Smith");
       			Riddle = scan.nextInt();
       			if (Riddle == 1)
       			{
       				System.out.println("You have died");
       			}
       			if (Riddle == 2)
       			{
       				System.out.println("You have died");
       			}
       			if (Riddle == 3)
       			{
       				System.out.println("You are correct and your prize is this sword! Press 1 to pick it up or 2 to leave it behind");
       				
       				sword = scan.nextInt();
       				
       				if (sword == 1)
       				{
       					System.out.println("You have recieved the almighty sword which will guide you to freedom. Congrats!");
       				}
       				
       				if (sword == 2)
       				{
       					System.out.println("You have decided to leave the almighty sword behind. Because of this you are overrun be an enemy horde resulting in your death.");
       				}
       			}
       			if (Riddle == 4)
       			{
       				System.out.println("You have died");
       			}
       		}
       		
       		if (path == 5)
       		{
       			System.out.println("You walked into a claymore and exploded!");
    		}
    	}
    	
    	if (path == 2)
    	{   	
    		System.out.println("You walked into a claymore and exploded! ");
    	}
    	
    	if (path == 3)
    	{
       		System.out.println("You have found the EXIT!! Freedom is near. \nYou have one more trial that you need to overcome in order to be released from the treacherous room. \nAnswer the following questions, but take your time for it means your life.");
       		System.out.println("Who has the record for must rushing yards in a NFL season? \nEnter 1 for Walter Payton \nEnter 2 for Barry Sanders \nEnter 3 for Eric Dickerson \nEnter 4 for Emmit Smith");
    		Riddle = scan.nextInt();
    		if (Riddle == 1)
       			{
       				System.out.println("You have died");
       			}
       			if (Riddle == 2)
       			{
       				System.out.println("You have died");
       			}
       			if (Riddle == 3)
       			{
       				System.out.println("You are correct and your prize is this sword! Press 1 to pick it up or 2 to leave it behind");
       				
       				sword = scan.nextInt();
       				
       				if (sword == 1)
       				{
       					System.out.println("You have recieved the almighty sword which will guide you to freedom. Congrats!");
       				}
       				
       				if (sword == 2)
       				{
       					System.out.println("You have decided to leave the almighty sword behind. Because of this you are overrun be an enemy horde resulting in your death.");
       				}
       			}
       			if (Riddle == 4)
       			{
       				System.out.println("You have died");
       			}	
    
    	}
    		
			System.out.println("");
			System.out.println("Would you like to play again? If YES enter 1 / If NO enter 2");
    		runthis = scan.nextInt();
    
    }
    }  
    }
    
    