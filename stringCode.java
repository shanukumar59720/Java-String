//import java.util.Scanner;

public class stringCode {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // String name = sc.nextLine();
        // System.out.println("The name of the user is - " + name);

        // String s1= "Hello";
        // String s2 = " World";
        // String s3 = s1 + s2;
        // System.out.println(s3);

        // String str = "refrigerator";
        // System.out.println("The length of the word refrigerator is - " + str.length());

        String str = "Umbrella";
        int index = str.indexOf('e');

        if(index != -1) {
            System.out.println("character 'e' is present in umbrella..." );
        } else {
            System.out.println("character 'e' is not present in umbrella..." );
        }
    }
}
