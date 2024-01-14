import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;

public class DayScheduler {
    private final DayOfWeek dayOfWeek;
    private List<String> activities = new ArrayList<>();

    public DayScheduler(DayOfWeek dayOfWeek, List<String> activities) {
        this.dayOfWeek = dayOfWeek;
        this.activities = activities;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public List<String> getActivities() {
        return activities;
    }
}
