
package counting.duplicate.characters;
import java.util.Scanner;
public class CountingDuplicateCharacters {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("Given String: ");
       String givenstring = scn.nextLine();
       givenstring = givenstring.toLowerCase();
       char[] characterArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       
       System.out.println("Counting Duplicate Characters");
       System.out.println("Given String: " + givenstring);
       for(int CLength = 0;CLength < characterArray.length;CLength++){
           int StringCount = 0;
           for(int SLength = 0; SLength < givenstring.length(); SLength++){
               if(givenstring.charAt(SLength)==characterArray[CLength]){
                   StringCount++;
               }
               
           }
           if(StringCount!=0){
               System.out.println(characterArray[CLength] + " : " + StringCount);
           }
           
           
       }
    }
    
}
