public class ConstructorOverload {

    ConstructorOverload() {
        System.out.println("Default constructor");
    }

    ConstructorOverload(int a) {
        System.out.println("Constructor with int: " + a);
    }

    ConstructorOverload(String s) {
        System.out.println("Constructor with String: " + s);
    }

    ConstructorOverload(int a, String s) {
        System.out.println("Constructor with int and String: " + a + ", " + s);
    }

    ConstructorOverload(String s, int a) {
        System.out.println("Constructor with String and int: " + s + ", " + a);
    }

    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload();
        ConstructorOverload obj2 = new ConstructorOverload(10);
        ConstructorOverload obj3 = new ConstructorOverload("Hello");
        ConstructorOverload obj4 = new ConstructorOverload(20, "World");
        ConstructorOverload obj5 = new ConstructorOverload("Java", 30);
    }
}