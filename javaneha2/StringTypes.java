public class StringTypes {
    public static void main(String[] args) {
        String s = "Hello";
        s = s.concat(" Java");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" Java");
        System.out.println(sb2);
    }
}
