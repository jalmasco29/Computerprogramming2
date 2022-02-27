
package removing.white.space.from.a.string;
import java.util.Scanner;
public class RemovingWhiteSpaceFromAString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Given String: ");
        String givenstring = scn.nextLine();
         
         
         givenstring = givenstring.replaceAll("\\s","");
         System.out.println("Removed all white spaces: " + givenstring);
    }
    
}
