import java.io.*;

class Computer {
    String brand;
    String price;
    // nested class

    // assign values using constructor

    public Computer(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    // private method
    private String getBrandName() {
        return this.brand;
    }

    // inner / nested class
    class Processor {
        // members of nested class
        String manufacturer;
        String processorType;
        double getCache() { return 5.3; }

        void setManufacturer() {
            // accessing brand and price of the computer
            if (Computer.this.brand.equals("mac")) {
                // invoke the private class method of computer
                if (Computer.this.getBrandName().equals("mac")) {
                    this.manufacturer = "apple";
                    this.processorType = "m1";
                }
                else {
                    this.manufacturer = "windows";
                    this.processorType = "intel";
                }
            }
            else {
                this.manufacturer = "other manufacturer";
                this.processorType = "other processor types";
            }
        }
        String getProcessorType() {
            return this.processorType;
        }
        String getManufacturer() {
            return this.manufacturer;
        }
    }
    // nested protected class
    protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 4.3;
        }
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {

        // create object of Outer class CPU
        Computer computer1 = new Computer("mac", "1000");
        Computer computer2 = new Computer("windows", "500");

        // create an object of inner class Processor using outer class
        Computer.Processor processor1 = computer1.new Processor();
        processor1.setManufacturer();
        System.out.println("get processor type: " + processor1.getProcessorType());
        System.out.println("get manufacturer type: " + processor1.getManufacturer());

        Computer.Processor processor2 = computer2.new Processor();
        processor2.setManufacturer();
        System.out.println("get processor type computer 2: " + processor2.getProcessorType());
        System.out.println("get manufacturer type computer 2: " + processor2.getManufacturer());

        // create an object of inner class RAM using outer class CPU
        Computer computer = new Computer("mac", "1000");
        Computer.Processor processor = computer.new Processor();
        Computer.RAM ram = computer.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}