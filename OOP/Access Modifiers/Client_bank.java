public class Client_bank {
    public static void main(String[] args) {
        Bank u1 = new Bank("SBI123", 15000) ; 
        u1.display() ;
        u1.withdraw(22000);
        u1.getaccnum();
        System.out.println(u1.getBalance());
    }
}
