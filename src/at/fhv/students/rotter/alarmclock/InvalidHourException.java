package at.fhv.students.rotter.alarmclock;

/**
 * Thrown if there was an invalid hour
 */
public class InvalidHourException extends Exception {

    /**
     * The passed hour
     */
    private int _hour;

    public InvalidHourException(int hour) {
        _hour = hour;
    }

    /**
     * Returns the passed hour
     * @return The passed hour
     */
    public int getHour() {
        return _hour;
    }
}
