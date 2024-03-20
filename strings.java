/**
 * string printing
 * stringbuilder
 * string --> immutable
 * stringbuilder --> mutable
 */
public class strings {

    public static void main(String[] args) {
        String name = "Shanu Kumar";
        System.out.println(name);
        name.concat("Lucknow");
        System.out.println(name + " (Changed Name in the same variable)");
        // --> not working coz it is creating new value to which no one referring.
        String updtName = name.concat(" Lucknow");

        System.out.println(updtName + " (Changed Name in the same variable)");
        // working coz got assigned to the new variable!!
        System.out.println();

        StringBuilder name1 = new StringBuilder("Shanu kumar");
        name1.append(" Lucknow");
        System.out.println(name1);
    }
}