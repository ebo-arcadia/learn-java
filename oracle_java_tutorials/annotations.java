import org.graalvm.compiler.lir.LIRInstruction.Use;

// form of metadata provide info about a program that is not part of the program
// has no direct effect on the operation of the code
// what uses? - info for compiler...
// where it is used? how to apply? predefined annotation? strong type checking?

// format of annotation
@annotation
void mySuperMethod() { ... }

@annotation_1(
    location = "Berkeley",
    weather = "sunny"
)
class MyClass { ... }
 // or 
@superAnnocation(value = "warning")

// using multiple annotations on the same declaration
@Book(author = "Mark Twin")
@policy(law = "civic law")
class SuperClass{ ... }

// repeating annotation
@Device(model = "iphone")
@Device(model = "iMac")
class MyClass { ... }

// predefined annotations
@Overide
@SuppressWarnings

// where annotations can be used?
// on a declaration
// type annotation
new @annotation MyObject();
myString = (@NewString String) str;
class OriginalList<T> implements @Use List<@Use T> { ... }
void badData() throws @Critical DataException { ... }


// declaring annotation type
public class Generation3List extends Generation2List {

    // Author: John Doe
    // Date: 3/17/2002
    // Current revision: 6
    // Last modified: 4/12/2004
    // By: Jane Doe
    // Reviewers: Alice, Bill, Cindy
 
    // class code goes here
 
 }

 // define annotation type
 @interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
 }

 // use annotation to fill in info
 
@ClassPreamble (
    author = "John Doe",
    date = "3/17/2002",
    currentRevision = 6,
    lastModified = "4/12/2004",
    lastModifiedBy = "Jane Doe",
    // Note array notation
    reviewers = {"Alice", "Bob", "Cindy"}
 )
 public class Generation3List extends Generation2List {
 
 // class code goes here
 
 }

 // import this to use @Documented
import java.lang.annotation.*;

@Documented
@interface ClassPreamble {

   // Annotation element definitions
   
}

// predefined annotation types
// in java SE API

// meta-annotation
// java.lang.annotation

// repeating annotations
@Schedule(dayOfMonth="last")
@Schedule(dayOfWeek="Fri", hour="23")
public void doPeriodicCleanup() { ... }


@Alert(role="Manager")
@Alert(role="Administrator")
public class UnauthorizedAccessException extends SecurityException { ... }


// declare repeatable annotation type
import java.lang.annotation.Repeatable;

@Repeatable(Schedules.class)
public @interface Schedule {
  String dayOfMonth() default "first";
  String dayOfWeek() default "Mon";
  int hour() default 12;
}

// declare the containing annotation type
