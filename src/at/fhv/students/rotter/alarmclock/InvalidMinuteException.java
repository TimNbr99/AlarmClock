package at.fhv.students.rotter.alarmclock;

public class InvalidMinuteException extends Throwable {

    private int _minute;

    public InvalidMinuteException(int minute) {
        _minute = minute;
    }

    public int getMinute() {
        return _minute;
    }
}
