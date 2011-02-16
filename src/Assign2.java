
import java.util.*;
public class Assign2 {

	/**
	 * @param args
	 */
	
	 
	public static void main(String[] args) {
		
		
	 int lo;
	 int hi;
	 int antal = 100000; 
	 hi = antal - 1;
	 lo = 0;
		
	 Stopwatch stopWatch = new Stopwatch();
		int prove[] = new int[100000];
		Random RandomNumber = new Random(); 
		stopWatch.start();
		for (int i=0; i<prove.length; i++)
			{
				prove[i]=RandomNumber.nextInt(1000);
			}
		stopWatch.stop();
		String Random = "Det tog "+ stopWatch + " at genere numrene ";
		int[] arrayCopy = new int[prove.length];
	        
	    System.arraycopy(prove, 0, arrayCopy, 0, prove.length);
	        
		
//		System.out.println("\nUsorteret:");
//		for (int i=0; i<prove.length; i++)
//		{
//			System.out.print(prove[i]+", ");
//		}
		
		Sort sort = new Sort();
		stopWatch.start();
		int [] quickSortedArray = sort.quickSort(prove, lo, hi);
		stopWatch.stop();
//		System.out.println("\n\nSorteret:");
//		for (int j=0; j<quickSortedArray.length; j++)
//		{
//			System.out.print(quickSortedArray[j]+", ");
//		}
		
//		System.out.println("\n\nUsorteret:  (Prøve)");
//        for (int i = 0; i < arrayCopy.length; i++)
//    	{
//        	System.out.print(arrayCopy[i]+", ");
//    	}
        System.out.print("\n\nDet tager "+ stopWatch +" at sortere arrayet");
        System.out.print("\n"+Random);
    }
}
	
	

