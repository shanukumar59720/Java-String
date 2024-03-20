/*
 * palindrome --> reversed and original words are same
 */

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String str1 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str2 = sc.nextLine();
        sc.close();

        for (int i = str2.length() - 1; i >= 0; i--) {
            str1 += str2.charAt(i);
        }
        System.out.println("After reversing the string will be - " + str1);

        if (str1.equals(str2)) {
            System.out.println(str2 + " is a palindrome!");
        } else {
            System.out.println(str2 + " is not a palindrome!");
        }
    }
}
