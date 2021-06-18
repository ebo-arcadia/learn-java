// suits for small data
// removes an element
// compare to the largest number
// move it to the right location

package java_programs;
 
public class insertion_sort {
 
	
    public static void main(String a[])
    {    
        int[] myArray  = {100,23,202,9,3,25,65};  
        
        System.out.println("Before Insertion Sort");  
        
        printArray(myArray);
            
        insertionSort(myArray);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");  
        
        printArray(myArray);   
    }    
 public static void insertionSort(int arr[]) 
	{  
        int n = arr.length;  
        
        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i));
            int key = arr[i];  
            int j = i-1;  
            
            while ( (j > -1) && ( arr [j] > key ) ) 
            {  
            System.out.println("Comparing "+ key  + " and " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key; 
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(arr);
        }  
    }
 static void printArray(int[] array){
	    
	    for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
	    
	}
}