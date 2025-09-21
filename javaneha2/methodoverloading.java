public class methodoverloading {

    void display(int a, double b) {
        System.out.println("Method with int and double parameters: " + a + ", " + b);
    }

    void display(double a, int b) {
        System.out.println("Method with double and int parameters: " + a + ", " + b);
    }

    void display(String a, int b) {
        System.out.println("Method with String and int parameters: " + a + ", " + b);
    }

    void display(int a, String b) {
        System.out.println("Method with int and String parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
    	methodoverloading obj = new methodoverloading();
        obj.display(10, 20.5);
        obj.display(15.5, 20);
        obj.display("Age", 25);
        obj.display(30, "Years");
    }
}