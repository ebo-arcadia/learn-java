// logic
// iterate the original string
// in each iteration, iterate the string and add the first character in a new string variable 
// call back the same function resursion till the original string is empty

package java_programs;
public class reverse_string_input {
    public static void main(String[] args) {
        String myStr = "desrever eb ot sdeen ecnetnes siht";
		//create Method and pass and input parameter string 
		String reversed = reverseString(myStr);
		System.out.println("The reversed string is: " + reversed);
	}
	//Method take string parameter and check string is empty or not
	public static String reverseString(String myStr)
	{
		if (myStr.isEmpty()){
		 System.out.println("String in now Empty");	
		 return myStr;
		}
		//Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }
}