public enum  DAYS {
    SUNDAY("Sunday"), 
    MONDAY("Monday"), 
    TUESDAY("Tuesday"), 
    WEDNESDAY("Wednesday"), 
    THURSDAY("Thursday"), 
    FRIDAY("Friday"), 
    SATURDAY("Saturday");

    private DAYS(String lower){
        System.out.println("Our cons called");
        this.lower = lower;
    }

    private String lower;

    public String getLower(){
        return lower;
    }

    public void Display(){
        System.out.println("Today is " + this.name());
    }
}
