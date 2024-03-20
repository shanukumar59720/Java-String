public class finalkey {
    public static void main(String[] args) {
        //final StringBuffer sb = new StringBuffer("Virat");
        //when we use final keyword it will not allow any other value to be assigned on the same variable!
        StringBuffer sb = new StringBuffer("Virat");

        sb.append(" kohli");
        System.out.println(sb);
        sb = new StringBuffer("Sachin");
        System.out.println(sb);
    }
}
