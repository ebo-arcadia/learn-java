// what is envapsulation in java?
// what benefits does it provide?
// how to implement?
// to encapsulate it is to bundling related attributes and methods together in one class
// such practice keeps code cleaner and more readable
// what is data hiding?
// no outside class can access and modify what is inside the class
// it restrict access of data members by hiding the implementation details
// how to achieve data hiding in java? using modifiers

class Area {

    // fields to calculate area
    private int length;
    private int breadth;

    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class JavaEncapsulation {
    public static void main(String[] args) {

        // create object of Area
        // pass value of length and breadth
        Area rectangle = new Area(100, 422);
        rectangle.getArea();
    }
}