
public class Sort {

	int[] arrayQuickSort;
    
	
	/**
	 *
	 * @param array er det usorterede array som bliver oprettet i main
	 * @param lo er det laveste tal i array. lo er sat til at være lig 0 (lo = 0)
	 * @param hi er det højeste tal i array. hi er sat til at være lig med antal minus 1 (hi = antal - 1)
	 *        Dette gøres så java ikke melder fejlen OutOfBounds mht. array.
	 * @return returnere arrayQuickSort som er det sorterede array. Herefter udprintes det fra main. 
	 */
	    //quickSort algoritmen
	

	
	public int[] quickSort(int array[], int lo, int hi)
    {
        arrayQuickSort = array;
        int i=lo, j=hi, temp;
        int x = arrayQuickSort[(lo + hi)/2];
        
        do
        {
            while (arrayQuickSort[i] < x)
            {
              i=i+1;  
            }
        while (arrayQuickSort[j] > x)
        {
            j=j-1;
        }
        if (i <= j)
        {
            temp = arrayQuickSort[i];
            arrayQuickSort[i] = arrayQuickSort[j];
            arrayQuickSort[j] = temp;
            i = i+1;
            j = j-1;
        }
        }
        while (i <= j);
        {
            if (lo < j)
            {
                quickSort(arrayQuickSort, lo, j);
            }
            if (i < hi)
            {
                quickSort(arrayQuickSort, i, hi);
            }
        }

       return arrayQuickSort;
       

    }
	
}
