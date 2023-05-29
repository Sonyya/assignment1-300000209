package design5;

public abstract class PointCP5{
	
	//Instance variables ************************************************

	  
	  /**
	   * Contains the current value of X or RHO depending on the type
	   * of coordinates.
	   */
	  protected double Coord1;
	  
	  /**
	   * Contains the current value of Y or THETA value depending on the
	   * type of coordinates.
	   */
	  protected double Coord2;
		
	  
	  //Constructors ******************************************************

	  /**
	   * Constructs a coordinate object, with a type identifier.
	   */
	  public PointCP5( double Coord1, double Coord2)
	  {
	    this.Coord1 = Coord1;
	    this.Coord2 = Coord2;
	
	  }
	  

	abstract public double getRho();
	abstract  public double getTheta();
	abstract public double getX();
	abstract public double getY();
   abstract public double getDistance(PointCP5 pointB);
   abstract public PointCP5 rotatePoint(double rotation);
   abstract public String toString();
     
}