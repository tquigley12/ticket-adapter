package adapter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class FriendlyTicketAdapter implements FriendlyTicket {

    private LegacyTicket legacyTicket;

    public FriendlyTicketAdapter(LegacyTicket legacyTicket) {
        this.legacyTicket = legacyTicket;
    }

    @Override
    public LocalDateTime getEnterTime() {
        return translate(legacyTicket.getCheckIn());
    }

    @Override
    public void setEnterTime(LocalDateTime enterTime) {
        legacyTicket.setCheckIn(translate(enterTime));
    }

    @Override
    public LocalDateTime getExitTime() {
        return translate(legacyTicket.getCheckOut());
    }

    @Override
    public void setExitTime(LocalDateTime exitTime) {
        legacyTicket.setCheckOut(translate(exitTime));
    }

    private LocalDateTime translate(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    private Date translate(LocalDateTime ldt) {
        ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
        return Date.from(zdt.toInstant());
    }
}
