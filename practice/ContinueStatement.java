public class ContinueStatement {
    public static void main(String args[]) {
        String [] normals = {"normal", "normal", "odd", "normal", "normal", "normal", "odd", "normal"};

        for (String normal: normals) {
            if (normal == "odd") {
                continue;
            }
            System.out.print("everything should be normal: " + normal);
            System.out.print("\n");
        }
    }
}