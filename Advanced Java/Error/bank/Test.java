public class Test {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(100);
        try {
            ba.withDrawl(150);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getAmount());
            System.out.println(e);
        }
    }    
}
