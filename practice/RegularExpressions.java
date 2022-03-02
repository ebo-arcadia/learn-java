import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpressions {

    public static void findDigitStr() {
        try {
            // declare and create string of characters to be checked
            String stringToCheck = "A sentence of characters with digits 3000! or the port 5000?. ALL CAP";
            // declare and create pattern as benchmark
            String regexChar = "(.*?)(\\d+)(.*)(\\D+)";

            // create pattern object with the regular expression rules benchmark
            Pattern patternObj = Pattern.compile(regexChar);

            // create a matcher object assigned with pattern object
            Matcher matcherObj = patternObj.matcher(stringToCheck);

            // verify result in matcherObj
            boolean matchFound = matcherObj.find();
            if (matchFound) {
                System.out.println("Found value group 0: " + matcherObj.group(0));
                System.out.println("Found value group 1: " + matcherObj.group(1));
                System.out.println("Found value group 2: " + matcherObj.group(2));
                System.out.println("Found value group 3: " + matcherObj.group(3));
                System.out.println("Count groups: " + matcherObj.groupCount());
            } else {
                System.out.println("There is no match");
            }
        }
        catch(PatternSyntaxException error) {
            System.out.println(error.getMessage());
            System.out.println(error.getDescription());
            System.out.println(error.getPattern());
        }
    }

    public static void urlValidator() {
        // using non capturing group to match domain name in URL
        Pattern simpleUrlPattern = Pattern.compile("[^:]+://(?:[.a-z]+/?)+");
        Matcher urlMatcher = simpleUrlPattern.matcher("http://www.microsoft.com/");
        boolean urlIsValidate = urlMatcher.find();
        if (urlIsValidate) {
            System.out.println("Found value group 0: " + urlMatcher.group(0));
        }
    }

    public static void matchingExample() {
        System.out.println(Pattern.compile("^[a-z]").matcher("letter").find() + "---\n---");
        System.out.print(Pattern.compile("^[A-Z]").matcher("letter").find() + "---\n---");
        System.out.print(Pattern.compile("^[0-9]").matcher("123 then letter").find() + "---\n---");
        System.out.print(Pattern.compile("^[0-9]").matcher("letter").find() + "---\n---");
        System.out.print(Pattern.compile("^java").matcher("java is aswesome").find() + "---\n---");
        System.out.print(Pattern.compile("^java").matcher("python is aswesome").find() + "---\n---");
        System.out.print(Pattern.compile("^[!@#\\$%\\^\\&*\\)\\(+=._-]").matcher("!@#$%^&*( wired").find() + "---\n---");
        System.out.print(Pattern.compile("^[!@#\\$%\\^\\&*\\)\\(+=._-]").matcher("no special chars!").find() + "---\n---");
    }

    public static void main(String args[]) {
        findDigitStr();
        System.out.print("---------");
        System.out.print("\n");
        System.out.print("---------");
        System.out.print("\n");
        urlValidator();
        System.out.print("---------");
        System.out.print("\n");
        matchingExample();
    }
}