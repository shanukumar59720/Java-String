public class capacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sbb = new StringBuffer();
        System.out.println(sbb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("q");
        //capacity increased!
        System.out.println(sb.capacity()); 
        System.out.println(sb.length());  //length of characters present

        StringBuffer ssb = new StringBuffer("Sachin");
        System.out.println(ssb);
        System.out.println(ssb.capacity());

        StringBuilder sb2 = new StringBuilder(150);
        System.out.println(sb2.capacity());
        sb2.append("java");
        System.out.println(sb2);
        sb2.trimToSize();
        System.out.println(sb2.capacity());

        StringBuilder sb3 = new StringBuilder();
        sb3.append("language");
        System.out.println(sb3.reverse());
    }
}
