package other.enums;

enum Laptop {
    Pavilion(42000), Macbook(89000), Thinkpad(72000), Acer;
    
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    private Laptop(){
        price = 35000;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Pavilion;

        System.out.println(lap + ": " + lap.getPrice());
        System.out.println();

        for(Laptop laptop : Laptop.values()) {
            System.out.println(laptop + ": " + laptop.getPrice());
        }
    }
}
