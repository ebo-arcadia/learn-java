// logic
// repeatedly search for lowest value
// with every iteration, swap current value with the lowest


package java_programs;
public class selection_sorting {
    public static void main(String[] args) {
        int[] myArray = {10, 2, 99, 432, 54};
        System.out.println("---before selection sort---");

        printArray(myArray);

        selection(myArray); // sorting array using selection sort
        System.out.println("---after selection sort---");
        printArray(myArray);
    }
    public static void selection(int[] array)
	{  
		for (int i = 0; i < array.length - 1; i++)  
		{  System.out.println("Sort Pass Number "+(i+1));
			int index = i;  
			for (int j = i + 1; j < array.length; j++)
			{   
			    System.out.println("Comparing "+ array[index]  + " and " + array[j]);  
				if (array[j] < array[index]){ 
				System.out.println(array[index]  + " is greater than " + array[j] );
					index = j;
				
				
				}  
			}  
 
			int smallerNumber = array[index];   
			array[index] = array[i];  
			array[i] = smallerNumber;  
			System.out.println("Swapping Elements: New Array After Swap");
			printArray(array);
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