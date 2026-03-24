package day5.assignment;

public class BankDetails {
    static String bankName = "Sample Bank";         // static variable
    static String IFSC = "BNK204863";

    long accNo = 203843834749L;                     // instance variable
    String name = "John Doe";
    boolean savingsAccount = true;

    public String getMaskedAccNo() {
        String accountNo = "" + accNo;              // local variable
    
        return "XXXXXX" + accountNo.substring(5, accountNo.length()-1) ;
    }

    public String getAccountType () {
        return savingsAccount ? "Savings" : "Non-Savings";
    }

    public static String getBankName () {
        return bankName;
    }

    public static void main (String [] args) {
        BankDetails details = new BankDetails();

        System.out.println("Bank Name: " + getBankName());
        System.out.println("IFSC Code: " + IFSC);
        System.out.println("Account no: " + details.accNo);
        System.out.println("Account Type: " + (details.getAccountType()));
        System.out.println("Masked Account No: " + details.getMaskedAccNo());
    }
}