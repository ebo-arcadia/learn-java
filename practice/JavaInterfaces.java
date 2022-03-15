// what is interface?
// why use it?
// how to use it?
// what features does it have?
// difference between class and interface?

// an interface is a fully abstract class with abstract methods

interface ProgrammingLanguages {
    void getLanguage(String name);
    void getVersion(double version);
}

interface Softwares {
    void setEnvironment(String environment);
    void getOS();
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
}

class JavaInterfaces {
    public static void main(String args[]) {
        Language langObj = new Language();
        langObj.getLanguage("python");
        langObj.getVersion(3.9);
        langObj.setEnvironment("MacOS");
        langObj.getOS();
    }
}
