package design1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class PerfoTest1 {
	
	enum fonct {
		  creationVar,
		  getX,
		  getY,
		  getRho,
		  getTheta,
		  convertStorageToCartesian,
		  convertStorageToPolar,
		  getDistance,
		  rotatePoint
		}
	
	public static double randomGenretorDouble(double min, double max)
	{
		Random r = new Random();
		double randomValue = min + (max - min) * r.nextDouble();
		return randomValue;
	}

	public static int randomGenretorInt(double min, double max)
	{
		return (int)min + (int)(Math.random() * ((max - min) + 1));
	}
	
	
	public static void test(long X)
	{
		ArrayList<Double> perform= new ArrayList<Double>();
        double sum = 0;
        for (int i = 0; i < X; ++i) {
        	
        	double begTime = System.currentTimeMillis();
        	algo();
        	double endTime = System.currentTimeMillis();
        	double deltaTemp = endTime-begTime;
        	perform.add(deltaTemp);
        	sum+=deltaTemp;
        }
        
        int n=perform.size();
		perform.sort(Comparator.naturalOrder());
		double median =(n % 2 != 0)?perform.get(n/2):(double) ((perform.get((n - 1) / 2) + perform.get(n / 2)) / 2.0);
		double min = perform.get(0);
		double max = perform.get(n-1);
		double moyenne = sum/X;
		
    	System.out.println("Test PErformance DESIGN 1");
        System.out.println("MEDIAN = "+median+ " | MIN= " + min + " | MAX= " + max + " | MOYENNE= " + moyenne);
		
	}
	
	public static void algo() 
	{
		int var = randomGenretorInt(1,2);
		char typecoord1= (var==1)?'P':'C';
		char typecoord2= (var==1)?'P':'C';
		PointCP point= new PointCP(typecoord1, randomGenretorDouble(1,10),randomGenretorDouble(1,10));
		double d =point.getRho();
		double d2= point.getTheta();
		double d3 = point.getX();
		double d4 = point.getY();
		point.convertStorageToCartesian();
		point.convertStorageToPolar();
		point.rotatePoint(randomGenretorDouble(0,360));
		point.getDistance(new PointCP(typecoord2,randomGenretorDouble(1,10),randomGenretorDouble(1,10)));
		point.toString();
		
	}

	
	public static void FonctionTest(long X, fonct func)
	{
		ArrayList<Double> perform= new ArrayList<Double>();
		 double sum = 0;
		 
		 for (int i = 0; i < X; ++i) {
			 
			 double deltaTemp= 0;
			 int var = randomGenretorInt(1,2);
				char typecoord1= (var==1)?'P':'C';
				char typecoord2= (var==1)?'P':'C';
				
				double begTime1 = System.currentTimeMillis();
				PointCP point= new PointCP(typecoord1, randomGenretorDouble(1,10),randomGenretorDouble(1,10));
				double endTime1 = System.currentTimeMillis();
				
				double begTime2 = System.currentTimeMillis();
				double d =point.getRho();
				double endTime2 = System.currentTimeMillis();
				
				double begTime3 = System.currentTimeMillis();
				double d2= point.getTheta();
				double endTime3 = System.currentTimeMillis();
				
				double begTime4 = System.currentTimeMillis();
				double d3 = point.getX();
				double endTime4 = System.currentTimeMillis();
				
				double begTime5 = System.currentTimeMillis();
				double d4 = point.getY();
				double endTime5 = System.currentTimeMillis();
				
				double begTime6 = System.currentTimeMillis();
				point.convertStorageToCartesian();
				double endTime6 = System.currentTimeMillis();
				
				double begTime7 = System.currentTimeMillis();
				point.convertStorageToPolar();
				double endTime7 = System.currentTimeMillis();
				
				double begTime8 = System.currentTimeMillis();
				point.rotatePoint(randomGenretorDouble(0,360));
				double endTime8 = System.currentTimeMillis();
				
				
				double begTime9 = System.currentTimeMillis();
				point.getDistance(new PointCP(typecoord2,randomGenretorDouble(1,10),randomGenretorDouble(1,10)));
				double endTime9 = System.currentTimeMillis();
		
				
				
				  switch(func) {
			      case creationVar:
			    	   deltaTemp = endTime1-begTime1;
			        break;
			      case getX:
			    	   deltaTemp = endTime4-begTime4;
			        break;
			      case getY:
			    	   deltaTemp = endTime5-begTime5;
			        break;
			      case getRho:
			    	   deltaTemp = endTime2-begTime2;
				        break;
			      case getTheta:
			    	   deltaTemp = endTime3-begTime3;
				        break;
			      case convertStorageToCartesian:
			    	   deltaTemp = endTime6-begTime6;
				        break;
			      case convertStorageToPolar:
			    	   deltaTemp = endTime7-begTime7;
				        break;
			      case getDistance:
			    	   deltaTemp = endTime9-begTime9;
				        break;
			      case rotatePoint:
			    	   deltaTemp = endTime8-begTime8;
				        break;   
			    }
				  
		        	perform.add(deltaTemp);
		        	sum+=deltaTemp;
				  
		 }

		 int n=perform.size();
			perform.sort(Comparator.naturalOrder());
			double median =(n % 2 != 0)?perform.get(n/2):(double) ((perform.get((n - 1) / 2) + perform.get(n / 2)) / 2.0);
			double min = perform.get(0);
			double max = perform.get(n-1);
			double moyenne = sum/n;
		 
			System.out.println("Test " + func + " _ DESIGN 1");
	        System.out.println("MEDIAN = "+median+ " | MIN= " + min + " | MAX= " + max + " | MOYENNE= " + moyenne);
	        
		
	}
	
	
	public static void main(String[] args)
	  { long x = 10000000;
		//test(x);
		
		//FonctionTest(x,fonct.creationVar);
		//FonctionTest(x,fonct.getX);
		//FonctionTest(x,fonct.getY);
		//FonctionTest(x,fonct.getRho);
	  	//FonctionTest(x,fonct.getTheta);
		//FonctionTest(x,fonct.convertStorageToCartesian);
		//FonctionTest(x,fonct.convertStorageToPolar);
		//FonctionTest(x,fonct.getDistance);
		//FonctionTest(x,fonct.rotatePoint);

		
	  }
	

}
