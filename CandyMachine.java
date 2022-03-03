package Gipit;

import java.util.Scanner;


 public class CandyMachine {

  public static void main(String[] args) {
 

        Scanner sc = new Scanner(System.in);

        
        System.out.println("CANDY MACHINE");
        System.out.println("1. CHIPS = P 20.00");
        System.out.println("2.  GUM = P 15.00");
        System.out.println("3. COOKIES P 35.00");
        int sel = sc.nextInt();

        if(sel == 1 ){
            System.out.println("You select a CHIPS = P 20.00");
            int chips = 20;
            System.out.println("HOW MANY CHIPS YOU WANT TO BUY ?");
            int noit = sc.nextInt();
            int item = noit * chips;
            System.out.print("ENTER AMOUNT: ");
            int amnt = sc.nextInt();
            int change = amnt - item;

            System.out.println(" PRODUCT NAME:CHIPS   P" +chips+".00" );
            System.out.println(" NUMBER OF ITEMS: "+noit );
            System.out.println(" ITEMS COST: "+item );
            System.out.println(" AMOUNT: "+amnt );

            System.out.println(" Change is : " +change);
        
        }
        else if(sel == 2 ){
            System.out.println("You select a GUM = P 15.00");
            int GUM = 15;
            System.out.println("HOW MANY GUM YOU WANT TO BUY ?");
            int noit = sc.nextInt();
            int item = noit * GUM;
            System.out.print("ENTER AMOUNT: ");
            int amnt = sc.nextInt();
            int change = amnt - item;

            System.out.println(" PRODUCT NAME:GUM  P" +GUM+".00");
            System.out.println(" NUMBER OF ITEMS: "+noit );
            System.out.println(" ITEMS COST: "+item );
            System.out.println(" AMOUNT: "+amnt );

            System.out.println(" Change is: " +change);
     
        }
        else if (sel == 3){
            System.out.println("You select a COOKIES = P 35.00");
            int cookies = 35;
            System.out.println("HOW MANY COOKIES YOU WANT TO BUY?");
            int noit = sc.nextInt();
            int item = noit * cookies;
            System.out.print("ENTER AMOUNT: ");
            int amnt = sc.nextInt();
            int change = amnt - item;
            System.out.println(" PRODUCT NAME:COOKIES  P" +cookies+".00" );
            System.out.println(" NUMBER OF ITEMS: "+noit );
            System.out.println(" ITEMS COST: "+item );
            System.out.println(" AMOUNT: "+amnt );

            System.out.println(" Change is: " +change);
        }   
       else{
           System.out.print("INVALID NUMBER");
       }


    }
  
  

  }