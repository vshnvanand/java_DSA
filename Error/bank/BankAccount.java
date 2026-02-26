public class BankAccount {
    
    public int balance = 0;

    public BankAccount(int amount) {
        this.balance = amount;
    }

    public void withDrawl(int withAmount) throws InsufficientFundsException{
        if(withAmount > balance){
            throw new InsufficientFundsException(balance);
        }else{
            balance -= withAmount;
        }
    }
    

}
