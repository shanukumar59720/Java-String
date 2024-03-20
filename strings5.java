/*
 * Important methods of String
 * 
 * 
 */

public class strings5 {
    public static void main(String[] args) {
        String str = "This is a Code!";
        System.out.println("str = " +str);
        System.out.println("str = " + str.toUpperCase());
        System.out.println("str = " + str.toLowerCase());
        System.out.println("Length of str = " + str.length());
        System.out.println("Character at index 12 - " + str.charAt(12));
        System.out.println("Start from index 8 - " + str.substring(8));
        System.out.println("Start from index 4, ends on index 12 - " + str.substring(4, 12));
        System.out.println("Index of C is - " + str.indexOf("C"));
        

        
    }
}
