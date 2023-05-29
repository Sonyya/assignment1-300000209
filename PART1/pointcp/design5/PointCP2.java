package design5;


public class PointCP2 extends PointCP5{

	public PointCP2(double Coord1, double Coord2) {
		super( Coord1, Coord2);
		
	}


	@Override
	public double getRho() {
		// TODO Auto-generated method stub
		return this.Coord1;
	}

	@Override
	public double getTheta() {
		// TODO Auto-generated method stub
		return this.Coord2;
	}
	
	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return (Math.cos(Math.toRadians(this.getTheta())) * this.getRho());
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return (Math.sin(Math.toRadians(this.getTheta())) * this.getRho());
	}
	
	  
	 
	public PointCP3 convertStorageToCartesian() {
		// TODO Auto-generated method stub
		return new PointCP3(this.getX(),this.getY());
	}

	/**
	   * Calculates the distance in between two points using the Pythagorean
	   * theorem  for polar coordinates 
	   * d = sqrt( (r1^2+r2^2) - (2*r1*r2*cos(theta1-tetha2)) ).
	   * @param pointA The first point.
	   * @param pointB The second point.
	   * @return The distance between the two points.
	   */
	@Override
	public double getDistance(PointCP5 pointB) {
		// TODO Auto-generated method stub
	
			double r1 = this.getRho();
			double r2 = pointB.getRho();
			double theta1 = this.getTheta();
			double theta2= pointB.getTheta();
			return Math.sqrt(Math.pow(r1, 2)+Math.pow(r2, 2) - (2*r1*r2*Math.cos(Math.toRadians(theta1-theta2))));
	
	}

	@Override
	public PointCP5 rotatePoint(double rotation) {
		// TODO Auto-generated method stub
		return new PointCP2(this.getRho(),(this.getTheta()+rotation)%360);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Polar [" + getRho() + "," + getTheta() + "]"+ "\n";
	}

	

	
	
}