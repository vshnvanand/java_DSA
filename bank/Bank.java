package bank;

class Account {
    public String name;
    protected String email;
    private  String password;

    // setters
    public void setPassword(String value){
        this.password = value;
    }
    
    // getters 
    public String getPassword(){
        return this.password;
    }
}

// access modifier
// public 
// private
// protected 
// default



public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Murga Chor";
        account1.email = "chorchor@yahoo.com";
        account1.setPassword("pakdopakdoMurgipakdo");
        System.out.println(account1.getPassword());
    }
}