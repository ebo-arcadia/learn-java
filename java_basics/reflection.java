// API
// manipulate class at run time
// everything in a class - fields, methods, constructor
// manipulate private members of class


// classes in java.lang.package to implement reflection
// Field. Method. Constructor. Modifier
import java.lang.reflect.Modifier;

class Guru99ClassObjectCreation {
	public static void main (String[] args) throws ClassNotFoundException {
		//1 - By using Class.forname() method 
		Class c1 = Class.forName("Guru99ClassObjectCreation"); 
		//2- By using getClass() method 
		Guru99ClassObjectCreation guru99Obj = new Guru99ClassObjectCreation();
		Class c2 = guru99Obj.getClass();
		//3- By using .class 
		Class c3= Guru99ClassObjectCreation.class;
		}
	}

class Guru99GetclassMetaData {

	public static void main (String [] args) throws ClassNotFoundException { 
	// Create Class object for Guru99Base.class 
	Class guru99ClassObj = Guru99Base.class;
	
	// Print name of the class 
	System.out.println("Name of the class is : " +guru99ClassObj.getName());
	
	// Print Super class name
	System.out.println("Name of the super class is : " +guru99ClassObj.getSuperclass().getName());
	
	// Get the list of implemented interfaces in the form of Class array using getInterface() method
	Class[] guru99InterfaceList = guru99classObj.getInterfaces();
	
	// Print the implemented interfaces using foreach loop 
	System.out.print("Implemented interfaces are : ");
	for (Class guru99class1 : quru99 InterfaceList)	{
		system.out.print guru99class1.getName() + " ");
	}
	System.out.println();
	
	//Get access modifiers using get Modifiers() method and toString() method of java.lang.reflect.Modifier class
	int guru99AccessModifier= guru99classObj.getModifiers(); 
	// Print the access modifiers
	System.out.println("Access modifiers of the class are : " +Modifier.toString(guru99AccessModifier));
	
	}
}

package guru;
import java.lang.reflect.Field; 

public class Guru99VariableMetaDataTest {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException { 
	// Create Class object for Guru99VariableMetaData.class 
	Guru99VariableMetaData guru99ClassVar = new Guru99VariableMetaData(); 
	Class guru99ClassObjVar = guru99ClassVar.getClass();
	
	// Get the metadata of all the fields of the class Guru99VariableMetaData 
	Field[] guru99Field1= guru99ClassObjVar.getDeclaredFields();
	
	// Print name, datatypes, access modifiers and values of the varibales of the specified class 
	for(Field field : guru99Field1) { 
	System.out.println("Variable name : "+field.getName());
	System.out.println("Datatypes of the variable :"+field.getType());
	
	int guru99AccessModifiers = field.getModifiers();
	System.out.printlln("Access Modifiers of the variable : "+Modifier.toString(guru99AccessModifiers));
	System.out.println("Value of the variable : "+field.get(guru99ClassVar));
	System.out.println();
	system.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *") ;
	}
	}
}

package guru;
import java.lang.reflect.Field; 

public class Guru99VariableMetaDataTest {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException { 
	// Create Class object for Guru99VariableMetaData.class 
	Guru99VariableMetaData guru99ClassVar = new Guru99VariableMetaData(); 
	Class guru99ClassObjVar = guru99ClassVar.getClass();
	
	// Get the metadata of all the fields of the class Guru99VariableMetaData 
	Field[] guru99Field1= guru99ClassObjVar.getDeclaredFields();
	
	// Print name, datatypes, access modifiers and values of the varibales of the specified class 
	for(Field field : guru99Field1) { 
	System.out.println("Variable name : "+field.getName());
	System.out.println("Datatypes of the variable :"+field.getType());
	
	int guru99AccessModifiers = field.getModifiers();
	System.out.printlln("Access Modifiers of the variable : "+Modifier.toString(guru99AccessModifiers));
	System.out.println("Value of the variable : "+field.get(guru99ClassVar));
	System.out.println();
	system.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *") ;
	}
	}
}

package guru;
import java.lang.reflect.Constructor; 
public class Guru99ConstructorMetaDataTest {
	
	public static void main (String[] args) {
		// Create Class object for Guru99Constructor.class 
		Class guru99Class=Guru99Constructor.class;

		// Get all the constructor information in the Constructor array
		Constructor[] guru99ConstructorList = guru99Class.getConstructors();
		
		for (Constructor constructor : guru99ConstructorList) {
			// Print all name of each constructor
			System.out.println("Constrcutor name : "+constructor.getName());
			
			//Get and print access modifiers of each constructor 
			int guru99Modifiers= constructor.getModifiers(); 
			System.Out.printlin ("Constrctor modifier : "+Modifier.toString(guru99Modifiers));
			
			// Get and print parameter types 
			Class[] guru99ParamList=constructor.getParameterTypes();
			System.out.print ("Constrctor parameter types :"); 
			for (Class class1 : guru99ParamList) { 
				System.out.println(class1.getName() +" ");
			}
			System. out.println();

			// Get and print exception thrown by constructors
			Class[] guru99ExceptionList=constructor.getFxceptionTypes();
			System.out.println("Exception thrown by constructors :"); 
			for (Class class1 : guru99ExceptionList) { 
				System.out.println(class1.getName() +" ");
			} 
			System.out.println();
			System.out.println("*******************************************");
		}
	}
}

// package retrieving and modifying class info
// using classes in java.lang.reflect package and methods in java.lang.Classes
// commonly used classes getName()...
// commonly used in reflect: Fields...
// can access to private methods
// last resort using with caution due to its slow performance, security vulnerablity, permission issues 