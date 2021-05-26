// why, how, when using for each?
// iteration an arry of objs without using counter
// code optimization

class usingForEach {
    public static void main(String[] args) {
        String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
        System.out.println("iterating array with conventional for loop");
        // conventional for loop using counter, condition, increment
        for (int i = 0; i < arrData.length; i++ ) {
            System.out.println(arrData[i]);
        }
        System.out.println("\niterating array using for each");
        // using for each 
        for (String strTemp: arrData) {
            System.out.println(strTemp);
        }
    }
}

// data type declared in each loop must match the array iterating