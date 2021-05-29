// declaration of a type (param or var) in a particular scope with same name
// shadows declaration of enclosing scope
// can not be refered by name alone

package oracle_java_tutorials;

public class Shadowing {
    public int z = 0;
    class FirstLevel {
        public int z = 1;

        void methodInFirstLevel(int z) {
            System.out.println("z = " + z);
            System.out.println("First level inner class: this.z = " + this.z);
            System.out.println("Top level Shadowing.this.z = " + Shadowing.this.z);
        }
    }

    public static void main(String[] args) {
        Shadowing shadowingObj = new Shadowing();
        Shadowing.FirstLevel firstLevelObj = shadowingObj.new FirstLevel();
        firstLevelObj.methodInFirstLevel(111);
    }
}

// local and anonymous classes
// synthetic constructs
// avoid serialization of inner class due to compatibility issue (.class, jre, jvm..)
