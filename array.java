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
     //System.out.println("Length of Array  =  "+array.length);
     // array[8] =10;
     }
}