package repetition;

public class Event {
    public static void main(String[] args){

        boolean hasTicket = false;
        boolean hasInvitation = false;

        if (hasTicket == true  ||  hasInvitation == true) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("You aren't invited");
        }
    }
}
