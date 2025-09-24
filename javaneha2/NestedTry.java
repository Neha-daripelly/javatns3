public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int x = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception: " + e);
            }

            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception: " + e);
            }
        } catch (Exception e) {
            System.out.println("Outer exception: " + e);
        }
    }
}
