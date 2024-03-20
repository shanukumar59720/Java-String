/*
 * Case1 
 * 
 * Shanu Kumar --> ramuK unahS
 *  
 */
public class revString1 {
    public static void main(String[] args) {
        String str2 = new String();
        String str = "Shanu Kumar";
        for(int i=str.length()-1; i>=0; i--){
            str2 += str.charAt(i);
        }
        System.out.println("After reversing : " + str2);
    }
}
