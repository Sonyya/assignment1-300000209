package design2;

import design3.PointCP3;

public class PointCP2
{
	//attribut de la classe
	
	  /**
	   * Contient la valeur du Rho
	   */
	  private double Rho;
	  
	  /**
	   * Contient la valeur du Theta
	   */
	  private double Theta;
	  
	  /**
	   * Contient le type de coordonnees
	   */
	  //private char typeCoord;
	  
	//constructeurs
	public PointCP2(double rho, double theta)
	{
		//this.typeCoord= 'P';
		this.Rho = rho;
		this.Theta = theta;
	}
	
	 
	  //Instance methods **************************************************
	  
	  public double getRho()
	  {
	      return this.Rho;
	  }
	  
	  public double getTheta()
	  {
	      return this.Theta;

	  }
//	  public double getype()
//	  {
//		  return this.typeCoord;
//	  }
	  
	  

	  public double getX()
	  {
 
	      return (Math.cos(Math.toRadians(this.Theta)) * this.Rho);
	  }
	  
	  public double getY()
	  {

	      return (Math.sin(Math.toRadians(this.Theta)) * this.Rho);
	  }
		
	  
	  public PointCP3 convertStorageToCartesian() {
			// TODO Auto-generated method stub
			return new PointCP3(this.getX(),this.getY());
		}

	  /**
	   * Calculates the distance in between two points using the Pythagorean
	   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	   *
	   * @param pointA The first point.
	   * @param pointB The second point.
	   * @return The distance between the two points.
	   */
	  public double getDistance(PointCP2 pointB)
	  {
	    // Obtain differences in X and Y, sign is not important as these values
	    // will be squared later.

	     
	    double deltaX =  this.getX() - pointB.getX();
	    double deltaY = this.getY() - pointB.getY();
	    
	    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	  }

	  /**
	   * Rotates the specified point by the specified number of degrees.
	   * Not required until E2.30
	   *
	   * @param point The point to rotate
	   * @param rotation The number of degrees to rotate the point.
	   * @return The rotated image of the original point.
	   */
	  public PointCP2 rotatePoint(double rotation)
	  {
	    return new PointCP2(this.Rho,(this.Theta+rotation)%360);
	  }

	  /**
	   * Returns information about the coordinates.
	   *
	   * @return A String containing information about the coordinates.
	   */
	  public String toString()
	  {
	    return "Polar [" + getRho() + "," + getTheta() + "]"+ "\n";
	  }
	
	
}