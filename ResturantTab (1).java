import java.util.Scanner;

public class ResturantTab.java {

   public static void main( String [ ] args ) {
   
       // Variables//
       Scanner in = new Scanner(System.in );
       double mealCost;
       double tax;
       double totalCost;
       double tip;
       double totalBill;
       
       
       System.out.println( "Please enter the cost of the meal: " ); //command to enter the cost of the meal//
       mealCost = in.nextDouble();
       
       // calculating the tax//
       tax = 0.075 * mealCost;
       
       totalCost = mealCost + tax;
       
       tip = 0.18 * totalCost;
       
       totalBill = totalCost + tip;
       
       final String ABSTRACT_NAME = " Resturant Bill Summary ";
       
       System.out.println( ABSTRACT_NAME); // summary headline//
       
       System.out.println("What is the first name of the server %?"); //first name//
       
       String firstName = in.next(); //inputing the name//
       
       System.out.println("What is the last name of the server %?"); //Last name of the server//
       
       String lastName = in.next(); // inputing the name//
       
       System.out.println("Server name is:" + lastName + "," + firstName.charAt(0)); // Full name of server with initials//
       
       System.out.println("What is the charge for the meal %?");
      
       System.out.println( "Cost of meal: $" + mealCost ); //Meal cost//
       System.out.println( "Tax: $" + tax ); //Taxs//
       System.out.println( "Tip: " + tip ); //Tips//
       System.out.println( "Total Bill: " + totalBill ); //Total Cost//
       
     }
     
 }
       
 