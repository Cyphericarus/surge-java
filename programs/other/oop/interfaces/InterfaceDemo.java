// loosely coupled objects
package other.oop.interfaces;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run: faster");
    }
}

class Developer {
    public void devApp(Computer obj) {
        obj.code();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer dev = new Developer();
        dev.devApp(desktop);
        dev.devApp(laptop);
    }
}
