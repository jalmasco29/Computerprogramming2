
package finding.the.first.non.repeated.character;
import java.util.Scanner;
public class FindingTheFirstNonRepeatedCharacter {
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            System.out.println("Given String: ");
         String givenstring = scn.nextLine();
         
         givenstring = givenstring.toLowerCase();
         char givenstringarray[] = givenstring.toCharArray();
         int count;
         for(int StringCount = 0;StringCount<givenstring.length();StringCount++){
             count =1;
             for(int chckr=StringCount+1;chckr<givenstring.length();chckr++){
                 
                 if(givenstringarray[StringCount] == ' ' || givenstringarray[StringCount] == givenstringarray[chckr]){
                     count++;
                     
                 }
             }
              if(count==1){
                 System.out.println("The first non repeated character is " + givenstringarray[StringCount]);
                 break;
             }
         }
    }
    
}
