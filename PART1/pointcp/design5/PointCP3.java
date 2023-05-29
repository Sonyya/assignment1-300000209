package design5;


public class PointCP3 extends PointCP5{

	public PointCP3(double Coord1, double Coord2) {
		super(Coord1, Coord2);
		// TODO Auto-generated constructor stub
		}
	
	
	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return Coord1;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return Coord2;
	}
	@Override
	public double getRho() {
		// TODO Auto-generated method stub
		return (Math.sqrt(Math.pow(Coord1, 2) + Math.pow(Coord2, 2)));
	}

	@Override
	public double getTheta() {
		// TODO Auto-generated method stub
		return Math.toDegrees(Math.atan2(Coord2, Coord1));
	}

	public PointCP2 convertStorageToPolar() {
		// TODO Auto-generated method stub
		return new PointCP2 ( getRho(),getTheta());
	}

	@Override
	public double getDistance(PointCP5 pointB) {
		// TODO Auto-generated method stub
		double x = this.getX();
		double xb = pointB.getX();
		double y = this.getY();
		double yb= pointB.getY();
		return Math.sqrt((Math.pow((x-xb), 2) + Math.pow((y-yb), 2)));	
	}

	@Override
	public PointCP5 rotatePoint(double rotation) {
		// TODO Auto-generated method stub
		double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	    
	    return new PointCP3((Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
	      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cartesian  (" + getX() + "," + getY() + ")" + "\n";
	}

}