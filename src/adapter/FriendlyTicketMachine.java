package adapter;

public class FriendlyTicketMachine {

    public FriendlyTicket getTicket() {
        return new Ticket();
    }

}
