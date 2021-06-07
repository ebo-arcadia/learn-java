// parameters: year,month,date,day

// method 1 - getting date from java util package
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Date_sample {
    public static void main(String[] args) {
        // instantiate a date object by invoking its constructor
        Date objDate = new Date();
        // display date
        System.out.println(objDate.toString());
    }
}

// formatting of date
// simple date format


class TestDates_Format {
 public static void main(String args[]) {
  Date objDate = new Date(); // Current System Date and time is assigned to objDate
  System.out.println(objDate);
  String strDateFormat = "hh:mm:ss a dd-MMM-yyyy"; //Date format is Specified
  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
  System.out.println(objSDF.format(objDate)); //Date formatting is applied to the current date
 }
}

// compare two date of birth with formatting
class TestDates_Compare {
    public static void main(String args[]) throws ParseException {
   
     SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
     Date dt_1 = objSDF.parse("20-08-3011");
     Date dt_2 = objSDF.parse("12-10-2012");
   
     System.out.println("Date1 : " + objSDF.format(dt_1));
     System.out.println("Date2 : " + objSDF.format(dt_2));
   
     if (dt_1.compareTo(dt_2) > 0) {
      System.out.println("Date 1 occurs after Date 2");
     } // compareTo method returns the value greater than 0 if this Date is after the Date argument.
     else if (dt_1.compareTo(dt_2) < 0) {
      System.out.println("Date 1 occurs before Date 2");
     } // compareTo method returns the value less than 0 if this Date is before the Date argument;
     else if (dt_1.compareTo(dt_2) == 0) {
      System.out.println("Both are same dates");
     } // compareTo method returns the value 0 if the argument Date is equal to the second Date;
     else {
      System.out.println("You seem to be a time traveller !!");
     }
    }
   }