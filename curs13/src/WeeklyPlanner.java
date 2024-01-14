import javax.swing.*;
import java.util.*;

public class WeeklyPlanner {
    private Set<DayScheduler> schedulers = new HashSet<>();

    public WeeklyPlanner(Set<DayScheduler> schedulers) {
        this.schedulers = schedulers;
    }

    public Set<DayScheduler> getSchedulers() {
        return schedulers;
    }

    public void addActivity(DayOfWeek dayOfWeek, String activity) {
        if (activity == null) {
            throw new NoActivityException("No activity was provided");
        }
        boolean flag = false;
        for (DayScheduler scheduler : schedulers) {
            if (scheduler.getDayOfWeek().equals(dayOfWeek)) {
                scheduler.getActivities().add(activity);
                flag = true;
            }
        }
        if (!flag) {
            List<String> activities = new ArrayList<>();
            activities.add(activity);
            schedulers.add(new DayScheduler(dayOfWeek, activities));
        }
    }

    public List<String> getActivities(DayOfWeek day) {
        for (DayScheduler dayScheduler : schedulers) {
            if (dayScheduler.getDayOfWeek().equals(day)) {
                return dayScheduler.getActivities();
            }
        }
        return new ArrayList<>();
    }

    public void removeActivity(DayOfWeek day, String activity) {
        if (activity == null) {
            throw new NoActivityException("No activity was provided");
        }
        for (DayScheduler scheduler : schedulers) {
            if (scheduler.getDayOfWeek().equals(day)) {
                if (!scheduler.getActivities().remove(activity)) {
                    throw new NoActivityException("No activity was provided for this day: %s".formatted(day));
                }
            }
        }
    }

    public Map<DayOfWeek, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<DayOfWeek, List<String>> result = new HashMap<>();
        List<DayOfWeek> missingDays = new ArrayList<>();
        for (DayScheduler scheduler : schedulers) {
            if (scheduler.getActivities().isEmpty()) {
                missingDays.add(scheduler.getDayOfWeek());
            } else {
                result.put(scheduler.getDayOfWeek(), scheduler.getActivities());
            }
        }
        if (!missingDays.isEmpty()){
            throw new NoActivitiesForDayException("No activities were found for this day %s".formatted(missingDays), missingDays);
        }
        return result;
    }

}
