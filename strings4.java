/*
 * Concatenation
 * 
 * + operator
 *  
 *  examples are also in strings.java code
 * ...refer to that also
 */

public class strings4 {
    public static void main(String[] args) {
        String s1 = "Shanu";
        String s2 = "Shanu" + " Kumar";
        String s3 = "Shanu" + " Kumar" + " Lucknow";
        String s4 = s1 + s2;
        String s5 = "Shanu" + 100 + 99;

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = s1 + s2 => " + s4);
        System.out.println("s5 = "+s5);
    }
}
