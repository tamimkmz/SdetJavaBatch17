package Class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Marta",1252202152,16000000,
                "User123","Pass123","Checking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Tamim");
        System.out.println(b.getName());
    }

}
