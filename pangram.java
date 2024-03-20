/*
 * Pangram --> String including all the alphabets (A to Z)
 * 
 */

public class pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over lazy dog";
        boolean flag = false;

        str = str.replace(" ", "");

        str = str.toUpperCase();

        char ch[] = str.toCharArray();

        int ar[] = new int[26];

        for (int i = 0; i < ch.length; i++) {
            ar[ch[i] - 65]++;
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                System.out.println("It is not a pangram");
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("It is a pangram");
        }
    }
}
