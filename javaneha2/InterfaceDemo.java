interface Phone {
    void call();
    void sms();
}

class Jio implements Phone {
    public void call() {
        System.out.println(
            "Jio: Making a call using Jio network..."
        );
    }
    public void sms() {
        System.out.println(
            "Jio: Sending SMS using Jio network..."
        );
    }
}

class Samsung implements Phone {
    public void call() {
        System.out.println(
            "Samsung: Making a call using Samsung device..."
        );
    }
    public void sms() {
        System.out.println(
            "Samsung: Sending SMS using Samsung device..."
        );
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Phone jio = new Jio();
        jio.call();
        jio.sms();

        Phone samsung = new Samsung();
        samsung.call();
        samsung.sms();
    }
}

