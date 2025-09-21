public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0, 5));
        System.out.println(str.indexOf("World"));
        System.out.println(str.replace("World", "Java"));
    }
}
