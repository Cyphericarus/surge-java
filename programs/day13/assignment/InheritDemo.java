package day13.assignment;

class GrandFather {
    int landInAcres = 20;

    public int getLandInAcres() {
        return landInAcres;
    }
}

class Father extends GrandFather {
    int noOfHouses = 5;

    public int getNoHouses() {
        return noOfHouses;
    }
}

class Child extends Father {
    double height = 5.9;
}

public class InheritDemo {
    public static void main(String[] args) {
        Child childObj = new Child();
        System.out.println(childObj.getLandInAcres());
        System.out.println(childObj.getNoHouses());
    }
}
