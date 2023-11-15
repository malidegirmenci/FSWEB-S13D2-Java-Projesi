import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Finder Palindrome Function Example
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

         */

        /*Finder Perfect Number Function Example
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        while (isNumber(scn)) {
            int number = scn.nextInt();
            if(!(number <= 0)){
                if (isPerfectNum(number)) {
                    System.out.println(number + " is a perfect number");
                } else {
                    System.out.println(number + " is not a perfect number");
                }
            }else{
                System.out.println("Param can not be 0 or less than 0");
            }
        }

         */
        /* Number to Words Function Example
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = scn.nextInt();
            System.out.println(numberToWords(number));
        */

        /* Even Digits Sum Function Example
        System.out.println("Even digits sum: "+getEvenDigitsSum(123456));

         */

        /* First and Last Digit Sum Function Example
        System.out.println(getFirstAndLastDigitSum(123456));

         */

        /* Same Last Digit in Array Function
        System.out.println("Returns : " + getSameLastDigitInArray(12,321,21,32,42));

         */

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
     * is input a number ? func!!
     * @param scn
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

    /**
     * finder perfect number func!!
     * @param num input value
     * @return true-false
     */
    public static boolean isPerfectNum(int num){
        int sumDivs = 0;
        for(int i = 1; i < (num/2); i++){
            if(num % i == 0 ){
                sumDivs += i;
                System.out.println("sumDiv: "+ sumDivs + " i: "+i);
            }
        }
        System.out.println("sumDivs: "+sumDivs);
        return sumDivs == num;
    }
    public static String numberToWords(int num){
        if (num < 0) {
            return "Invalid Value";
        }
        String strNum = Integer.toString(num);
        System.out.println("strNum: " + strNum);
        String[] numWords = {"Zero", "One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder nStr = new StringBuilder();
        int ch;
        for(int i = 0; i < strNum.length(); i++){
            ch = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            nStr.append(numWords[ch]).append(" ");
        }
        return nStr.toString().trim();
    }

    /*
    * Extra Questions
    * 1-) Get even digit sum in given number
    * -1234 = 2 + 4 = 6;
    * 1234 = 2 + 4 = 6;
    * 2-) Get first digit and last digit sum in given number
    * 1234 = 1 + 4 = 5;
    * 3-) Get same last digit in given number array
    * */

    /**
     * Even Digits Sum Function
     * @param num
     * @return
     */
    public static int getEvenDigitsSum(int num){
        num = Math.abs(num);
        int sum = 0;
        char[] digits = String.valueOf(num).toCharArray();
        for(char digit: digits){
            int parsedDigit = Integer.parseInt(String.valueOf(digit));
            if(parsedDigit % 2 == 0){
                sum += parsedDigit;
            }
        }
        return sum;
    }

    /**
     * First and Last Digit Sum Function
     * @param num
     * @return
     */
    public static int getFirstAndLastDigitSum(int num){
        num = Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();
        System.out.println(digits[0]);
        return Integer.parseInt(String.valueOf(digits[0]))+ Integer.parseInt(String.valueOf(digits[digits.length-1]));
    }

    /**
     * Same Last Digit in Array Function
     * @param nums
     * @return
     */
    public static  boolean getSameLastDigitInArray(int... nums){
        boolean isTrue = false;
        for (int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                isTrue = nums[i] % 10 == nums[j] % 10;
            }
        }
        return isTrue ;
    }
}