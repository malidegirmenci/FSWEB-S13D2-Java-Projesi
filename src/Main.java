import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        while (isNumber(scn)) {
            int number = scn.nextInt();
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome number");
            } else {
                System.out.println(number + " is not a palindrome number");
            }
        }
    }

    /**
     * finder palindrome func!!
     * @param num given num input
     * @return true-false
     */
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            num = Math.abs(num);
        }
        String strNum = Integer.toString(num);
        StringBuilder nStr = new StringBuilder();
        char ch;
        for (int i = 0; i < strNum.length(); i++) {
            ch = strNum.charAt(i);
            nStr.insert(0, ch);
        }
        return nStr.toString().equals(strNum);
    }

    /**
     * is input a number ? function
     * @param scn input value
     * @return true-false
     */
    public static boolean isNumber(Scanner scn) {
        if (scn.hasNextInt()) {
            return true;
        } else {
            System.out.println("Invalid entry. This is not a number.");
        }
        return false;
    }
}