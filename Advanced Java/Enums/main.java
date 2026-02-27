public class main {
    public static void main(String[] args) {
        // DAYS monday = DAYS.MONDAY;
        // System.out.println(monday.getLower());

        DAYS day = DAYS.MONDAY;
        switch(day){
            case MONDAY:{
                System.out.println("TOday is monday");
                break;
            }
            case TUESDAY -> {
                System.out.println("TOday is monday");
                // no need of break
            }
            // case default :
            default -> System.out.println("Weekend !!");
        }
    }    
}
