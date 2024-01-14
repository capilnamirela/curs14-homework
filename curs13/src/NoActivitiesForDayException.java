import java.util.ArrayList;
import java.util.List;

public class NoActivitiesForDayException extends Exception{
    private final List<DayOfWeek> missingDays = new ArrayList<>();
    public NoActivitiesForDayException(String message, List<DayOfWeek> missingDays){
        super(message);
        this.missingDays.addAll(missingDays);
    }

    public List<DayOfWeek> getMissingDays() {
        return missingDays;
    }
}
