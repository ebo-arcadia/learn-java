class Gadget {
    String songName;
    String processor = "Gadget processor";
    int yearModel;

    Gadget(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String playMusic(String input) {
        this.songName = input;
        System.out.println("Now playing: " + songName);
        return songName;
    }

    public void getType() {
        System.out.println("parent super class gadget get type method is invoked");
    }
}

public class iPhone extends Gadget {
    int price;
    String processor = "iphone processor";

    iPhone(int yearModel) {
        super(yearModel);
    }

    public int getPrice(int price) {
        this.price = price;
        System.out.println("iPhone price is: " + price);
        return price;
    }

    public void getType() {
        System.out.println("sub class iphone get type method is invoked");
    }

    public void callMethods() {
        iPhone iphoneObj = new iPhone(2022);
        // call sub class getType method
        iphoneObj.getType();
        // call super class getTyeo method
        super.getType();
        // get super class instance var processor
        System.out.println("instance var processor from SUPER class: " + super.processor);
        // get sub class instance var processor
        System.out.println("instance var processor from SUB class: " + iphoneObj.processor);
    }

    public static void main(String args[]) {
        iPhone iphoneObj = new iPhone(2022);
        iphoneObj.playMusic("See you again");
        iphoneObj.getPrice(1000);
        iphoneObj.callMethods();
        iPhone iphoneObjWithConst = new iPhone(2022);
        System.out.println("year model is: " + iphoneObjWithConst.getYearModel());
        System.out.print("-----------------");
        System.out.print("is iphoneObj an object of iPhone class? \n");
        System.out.println(iphoneObj instanceof iPhone);
        System.out.print("is iphoneObj an object of Gadget class? \n");
        System.out.println(iphoneObj instanceof Gadget);
    }
}

// implements
// what types of inheritances? - single, multi-level, hierarchical,
// multiple (not supported in java) but can be achieved via interface, hybrid
// is-a relationship
// has-a relationship
// method overriding
// super keyword
// protected memebers


