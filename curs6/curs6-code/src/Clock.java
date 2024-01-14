public class Clock {
    private int hour;
    private int minutes;

    public Clock(int initialHour, int initialMinutes){
        setHour(initialHour);
        setMinutes(initialMinutes);

    }

    public String getTime(){

        return "The time is " + hour + ":" + minutes;

    }
    public int getHour(){
        return hour;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setHour(int someHour) {
        if (someHour < 0 || someHour > 24){
            System.out.println("Enter a valid hour");
        } else {
            hour = someHour;
        }
    }
    public void setMinutes(int someMinutes){
        if (someMinutes < 0 || someMinutes > 60) {
            System.out.println("Enter valid minutes");
        } else {
            minutes = someMinutes;
        }
    }

}



