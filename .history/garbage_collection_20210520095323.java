// memory management
// not referenced & unused objects get automatically deleted
// de-allocation of memory
// prevent system crash from memory leaks
// free() method
// all objects are created in Heap secion of memory

// example program for garbage collector mechanism in java

class TrashObject{
    int x;
    int y;

    public void setData(int a, int b){
        x=a;
        y=b;
    }

    public void showData(){
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);
    }

    public static void main(String[] args) {
        TrashObject t1 = new TrashObject();
        TrashObject t2 = new TrashObject();

        t1.setData(2, 3);
        t2.setData(6, 7);
        t1.showData();
        t2.showData();
    }
}