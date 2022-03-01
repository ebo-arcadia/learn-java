import java.util.Date;

public class DateTime {

    public static void getCurrentDate() {
        Date currDate = new Date();
        System.out.print("current date is: " + currDate.toString());
        return;
    }

    public static int returnValue() {
        int x = 10;
        int y = 22;
        return x + y;
    }

    public static void dataFormatter() {
        Date date = new Date(); // instaintiate a date object
        String dateStr = String.format("Current date and time: %tc", date);
        System.out.print("\n");
        System.out.printf(dateStr);
        System.out.print("\n");
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
    }

    public static void main(String args[]) {
        getCurrentDate();
        int result = returnValue();
        System.out.print("\n");
        System.out.println("return output of function returnValue: " + result);
        System.out.print("\n");
        dataFormatter();
    }
}

