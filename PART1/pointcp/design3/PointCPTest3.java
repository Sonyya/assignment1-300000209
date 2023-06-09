package design3;
// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;

import design1.PointCP;
import design2.PointCP2;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 */
public class PointCPTest3
{
  //Class methods *****************************************************

  /**
   * This method is responsible for the creation of the PointCP3
   * object.  This can be done in two ways; the first, by using the
   * command line and running the program using <code> java 
   * PointCPTest &lt;coordtype (c/p)&gt; &lt;X/RHO&gt; &lt;Y/THETA&gt;
   * </code> and the second by getting the program to prompt the user.
   * If the user does not enter a valid sequence at the command line,
   * the program will prompte him or her.
   *
   * @param args[0] The coordinate type.  P for polar and C for
   *                cartesian.
   * @param args[1] The value of X or RHO.
   * @param args[2] The value of Y or THETA.
   */
  public static void main(String[] args)
  {
    PointCP3 point;

    System.out.println("Cartesian Coordinates Manipulation Program (DESIGN 3)");

    // Check if the user input coordinates from the command line
    // If he did, create the PointCP3 object from these arguments.
    // If he did not, prompt the user for them.
    try
    {
      point = new PointCP3(
        Double.valueOf(args[0]).doubleValue(), 
        Double.valueOf(args[1]).doubleValue());
    }
    catch(Exception e)
    {
      // If we arrive here, it is because either there were no
      // command line arguments, or they were invalid
      if(args.length != 0)
        System.out.println("Invalid arguments on command line");

      try
      {
        point = getInput();
      }
      catch(IOException ex)
      {
        System.out.println("Error getting input. Ending program.");
        return;
      }
    }
    System.out.println("\nYou entered:\n" + point);
    //mes ajouts
    
    PointCP temp = new PointCP('C',8,6);

    PointCP3 pointB = new PointCP3(temp.getX(),temp.getY());
    System.out.println("\nSoit A le point que vous venez d entrer et B le point \n" + pointB.toString());
    
    System.out.println("\ndistance AB = \n" + point.getDistance(pointB));
    
    System.out.println("\n le point image de A apres une rotation de 20o \n" + point.rotatePoint(20).toString());
    
  }

  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointCP3
   * object.
   *
   * @return A PointCP3 constructed using information obtained 
   *         from the user.
   * @throws IOException If there is an error getting input from
   *         the user.
   */
  private static PointCP3 getInput() throws IOException
  {
    byte[] buffer = new byte[1024];  //Buffer to hold byte input
    boolean isOK = false;  // Flag set if input correct
    String theInput = "";  // Input information
    
    //Information to be passed to the constructor
    char coordType = 'A'; // Temporary default, to be set to P or C
    double a = 0.0;
    double b = 0.0;

    // Allow the user to enter the three different arguments
    for (int i = 0; i < 2; i++)
    {
      while (!(isOK))
      {
        isOK = true;  //flag set to true assuming input will be valid
          
        // Prompt the user
        
          System.out.print("Enter the value of " 
            + (i == 0 ? "X " : "Y ")
            + "using a decimal point(.): ");
        

        // Get the user's input      
       
        // Initialize the buffer before we read the input
        for(int k=0; k<1024; k++)
        	buffer[k] = '\u0020';        
             
        System.in.read(buffer);
        theInput = new String(buffer).trim();
        
        // Verify the user's input
        try
        {
          if (i == 0) // First argument -- type of coordinates
          {
            
              coordType = 'C';
              a = Double.valueOf(theInput).doubleValue();
          }
          else  // Second and third arguments
          {
            
              b = Double.valueOf(theInput).doubleValue();
          }
        }
        catch(Exception e)
        {
        	System.out.println("Incorrect input");
        	isOK = false;  //Reset flag as so not to end while loop
        }
      }

      //Reset flag so while loop will prompt for other arguments
      isOK = false;
    }
    //Return a new PointCP3 object
    return (new PointCP3(a, b));
  }
}
