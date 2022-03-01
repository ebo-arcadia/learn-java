import java.io.*;
import java.util.Arrays;

public class ArrayClass {

    public static void passArrToMethod(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("current element in the array passed in this method is: " + myArr[i]);
        }
    }

    public static int[] reverse(int[] intArr) {
        int[] reversedArr = new int[intArr.length];

        for (int i = 0, j = reversedArr.length - 1; i < intArr.length; i++, j--) {
            reversedArr[j] = intArr[i];
        }
        System.out.print("reversed array: " + reversedArr);
        return reversedArr;
    }

    public static void fillInArr(int arrPara[]) {
//        int shortArr[] = new int[ArrPara.length];
        for (int element: arrPara) {
            System.out.println("elements in current array BEFORE filling:" + element);
        }
        Arrays.fill(arrPara, 999);
        for (int element: arrPara) {
            System.out.println("all elements in current array AFTER filling:" + element);
        }
    }

    public static void main(String[] args) {
        double[] arrRefVal = {1.9, 3.4, 2.6, 6.9, 3, 1, 11, 13.2, 4.6};
        double total = 0;
        double maxVal = arrRefVal[0];

        for (int i = 0; i < arrRefVal.length; i++) {
            System.out.println("elements in my array: " + arrRefVal[i]);
        }

        for (double element: arrRefVal) {
            total += element;
        }
        System.out.println("total of all elements in array is: " + total);
        System.out.println("\n");

        for (int i = 0; i < arrRefVal.length; i++) {
            if (arrRefVal[i] > maxVal) {
                maxVal = arrRefVal[i];
            }
        }
        System.out.println("max element in the array is: " + maxVal);
        System.out.println("\n");

        // multidimensional arrays
        double arrMatrix[][] = new double[4][4];
        arrMatrix[0][0] = 1;
        arrMatrix[1][1] = 3;
        arrMatrix[3][2] = 5;
        System.out.println("nested arrays / array matrix: \n");
        System.out.println(arrMatrix[1][1]);
        System.out.println("\n");

        // invoke other static methods
        passArrToMethod(new int[]{1, 2, 3, 4,5});
        reverse(new int[]{5, 4, 3, 2, 1});
        fillInArr(new int[]{11, 22, 33, 44, 55});

        // using Array class or static methods from java.util.Array
        byte byteArr[] = {10, 2, 4, 11, 9, 32, 111, 54}; // declare and create an unsorted array with type byte
        Arrays.sort(byteArr); // sort the array using predefined Array class method
        System.out.println("current byte array is: " + byteArr);
        byte valToSearch = 111;
        int searchResult = Arrays.binarySearch(byteArr, valToSearch);
        System.out.println("index of element 111 is: " + searchResult);
    }
}