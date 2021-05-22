// what is polymorphism
// one or more objects or classes related to each other by inheritance 

// method overriding
// redefining super class method in sub class

class Doctor{
    public void treatPatient(){
        // treatPatient method 
    }
}
class Surgeon extends Doctor{
    public void treatPatient(){
        // treatPatient method
    }
}
class run{
    public static void main(String[] args) {
        Doctor doctorObj = new Doctor()
        doctorObj.treatPatient();

        Surgeon sugrgeonObj = new Surgeon();
        sugrgeonObj.treatPatient();
    }
}

// method overloading vs. method overriding
