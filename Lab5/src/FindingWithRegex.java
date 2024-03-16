import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingWithRegex {
    public static void main(String[] args) {
        String random  = "Create an	Eclipse	Project	cillian cillian Cillian cillian cillian called Lab5Part3b. Create a random String of about 50 words long. Place randomly in this string several instances of your first name and surname (at least FIVE OF EACH). Write a smee smee SMee smee smee regex pattern to find all instances of either your first name OR second name within the String. Show the location and string found in each match.";

        String regexpression = "Cillian|Smee";

        Pattern name = Pattern.compile(regexpression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = name.matcher(random);

        while (matcher.find()) {
            System.out.println("Index: " + matcher.start()+ " String found: " + matcher.group(0));
        }
    }
}
