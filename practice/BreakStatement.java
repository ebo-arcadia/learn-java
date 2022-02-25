public class BreakStatement {
    public static void main(String args[]) {
        String [] cities = {"SF", "DC", "Mars", "Boston", "LA", "Chicago"};

        for (String city: cities) {
            if (city == "Mars") {
                break;
            }
            System.out.print("Current city is: " + city);
            System.out.print("\n");
        }
    }
}