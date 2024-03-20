/*
 * Case2
 * 
 * Shanu Kumar --> Kumar Shanu
 */

public class revString2 {
    public static void main(String[] args) {
        String str2 = new String();
        String str1 = "Shanu Kumar";
        str2 = " ";
        String str[] = str1.split(" ");
        
        for(int i=str.length-1; i>=0; i--){
            str2 += str[i] + " ";
        }
        System.out.println("After reversing : " + str2);
    }
}
