/*
 * Anagram --> two strings having same alphabets.
 * 
 */

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "School Master";
        String str2 = "The Classroom";

        //first step
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        //second step
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //third step
        char ar1[] = str1.toCharArray();
        char ar2[] = str2.toCharArray();

        //fourth step
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        //fifth and final step
        if (Arrays.equals(ar1, ar2)) {
            System.out.println("It is an anagram");
        } else {
            System.out.println("It is not an anagram");
        }

    }
}
