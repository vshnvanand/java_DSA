public class InsufficientFundsException extends Exception{

    private final int amount;

    @Override
    public String toString(){
         return "You dont have enough money";
    }

    public InsufficientFundsException(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return this.amount;
    }

}
