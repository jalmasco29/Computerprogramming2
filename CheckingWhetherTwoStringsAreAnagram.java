
package checking.whether.two.strings.are.anagram;
import java.util.Scanner;
public class CheckingWhetherTwoStringsAreAnagram {

    public static void main(String[] args) {
        System.out.println("Checking whether two strings are anagram");
        Scanner scn = new Scanner(System.in);
        System.out.println("First Given String: ");
        String givenstring1 = scn.nextLine();
        System.out.println("Second Given String: ");
        String givenstring2 = scn.nextLine
        ();
        
        
        givenstring1 = givenstring1.replaceAll("\\s","");
        givenstring1 = givenstring1.toLowerCase();
        givenstring2 = givenstring2.replaceAll("\\s","");
        givenstring2 = givenstring2.toLowerCase();
        
        if(givenstring1.equals(givenstring2)){
            System.out.println("The two stirngs are anagram");
        }else{
            System.out.println("The two stirngs are not anagram");
        }
    }
    
}
