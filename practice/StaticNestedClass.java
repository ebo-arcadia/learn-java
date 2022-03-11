class HumanBody {
    String features;
    public void HealthCheckup(String features) {
        this.features = features;
    }

    // static nested class
    static class Organ{
        String heart = "strong";
        String liver = "clean";
        String getHeartliver() {
            // access variable features from outer class
            if (HumanBody.this.features.equals("checkup")) {
                return "all is well";
            }
            else {
                return heart + liver;
            }
        }
    }

}
public class StaticNestedClass {
    public static void main(String[] args) throws Exception {
        try {
            // create an object of the static nested class
            // using the name of the outer class
            HumanBody.Organ HumanOrgan = new HumanBody.Organ();
            System.out.println("Get organs: " + HumanOrgan.getHeartliver());
        }
        catch (Exception error) {
            System.out.println("there is an error: " + error);
        }
    }
}

// why there is an error? what does the error say? static context can not be used to reference non-static variable
// because no object of the outer class is created
// in other words, the object of the inner class is not created with the object of the outer class
// this is used to reference the outer class object
