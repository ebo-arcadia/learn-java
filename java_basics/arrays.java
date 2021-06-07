// declaring array
// syntax  <elementType> <arrayName>[];
// int intArray[];

// intArray = new int[10];

// int intArray[] = new int[0];

// intArray[0] = 1;
// intArray[1] = 2;

// int intArray[] = {1,2,3,4};

// Array program

class ArrayDemo{
    public static void main(String args[]){
       int array[] = new int[7];
       for (int count=0;count<7;count++){
          array[count]=count+1;
      }
      for (int count=0;count<7;count++){
          System.out.println("array["+count+"] = "+array[count]);
      }
     System.out.println("Length of Array  =  "+array.length);
    //  array[8] =10;
     }
}

class ArrayDemoPassByReference {
    public static void passByReference(String a[]){
      a[0] = "Changed";
    }
  
    public static void main(String args[]){
       String []b={"Apple","Mango","Orange"};
       System.out.println("Before Function Call    "+b[0]);
       ArrayDemoPassByReference.passByReference(b);
       System.out.println("After Function Call    "+b[0]);
    }
 }

 // multidimensional array
 public class multidimensionalArray {
    public static void main(String[] args) {
    
    // Create 2-dimensional array.
      int[][] twoDimensional = new int[4][4];
    
      // Assign three elements in it.
      twoDimensional[0][0] = 1;
      twoDimensional[1][1] = 2;
      twoDimensional[3][2] = 3;
      System.out.print(twoDimensional[0][0] + " ");
    }
    
    }