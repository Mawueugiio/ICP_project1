/**
 * 
 */
package icp_project1;
import java.util.*;


/**
 
 * This class holds information about all observatories
 
 * @author Eugenia Mawuenya AKPO
 
 * @author Michael PREMPEH
 
 * @author Issifu ALHASSAN
 
 * @author Francis AWEEENAGUA
 
 * @version 1.0.3
 
 */


public class Monitoring{
	
	private static ArrayList<Observatory> observatories;
	
	
	
	/**
	 
	 * The default Constructor
	 
	 */
	public Monitoring(){}
	
	
	
	/**
	 
	 * getObservatoryWithLargestAverage takes no parameters and returns the largest average recorded amongst the observatories
	 
	 * @return observatory
	 
	 */
	
	private static ArrayList<Double> largestAverage=new ArrayList<Double>();
	
	private static double highest=0;
	
	private static Observatory observatory;
	
	public static Observatory getObservatoryWithLargestAverage(){
		
		for(Observatory i: observatories) {
		   
			largestAverage.add(i.averageGalamseyColourValueRecorded());
		   
			for(int j=0;j< largestAverage.size();j++) {if(largestAverage.get(j)>highest) {
				
					highest = largestAverage.get(j);
			   
			}
		   
			if(i.averageGalamseyColourValueRecorded()==highest) { observatory = i;}
		   
			}
		
		}
		
		System.out.println(observatory);
		
		return observatory;
		
	}
	
	
	
	/**
	 
	 * getLargestGalamseyColourValueEverRecorded is a method that returns the largest Galamsey colour value ever recorded
	 
	 * @return largestGalamseyColourValue
	 
	 */
    
	
	private static ArrayList<Integer> list= new ArrayList<Integer>();
	
	private static int largestGalamseyColourValue=0;
	
	public static int getLargestGalamseyColourValueEverRecorded(){
		
		for(Observatory i:observatories) {
			
			list.add(i.largestGalamseyColourValueRecorded());
		
			for (int j=0;j<list.size();j++) {
			
				if(list.get(j) > largestGalamseyColourValue) {
				
					largestGalamseyColourValue=list.get(j);
			
				}
		
			}

     
		}
		
		System.out.println(largestGalamseyColourValue);
	    
		return largestGalamseyColourValue;	   
	
	}
	
	
	
	/**
	 
	 * This method returns a list of all Galamsey whose vegetation colour value is greater than some arbitrary constant
	 
	 * @param number
	 
	 * @return List
	 
	 */
    
	private static ArrayList<Galamsey> List=new ArrayList<Galamsey>();
    
	private static ArrayList<Galamsey> instance=new ArrayList<Galamsey>();
	
	@SuppressWarnings("unused")
	
	public static ArrayList<Galamsey> ListOfGalamseysWithColourValueGreaterThan(double number) {
	      
		for(Observatory i: observatories) {
	    	   
			for (Galamsey j: instance) {
	    		  
				if(j.getVegetationColourValue()>number){

                   List.add(j);}

                }
	    	   
	       }
	       
		System.out.println(List);
	     
		return List;  
	}
	
	
	
	/**
	 
	 * Operations are executed in the main method
	 
	 * @param args
	
	 */
	
	public static void main(String[] args) {
       
		observatories=new ArrayList<Observatory>();
      
		Galamsey g = new Galamsey ("brown",3);
       
		Galamsey q = new Galamsey ("brown",3);
       
		Galamsey r = new Galamsey ("yellow",2);
       
		Galamsey y = new Galamsey ("green",1);
       
		Galamsey u = new Galamsey ("green",1);
       
		Galamsey p = new Galamsey ("brown",3);
       
		Galamsey a = new Galamsey ("green",1);
      
		Galamsey s = new Galamsey ("yellow",2);
        
		Galamsey d = new Galamsey ("green",1);
       
		Galamsey h = new Galamsey ("brown",3);
      
		ArrayList<Galamsey> events =new ArrayList<Galamsey>();
       
		ArrayList<Galamsey> event =new ArrayList<Galamsey>();
       
		events.add(g);
       
		events.add(q);
      
		events.add(r);
       
		event.add(y);
       
		events.add(u);
       
		event.add(p);
       
		events.add(a);
       
		event.add(s);
      
		events.add(d);
       
		event.add(h);
       
		instance.addAll(events);
       
		instance.addAll(event);
       
		Observatory e = new Observatory("force","Ghana",2000, 50000,events);
       
		Observatory t = new Observatory("force2","Togo",3000, 100000,event);
	   
		observatories.add(e);
	   
		observatories.add(t);
	   
		getObservatoryWithLargestAverage();
	   
		getLargestGalamseyColourValueEverRecorded();
	   
		ListOfGalamseysWithColourValueGreaterThan(2);
        

	}
 
}
