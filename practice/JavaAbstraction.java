// what is abstraction?
// why using abstraction in java?
// how abstraction is achived in java?

// to abstract is to hide the details of implementation. in java, it means the detailed implementation of a entity is hidden
// from the user
// it is about what a class/method/object achieves rather than how it achieves
// abstraction deals with ideas rather than events

abstract class Institutions {
    String name;
    String mission;

    Institutions() {
        System.out.print("\nNon-arguments super class constructor is called...\n");
    }

    Institutions(String name, String mission) {
        this.name = name;
        this.mission = mission;
    }

    abstract void AbstractMethod();

    public String address(String address) {
        return "Current address is: " + address;
    }

    abstract void absMethods1();
}

class JavaAbstraction extends Institutions {
    String name;
    String mission;

    JavaAbstraction() {
        // calling parameterized constructor of the superclass
        super("University of Oxford", "Cultivate world-class talents");
//        System.out.println(super.name + super.mission);
        this.name = super.name;
        this.mission = super.mission;
    }

    public void AbstractMethod() {
        System.out.print("Implement abstract method AbstractMethod from the super abstract class");
    }

    public void absMethods1() {
        System.out.print("overide absMethods1 from the super abstract class");
    }

    public String getNameAndMission() {
        String getNameAndMission = "Institution name is: " + name + " and its missions is: " + mission + ". ";
        System.out.print(getNameAndMission);
        return getNameAndMission;
    }

    public static void main(String args[]) {
        // abstract class can not be instantiated
        // following code will cause error
        // Institutions institution = new Institutions();

        // create sub class from the super
        // using an object/instance of the sub class to access methods in the super class
        JavaAbstraction obj = new JavaAbstraction();
        String result = obj.address("321 Scott St");
        System.out.println(result);
        obj.AbstractMethod();
        System.out.print("\n");
        obj.getNameAndMission();
        System.out.print("\n");
    }
}

