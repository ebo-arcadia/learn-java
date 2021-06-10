// what is interface
// reference type similar to class
// only contains constants, methods signatures, default methods, static methods, nested types
// can not be instantiated
// can only be implemented or extended

// how to define an interface?
public interface OperateCar {

    // constant declarations, if any
 
    // method signatures
    
    // An enum with values RIGHT, LEFT
    int turn(Direction direction,
             double radius,
             double startSpeed,
             double endSpeed);
    int changeLanes(Direction direction,
                    double startSpeed,
                    double endSpeed);
    int signalTurn(Direction direction,
                   boolean signalOn);
    int getRadarFront(double distanceToCar,
                      double speedOfCar);
    int getRadarRear(double distanceToCar,
                     double speedOfCar);
          ......
    // more method signatures
 }
 
 // impleents the interface
 public class OperateBMW760i implements OperateCar {

    // the OperateCar method signatures, with implementation --
    // for example:
    public int signalTurn(Direction direction, boolean signalOn) {
       // code to turn BMW's LEFT turn indicator lights on
       // code to turn BMW's LEFT turn indicator lights off
       // code to turn BMW's RIGHT turn indicator lights on
       // code to turn BMW's RIGHT turn indicator lights off
    }

    // other members, as needed -- for example, helper classes not 
    // visible to clients of the interface
}

// interfaces as APIs
// software package -> sold to company makes end-user graphics programs -> writes classes to implement an interface -> customers to use