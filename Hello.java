/*Hello.java
*Hello improved with your help
*Mr Hofflander
*Create objects and call methods from Dog.class
*/

import java.util.Scanner;

public class Hello
{
  public static void main(String []args)
  {
    int max, number;
    Scanner scan = new Scanner(System.in);
    
    System.out.print ("Enter 6 integers: ");
    max = scan.nextInt();
    for (int count = 0; count <= 6; count++)
    {
      System.out.print ("Enter another integer: ");
      number = scan.nextInt();
      if (number > max)
        max = number;
    }
    System.out.println ("The highest value is :" + max);
  }
}
