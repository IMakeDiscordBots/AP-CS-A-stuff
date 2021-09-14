import java.util.Scanner;
/**
 * PasswordEnhancer.java
 *
 * @author: Your name goes here
 *
 * This program will strengthen any String password provided
 * by the user by using the strategy of converting every vowel
 * to a corresponding special character.
 * The program then displays the improved password in the terminal
 * window.
 *
 * The program enhances Strings (passwords) it receives until the
 * user inputs "-999", at which point the main() method ends.
 *
 *
 * You may ONLY use methods and programming structures that we have talked
 * about this year in class (no arrays, for example).
 */
public class PasswordEnhancer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oldPass = sc.nextLine();
        String newPass = enhancePassword(oldPass);
        System.out.println(newPass);
    }

    /**
     *
     */
    public static String enhancePassword(String oldPassword) {
      String newPass = "";
        while (!oldPassword.equals("-999")) {
            for (int i = 0; i < oldPassword.length(); i++) {
                if (oldPassword.charAt(i) == 'a') {
                    newPass = oldPassword.substring(0, i) + "@" + oldPassword.substring(i + 1);
                }

                if (oldPassword.charAt(i) == 'e') {
                    newPass = oldPassword.substring(0, i) + "3" + oldPassword.substring(i + 1);
                }

                if (oldPassword.charAt(i) == 'i') {
                    newPass = oldPassword.substring(0, i) + "!" + oldPassword.substring(i + 1);
                }

                if (oldPassword.charAt(i) == 'o') {
                    newPass = oldPassword.substring(0, i) + "0" + oldPassword.substring(i + 1);
                }
          
                if (oldPassword.charAt(i) == 'u') {
                    newPass = oldPassword.substring(0, i) + "^" + oldPassword.substring(i + 1);
                }
            }   
        }
        return newPass;
    }
}
