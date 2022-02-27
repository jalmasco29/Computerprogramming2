
package checking.whether.a.string.contains.only.digits;
import java.util.Scanner;
public class CheckingWhetherAStringContainsOnlyDigits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Given String: ");
        String givenstring = scn.nextLine();
        
        int cnt=0;
       char givenstringarray[] = givenstring.toCharArray();
       for(int StringCount = 0;StringCount<givenstring.length();StringCount++){
           if(Character.isDigit(givenstringarray[StringCount])){
               cnt++;
           }
       }
       if(cnt==givenstringarray.length){
           System.out.println("The given String contains only digit");
       }else{
           System.out.println("The given String is not only digit");
       }
    }
    
}
