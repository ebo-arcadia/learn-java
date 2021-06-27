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

// defining interface
// modifier, keyword interface, inferace name, comma-separated list of parent intefaces, interface body

public interface InterfaceSample extends interface1, interface2, interface3 {
   //constant declarations
   // method signatures
   void methood(int i, double x);
   int method(String s);
   // abstact method no implementation, default, static methods
}

// implementing an interface
public class RectanglePlus 
    implements Relatable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }
    
    // a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect 
            = (RectanglePlus)other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;               
    }
}

// using a interface as a type
// new interface -> new reference data type
// object assign to an interface must be instance of a class implements that interface

public Object findLargest(Object object1, Object object2) {
    Relatable obj1 = (Relatable)object1;
    Relatable obj2 = (Relatable)object2;
    if ((obj1).isLargerThan(obj2) > 0)
       return object1;
    else 
       return object2;
 }

 // evolving interfaces

 public interface DoIt {
    void doSomething(int i, double x);
    int doSomethingElse(String s);
 }

 // if user to add a another method to it
 public interface DoIt {

    void doSomething(int i, double x);
    int doSomethingElse(String s);
    boolean didItWork(int i, double x, String s);
    
 }

 // classes implement old inferace will break
// solution
public interface DoIt {

    void doSomething(int i, double x);
    int doSomethingElse(String s);
    default boolean didItWork(int i, double x, String s) {
        // Method body 
    }
    
 }

 // default methods
//  enable adding functionality to interfaces binary compatibility for older version
import java.time.*; 
 
public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}

package defaultmethods;

import java.time.*;
import java.lang.*;
import java.util.*;

public class SimpleTimeClient implements TimeClient {
    
    private LocalDateTime dateAndTime;
    
    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
    }
    
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }
    
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }
    
    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }
    
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }
    
    public String toString() {
        return dateAndTime.toString();
    }
    
    public static void main(String... args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());
    }
}

public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
        int hour, int minute, int second);
    LocalDateTime getLocalDateTime();                           
    ZonedDateTime getZonedDateTime(String zoneString);
}
