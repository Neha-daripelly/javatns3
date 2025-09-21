public class StaticProg {

    static int staticVar;
    int instanceVar;

    static {
        staticVar = 10;
        System.out.println("Static block executed. staticVar = " + staticVar);
    }

    StaticProg(int val) {
        instanceVar = val;
        System.out.println("Constructor executed. instanceVar = " + instanceVar);
    }

    static void staticMethod() {
        System.out.println("Static method called. staticVar = " + staticVar);
    }

    void instanceMethod() {
        System.out.println("Instance method called. instanceVar = " + instanceVar);
    }

    public static void main(String[] args) {
        StaticProg.staticMethod();

        StaticProg obj1 = new StaticProg(100);
        obj1.instanceMethod();

        StaticProg obj2 = new StaticProg(200);
        obj2.instanceMethod();

        StaticProg.staticVar = 50;
        StaticProg.staticMethod();
    }
}
