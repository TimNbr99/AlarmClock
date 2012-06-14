package at.fhv.students.rotter.alarmclock;

/**
 * The state of the alarm clock
 */
public abstract class AlarmClockState {
    /**
     * The alarm clock
     */
    private AlarmClock _alarmClock;

    public AlarmClockState(AlarmClock alarmClock){
        _alarmClock = alarmClock;
    }

    protected AlarmClock getAlarmClock() {
        return _alarmClock;
    }

    /**
     * Changes the mode of the alarm clock
     */
    public abstract void changeMode();

    /**
     * Increments the current selection
     */
    public abstract void increment();
}
