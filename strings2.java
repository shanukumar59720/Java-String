/*
 * different ways of comparison of strings
 * 
 *  == operator
 * 
 * equals() 
 */

public class strings2 {
    public static void main(String[] args) {
        String s1 = "Value";
        String s2 = new String("Value");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

    }
}
