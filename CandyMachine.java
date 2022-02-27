
package candy.machine;
import java.util.Scanner;
public class CandyMachine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Show the customer the different products sold by the candy machine
        System.out.println("Welcome to Lea J's Candy Machine");
        System.out.println("1. Candies");
        System.out.println("2. Lollipop");
        System.out.println("3. Cookies");
        int quantity,money=0,total=0;
        
        //Let the customer make the selection
        System.out.println("Choose your order (1-3)");
        int ordercode = scn.nextInt();
        
        //Show the customer the cost of the item selected
        switch(ordercode){
            case 1:
                System.out.println("Candies - 5 pesos");
                total=  5;
                break;
            case 2:
                System.out.println("Lollipop - 10 pesos");
                total=  10;
                break;
            case 3:
                System.out.println("Cookies - 15 pesos");
                total=  15;
                break;
        }
        System.out.println("\n");
        if(ordercode>0 && ordercode<=3){
            //accept money from customer
            while(money<total){
                System.out.println("Please enter your money");
                money = scn.nextInt();
            }
            //release the item
            System.out.println("**Release the item");
        
        }
        
    }
    
}
