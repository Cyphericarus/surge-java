package other.enums;

enum Status {
    Running, Failed, Pending, Success;
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s1 = Status.Running;
        System.out.println(s1);

        Status s2 = Status.Pending;
        System.out.println(s2.ordinal());

        Status[] all = Status.values();
        
        for(Status s : all) {
            System.out.println(s + ": " + s.ordinal());
        }

        // lets try switch case 
        switch(s2.ordinal()) {
            case 0: 
                System.out.println("Wait while it's Running");
                break;
            
            case 1: 
                System.out.println("Status Failed");
                break; 
                
            case 2: 
                System.out.println("Status Pending");
                break;

            case 3: 
                System.out.println("Status Successful");
                break;
            default:
                System.out.println("Invalid Status");
        }
    }
}
