package adapter;

import java.time.LocalDateTime;

public class Ticket implements FriendlyTicket {

    private LocalDateTime enterTime;

    private LocalDateTime exitTime;

    @Override
    public LocalDateTime getEnterTime() {
        return enterTime;
    }

    @Override
    public void setEnterTime(LocalDateTime enterTime) {
        this.enterTime = enterTime;
    }

    @Override
    public LocalDateTime getExitTime() {
        return exitTime;
    }

    @Override
    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

}
