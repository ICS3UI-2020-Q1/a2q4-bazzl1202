import java.util.Scanner;
/**
 * Asks the user how much they spent, what they receive off, what they saved and their new total.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user how much they spent
    System.out.println("Please enter the amount the customer spent");

    //declare and initialize variable for how much user spent
    double cost = input.nextDouble();

    // checks and tells how much the user will receive off
    if( cost >= 0.01 && cost <= 40.00 ){
      System.out.println("They will receive 10% off.");
    } else if( cost >= 40.01 && cost <= 80.00){
      System.out.println("They will receive 20% off.");
    } else if( cost >= 80.01 && cost <= 120.00){
      System.out.println("They will receive 30% off.");
    } else if( cost > 120.00 ){
      System.out.println("They will receive 40% off.");
    }
    
    //declares and calculates ten percent off
    double tenPercent = ( cost*.1 );

    // declares and calculates twenty percent off
    double twentyPercent = ( cost*.2 );

    // declares and calculates thirty percent off
    double thirtyPercent = ( cost*.3 );

    // declares and calculates fourty percent off
    double fourtyPercent = ( cost*.4 );

    // tells how much the user will save
   if ( cost >= 0.01 && cost <= 40.00){
     System.out.println("They will save $" + tenPercent + ".");
    } else if( cost >= 40.01 && cost <= 80.00){
     System.out.println("They will save $" + twentyPercent + ".");
    } else if( cost >= 80.01 && cost <= 120.00){
      System.out.println("They will save $" + thirtyPercent + ".");
    } else if( cost > 120.00 ){
      System.out.println("They will save $" + fourtyPercent + ".");
    }

    // declares and calculates ten percent total
    double tenTotal = ( cost-tenPercent );

    // declares and calculates twenty percent total
    double twentyTotal = ( cost-twentyPercent );

    // declares and calculates thirty percent total
    double thirtyTotal = ( cost-thirtyPercent );

    // declares and calculates fourty percent total
    double fourtyTotal = ( cost-fourtyPercent );

    // tells the user the new total
    if( cost >= 0.01 && cost <= 40.00){
      System.out.println("The new total is $" + tenTotal + ".");
    } else if( cost >= 40.01 && cost <= 80.00){
      System.out.println("The new total is $" + twentyTotal + ".");
    } else if( cost >= 80.01 && cost <= 120.00){
      System.out.println("The new  total is $" + thirtyTotal + ".");
    } else if( cost > 120.00 ){
      System.out.println("The new total is $" + fourtyTotal + ".");
    }
  }
}
