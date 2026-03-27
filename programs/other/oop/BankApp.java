package other.oop;

public class BankApp {
    static String bankName = "Sample Bank";

    long accNo;
    String name;
    boolean savingsAccount;

    public BankApp() {                                  // non-parameterized constructor
        System.out.println("Bank Name: " + bankName);
    }


    public BankApp(long accNo, String name, boolean savingsAccount) { // parameterized constructor
        this.accNo = accNo;
        this.name = name;
        this.savingsAccount = savingsAccount;
    }

    public static void main(String[] args) {

        new BankApp();
        BankApp vamsi = new BankApp(63673782388L, "Vamsi", true);
        BankApp raju = new BankApp(73468743870L, "Raju", false);

        System.out.println(vamsi.accNo);
        System.out.println(raju.name);

    }
}