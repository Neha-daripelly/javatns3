public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = Integer.valueOf(20);
        int c = a + b;

        Double d1 = 5.5;
        Double d2 = Double.valueOf(6.6);
        double d3 = d1 + d2;

        Character ch1 = 'A';
        Character ch2 = Character.valueOf('B');
        char ch3 = ch1;

        Boolean bool1 = true;
        Boolean bool2 = Boolean.valueOf(false);
        boolean bool3 = bool1 && !bool2;

        Byte by1 = 100;
        Byte by2 = Byte.valueOf((byte) 20);
        byte by3 = (byte) (by1 + by2);

        Short s1 = 1000;
        Short s2 = Short.valueOf((short) 2000);
        short s3 = (short) (s1 + s2);

        Long l1 = 10000L;
        Long l2 = Long.valueOf(20000L);
        long l3 = l1 + l2;

        Float f1 = 1.2f;
        Float f2 = Float.valueOf(2.3f);
        float f3 = f1 + f2;

        System.out.println(c);
        System.out.println(d3);
        System.out.println(ch3);
        System.out.println(bool3);
        System.out.println(by3);
        System.out.println(s3);
        System.out.println(l3);
        System.out.println(f3);
    }
}
