// what is interface?
// why use it?
// how to use it?
// what features does it have?
// difference between class and interface?

// an interface is a fully abstract class with abstract methods
// benefits? it provides specifications and implements for class to follow
// what is default method in interface and why it is introduced?
// what happens when more classes inherits an interface...
// since all methos must also be implemented, how to track more effciently in each class?

interface ProgrammingLanguages {
    public void getLanguage(String name);
    void getVersion(double version);
    private void privateMethod() {
        System.out.print("invoking a private method in an interface");
    }
    public static void publicStaticMethod() {
        System.out.print("invoking a private static method in an interface");
    }
}

interface Softwares {
    void setEnvironment(String environment);
    void getOS();
    default void instaledlLocally() {
        System.out.print("installed locally or not?");
    }
}

class Language implements ProgrammingLanguages, Softwares {
    // implement programming languages interface
    public void getLanguage(String name) {
        System.out.print("Name of the language: " + name + "\n");
    }
    public void getVersion(double version) {
        System.out.print("Version of the language: " + version + "\n");
    }
    // implement softwares interface
    String langEnv;
    public void setEnvironment(String environment) {
        System.out.print("set software environment: " + environment + "\n");
        langEnv = environment;
    }
    public void getOS() {
        System.out.print("get langEnv value: " + langEnv + "\n");
    }
    public void installedLocally() { System.out.print("method override. installed locally"); }
}

class ClassImplementsSoftwaresNotAllMethod implements Softwares {
    String langEnv;
    public void setEnvironment(String environment) {
        System.out.print("set software environment: " + environment + "\n");
        langEnv = environment;
    }
    public void getOS() {
        System.out.print("get langEnv value: " + langEnv + "\n");
    }
}

class JavaInterfaces {
    public static void main(String args[]) {
        Language langObj = new Language();
        langObj.getLanguage("python");
        langObj.getVersion(3.9);
        langObj.setEnvironment("MacOS");
        langObj.getOS();
        ClassImplementsSoftwaresNotAllMethod ExtraObj = new ClassImplementsSoftwaresNotAllMethod();
        ExtraObj.setEnvironment("Windows PC");
        ExtraObj.getOS();
        // default method is invoked without being overridden
        ExtraObj.instaledlLocally();
    }
}
