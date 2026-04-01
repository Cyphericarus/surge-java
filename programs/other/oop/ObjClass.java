package other.oop;

class Laptop1 {
    String model;
    int price;
    boolean isBranded;

    Laptop1(String model, int price, boolean isBranded) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [model: " + model + ", price: " + price + ", isBranded: " + isBranded + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        result = prime * result + (isBranded ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop1 other = (Laptop1) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        if (isBranded != other.isBranded)
            return false;
        return true;
    }
}
public class ObjClass {
    public static void main(String[] args) {
        Laptop1 one = new Laptop1("HP", 750, true);
        System.out.println(one.toString());
    }
}
