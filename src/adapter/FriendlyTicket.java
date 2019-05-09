package adapter;

import java.time.LocalDateTime;

public interface FriendlyTicket {

    public LocalDateTime getEnterTime();

    public void setEnterTime(LocalDateTime enterTime);

    public LocalDateTime getExitTime();

    public void setExitTime(LocalDateTime exitTime);
}
