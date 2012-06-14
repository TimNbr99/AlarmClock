package at.fhv.students.rotter.alarmclock;

/**
 * Thrown if a invalid second has been passed
 */
public class InvalidSecondException extends Throwable {
    /**
     * The invalid second
     */
    private int _second;

    public InvalidSecondException(int second) {
        _second = second;
    }

    /**
     * Returns the invalid second
     * @return The invalid second
     */
    public int getSecond() {
        return _second;
    }
}
