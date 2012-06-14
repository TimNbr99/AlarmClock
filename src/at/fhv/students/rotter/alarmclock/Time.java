package at.fhv.students.rotter.alarmclock;

/**
 * Represents a time
 */
public class Time {

    private static final int HOURS_OF_DAY = 24;
    private static final int MINUTES_OF_HOUR = 60;

    /**
     * The hour
     */
    private int _hour;
    /**
     * The minute
     */
    private int _minute;
    /**
     * The second
     */
    private int _second;

    public Time(){
        this(0,0,0);
    }

    public Time(int hour, int minute, int second) {
        _hour = hour;
        _minute = minute;
        _second = second;
    }

    /**
     * Returns the hour
     * @return The hour
     */
    public int getHour() {
        return _hour;
    }

    /**
     * Sets the hour
     * @param hour The hour
     */
    public void setHour(int hour) throws InvalidHourException {
        if(hour < 0 || hour > 23) {
            throw new InvalidHourException(hour);
        }
        _hour = hour;
    }

    /**
     * Returns the minute
     * @return The minute
     */
    public int getMinute() {
        return _minute;
    }

    /**
     * Sets the minute
     * @param minute The minute
     */
    public void setMinute(int minute) throws InvalidMinuteException {
        if(minute < 0 || minute > 59) {
            throw new InvalidMinuteException(minute);
        }
        _minute = minute;
    }

    /**
     * Returns the second
     * @return The second
     */
    public int getSecond() {
        return _second;
    }

    /**
     * Sets the second
     * @param second The second
     */
    public void setSecond(int second) throws InvalidSecondException {
        if(second < 0 || second > 59) {
            throw new InvalidSecondException(second);
        }
        _second = second;
    }

    /**
     * Increments the hour by one
     */
    public void incrementHour() {
        try {
            setHour(getHour() + 1);
        } catch (InvalidHourException e) {
            try {
                setHour(e.getHour() - HOURS_OF_DAY);
            } catch (InvalidHourException e1) {
                assert e1.getHour() > 23 : "The hour has unexpectedly been higher than 24";
            }
        }
    }

    /**
     * Increments the minute by one
     */
    public void incrementMinute() {
        try {
            setMinute(getMinute() + 1);
        } catch (InvalidMinuteException e) {
            try {
                setMinute(e.getMinute() - MINUTES_OF_HOUR);
            } catch (InvalidMinuteException e1) {
                assert e1.getMinute() > 59 : "The hour has unexpectedly been higher than 60";
            }
        }
    }

    @Override
    public String toString() {
        return _hour+":"+_minute+":"+_second;
    }
}
