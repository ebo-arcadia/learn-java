// array list is like a rubber bands
// it can grow to accommodate more elements or shrink when elements are removed
// technically speaking, array list is like a dynamic array of a variable-length array

// syntax
// Array list add: add(Object o)
// Array list remove: remove(Object o)
// java array size: int size()
// array list contains: boolean contains(Object o)

// array list example 

import java.util.ArrayList;
class sample_ArrayList {
    public static void main(String[] args) {
        // creating a generic array list
        ArrayList<String> sampleArrayList = new ArrayList<String>();
        // size of array list
        System.out.println("Size of array list at creation: " + sampleArrayList.size());
        // add some elements to it
        sampleArrayList.add("J");
        sampleArrayList.add("A");
        sampleArrayList.add("V");
        sampleArrayList.add("A");
        sampleArrayList.add("F");
        sampleArrayList.add("U");
        sampleArrayList.add("N");

        // recheck the size after adding elements
        System.out.println("Size of sample array list after adding elements: " + sampleArrayList.size());
        // display all elements of sample array list
        System.out.println("List of all elements: " + sampleArrayList);
        // remove some elements from the array list
        sampleArrayList.remove("J");
        System.out.println("Remain content after removing one element: " + sampleArrayList);
        // remove element by index
        sampleArrayList.remove(5);
        System.out.println("Remain content after removing element by index" + sampleArrayList);
        // check size after removing elements
        System.out.println("Size of the sample array list after removing elements" + sampleArrayList.size());
        System.out.println("List of all elements after removing elements " + sampleArrayList);

        // check if the list contains "N"
        System.out.println(sampleArrayList.contains("N"));
    }
}