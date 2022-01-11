import java.util.Scanner;
/**
 * Write a description of class NumberToRoman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConvertToRoman {
    /**
     * main - asks the user to input an integer for conversion to
     * its Roman Numeral Equivalent. If the user enters:
     *  - a negative number, the program will exit
     *  - a number between 1 and 100 inclusive, the number will be converted
     *  - 0 or a number greater than 100, the entry will be ignored and
     *    the user will be prompted for the next input
     */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        //your code here
        int enteredNum = sc.nextInt();
        //int testNum = 80;

        System.out.println("Please enter a number: ");

        while (!(enteredNum < 0)) {
            if (enteredNum > 0 || enteredNum <= 100) {
                System.out.println("Please enter a number ");
                enteredNum = sc.nextInt();
                System.out.println(convertToRoman(enteredNum));
            } else if (enteredNum == 0 || enteredNum > 100){
                System.out.println("Please enter a number: ");
                enteredNum = sc.nextInt();
            }
        }
    }

    /**
     * You will need to fill in the return type and the parameters
     * for this method (the "?" below) before your code will compile!
     */
    public static String convertToRoman (int num) {
        String newNum = "";
        while (num >= 100) {
            newNum += "C";
            num -= 100;
        }
        while (num >= 90) {
            newNum += "XC";
            num -= 90;
        }
        while (num >= 50) {
            newNum += "L";
            num -= 50;
        }
        while (num >= 40) {
            newNum += "XL";
            num -= 40;
        }
        while (num >= 10) {
            newNum += "X";
            num -= 10;
        }
        while (num >= 9) {
            newNum += "IX";
            num -= 9;
        }
        while (num >= 5) {
            newNum += "V";
            num -= 5;
        }
        while (num >= 4) {
            newNum += "IV";
            num -= 4;
        }
        while (num >= 1) {
            newNum += "I";
            num -= 1;
        }
        return newNum;
    }


}
