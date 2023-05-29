package design5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;






public class PerfoTest5 {
	
	
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
	
	/**
	 * @param min: le minimum nombre a generer
	 * @param max: le maximum nombre a generer
	 * @return un double aleatoire entre le min et le max
	 */
	public static double randomGenretorDouble(double min, double max)
	{
		Random r = new Random();
		double randomValue = min + (max - min) * r.nextDouble();
		return randomValue;
	}

	/**
	 * @param min: le minimum nombre a generer
	 * @param max: le maximum nombre a generer
	 * @return un int aleatoire entre le min et le  max
	 */
	public static int randomGenretorInt(double min, double max)
	{
		return (int)min + (int)(Math.random() * ((max - min) + 1));
	}
	
	
	/**
	 * @param X: nombre de fois que l algorithme sera executer
	 * affiche la  moyenne, mediane de temps, ainsi que le minimum et le maximum
	 */
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
		
    	System.out.println("Test PErformance DESIGN 5");
        System.out.println("MEDIAN = "+median+ " | MIN= " + min + " | MAX= " + max + " | MOYENNE= " + moyenne);
	}
	
	/**
	 * @param perform: liste du temps mis a chaque execution de l algorithme
	 * @param sum: la somme des temps contenu dans la liste perform
	 * @param s: mot decrivant le test
	 */
	public static void performance(ArrayList<Double> perform, double sum, String s)
	{
  
        int n=perform.size();
		perform.sort(Comparator.naturalOrder());
		double median =(n % 2 != 0)?perform.get(n/2):(double) ((perform.get((n - 1) / 2) + perform.get(n / 2)) / 2.0);
		double min = perform.get(0);
		double max = perform.get(n-1);
		double moyenne = sum/n;
		
    	System.out.println("Test " + s + " _ DESIGN 5");
        System.out.println("MEDIAN = "+median+ " | MIN= " + min + " | MAX= " + max + " | MOYENNE= " + moyenne);
	}
	
	
	/**
	 * cree les points aleatoirements et effectue tous les operations disponibles pour ces points
	 */
	public static void algo() 
	{
		// si var et var2 determineront si nous creeons un objet de type pointCP2 ou pointCP3
		int var = randomGenretorInt(1,2);
		int var2 = randomGenretorInt(1,2);
		PointCP5 point= (var==1)?new PointCP2(randomGenretorDouble(1,10),randomGenretorDouble(1,10)):new PointCP3(randomGenretorDouble(1,10),randomGenretorDouble(1,10));
		//appels des fonctions get qui feront la conversion si besoin
		double d =point.getRho();
		double d2= point.getTheta();
		double d3 = point.getX();
		double d4 = point.getY();
		//appel de la fonction de conversation adequat selon le type de point
		PointCP5 convt = (var==1)?((PointCP2) point).convertStorageToCartesian():((PointCP3) point).convertStorageToPolar();
		//creation aleatoire d un 2e point de type CP2 ou CP3 en fonction de la valeur de var2
		PointCP5 point2 = (var2==1)?new PointCP2(randomGenretorDouble(1,10),randomGenretorDouble(1,10)):new PointCP3(randomGenretorDouble(1,10),randomGenretorDouble(1,10));
		
		//appel des fonctions de rotations, calcul distance et toString sur le 2e point
		point.rotatePoint(randomGenretorDouble(0,360));
		point.getDistance(point2);
		point.toString();
		
	}
	
	
	/**
	 * @param X: nombre de fois que l algorithme sera executer
	 * @param func: la fonction ou methode dont on veut les informations sur le temps d execution
	 */
	public static void FonctionTest(long X, fonct func)
	{
		ArrayList<Double> perform= new ArrayList<Double>();
		 double sum = 0;
		 
		 for (int i = 0; i < X; ++i) {
			 
			 double deltaTemp= 0;
			 int var = randomGenretorInt(1,2);
				int var2 = randomGenretorInt(1,2);
				
				double begTime1 = System.currentTimeMillis();
				PointCP5 point= (var==1)?new PointCP2(randomGenretorDouble(1,10),randomGenretorDouble(1,10)):new PointCP3(randomGenretorDouble(1,10),randomGenretorDouble(1,10));
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
				
				double begTime6_7 = System.currentTimeMillis();
				PointCP5 convt = (var==1)?((PointCP2) point).convertStorageToCartesian():((PointCP3) point).convertStorageToPolar();
				double endTime6_7 = System.currentTimeMillis();
				
				
				double begTime8 = System.currentTimeMillis();
				point.rotatePoint(randomGenretorDouble(0,360));
				double endTime8 = System.currentTimeMillis();
				
				PointCP5 point2 = (var2==1)?new PointCP2(randomGenretorDouble(1,10),randomGenretorDouble(1,10)):new PointCP3(randomGenretorDouble(1,10),randomGenretorDouble(1,10));
				
				double begTime9 = System.currentTimeMillis();
				point.getDistance(point2);
				double endTime9 = System.currentTimeMillis();
		
				//prendra le temps en consideration le temps de la fonction demande en parametre
				
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
			    	   deltaTemp = endTime6_7-begTime6_7;
				        break;
			      case convertStorageToPolar:
			    	   deltaTemp = endTime6_7-begTime6_7;
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
		 //ranger par ordre croissant
			perform.sort(Comparator.naturalOrder());
			double median =(n % 2 != 0)?perform.get(n/2):(double) ((perform.get((n - 1) / 2) + perform.get(n / 2)) / 2.0);
			double min = perform.get(0);
			double max = perform.get(n-1);
			double moyenne = sum/n;
		 
			System.out.println("Test " + func + " _ DESIGN 5");
	        System.out.println("MEDIAN = "+median+ " | MIN= " + min + " | MAX= " + max + " | MOYENNE= " + moyenne);
	        
		
	}
	
	
	public static void main(String[] args)
	  {
		long x=10000000;
		//test(10000000);
		
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