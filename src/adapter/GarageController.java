package adapter;

import java.time.LocalDateTime;

public class GarageController {

    public static void main(String[] args) {
        new GarageController();
    }

    public GarageController() {
        FriendlyTicketMachine friendlyMachine = new FriendlyTicketMachine();
        FriendlyTicket friendlyTicket = friendlyMachine.getTicket();

        double fee1 = getFee(friendlyTicket.getEnterTime(), friendlyTicket.getExitTime());

        LegacyTicketMachine legacyMachine = new LegacyTicketMachine();
        LegacyTicket legacyTicket = legacyMachine.getTicket();

        // double fee2 = getFee(legacyTicket.getCheckIn(), legacyTicket.getCheckOut());
        FriendlyTicket adaptedTicket = new FriendlyTicketAdapter(legacyTicket);
        double fee2 = getFee(adaptedTicket.getEnterTime(), adaptedTicket.getExitTime());
    }

    public double getFee(LocalDateTime timeIn, LocalDateTime timeOut) {
        return 15;
    }

}
