import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoActivitiesForDayException {
        Set<DayScheduler> schedulers = new HashSet<>();
        List<String> activities = new ArrayList<>();

        schedulers.add(new DayScheduler(DayOfWeek.MONDAY, activities));
        schedulers.add(new DayScheduler(DayOfWeek.TUESDAY, activities));
        schedulers.add(new DayScheduler(DayOfWeek.WEDNESDAY, activities));

        WeeklyPlanner weeklyPlanner = new WeeklyPlanner(schedulers);
        weeklyPlanner.addActivity(DayOfWeek.THURSDAY, "Wake up!");

        System.out.println(weeklyPlanner.getActivities(DayOfWeek.THURSDAY));

        weeklyPlanner.removeActivity(DayOfWeek.THURSDAY, "Wake up!");
        System.out.println(weeklyPlanner.getActivities(DayOfWeek.THURSDAY));

        // weeklyPlanner.removeActivity(DayOfWeek.MONDAY, "Wake up!");

        try {
            weeklyPlanner.endPlanning();
        } catch (NoActivitiesForDayException exception) {
            for (DayOfWeek day : exception.getMissingDays()) {
                weeklyPlanner.addActivity(day, "default activity");
            }
        } finally {
            System.out.println(weeklyPlanner.endPlanning());
        }
        }
    }
