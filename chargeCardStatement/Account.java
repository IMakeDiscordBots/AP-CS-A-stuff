import java.util.Scanner;
/**
 *  
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account {
  public static void main(String [] args) {
    //Create the Scanner
    Scanner sc = new Scanner(System.in);
    // Ask the user to enter their previous balance and 
    // use the Scanner to read in their response.
        
    System.out.println("Please enter your previous balance: ");
    double prevBal = sc.nextDouble();

    // Ask the user to enter their new charges and 
    // use the Scanner to read in their response.

    System.out.println("Please enter your new charges: ");
    double newCharges = sc.nextDouble();

    //In the println command below, remove the text "replace"
    //and instead call the method processStatement
    System.out.println(processStatement(prevBal, newCharges));
  }
    
  /**
  * Method: processStatement
  * @param prevBal - double - the previous balance due on the
  *        credit card
  * @param newCharges - double - The new charges from use of the
  *        credit card this month
  * @return String - A text string which prints out the statement
  *        details as shown on the projects PDF file
  */
  public static String processStatement(double prevBal, double newCharges) {
        
    double newBal = 0;
    double interest = 0;
    double intBal = 0;
    
    if (prevBal == 0) {
      interest = 0;
    } else {
      interest = 0.02;
      intBal = (prevBal + newCharges) * interest;
    } 
    
    newBal = prevBal + newCharges + intBal;
    
    double total = 0;

    if (newBal < 50) {
      total = newBal;
    } else if (newBal >= 50 && newBal <= 300) {
      total = 50;
    } else {
      total = newBal * 0.20;
    }
    
    String retStr = String.format("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$%.2f\nAdditional Charges:\t$%.2f\nInterest:\t\t$%.2f\n\nNew Balance:\t\t$%.2f\n\nMinimum Payment:\t$%.2f", prevBal, newCharges, intBal, newBal, total);
    
    //replace this with an actual return value. This is just a 
    //placeholder so the code will initially compile.
    return retStr;
  }
}
