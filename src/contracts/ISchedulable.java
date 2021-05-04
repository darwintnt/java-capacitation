package contracts;

import java.util.Date;

public interface ISchedulable {
    String schedule(Date date, String time);
}
