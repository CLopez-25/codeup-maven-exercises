import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MavenExercises {

    public static void main(String[] args) {
        // scanner for asking the user for input:
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter anything:  ");
        // taking the user input and outputting it to the console:
            String userInput = scanner.nextLine();
            System.out.println("You entered: " + userInput);
        // if else statement to check if the user input is not a number if it is a number it will tell you it is:
            if(!StringUtils.isNumeric(userInput)) {
                System.out.println(userInput + " is not a number!");
            } else {
                System.out.println(userInput + " is a number!");
            }
        // souts to swap case of string entered, check if its numeric, and reverse the string:
            System.out.println(StringUtils.swapCase(userInput));
            System.out.println(StringUtils.isNumeric(userInput));
            System.out.println(StringUtils.reverse(userInput));
        }
}
