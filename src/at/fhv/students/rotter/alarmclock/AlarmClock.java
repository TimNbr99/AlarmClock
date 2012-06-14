package at.fhv.students.rotter.alarmclock;

/**
 * Represents an Alarm Clock
 */
public class AlarmClock {
    /**
     * The current state of the alarm clock
     */
    private AlarmClockState _state;
    /**
     * The current time
     */
    private Time _time;
    /**
     * The current alarm time
     */
    private Time _alarm;

    public AlarmClock() {
        _time = new Time();
        _alarm = new Time();
        _state = new DisplayTimeState(this);
    }

    /**
     * Returns the state of the alarm clock
     * @return The state of the alarm clock
     */
    public AlarmClockState getState() {
        return _state;
    }

    /**
     * Sets the state of the alarm clock
     * @param state The state of the alarm clock
     */
    public void setState(AlarmClockState state) {
        _state = state;
    }

    /**
     * Returns the time
     * @return The time
     */
    public Time getTime() {
        return _time;
    }

    /**
     * Sets the time
     * @param time The time
     */
    public void setTime(Time time) {
        _time = time;
    }

    /**
     * Returns the alarm
     * @return The alarm
     */
    public Time getAlarm() {
        return _alarm;
    }

    /**
     * Sets the alarm
     * @param alarm The alarm
     */
    public void setAlarm(Time alarm) {
        _alarm = alarm;
    }

    /**
     * Changes the mode of the alarm clock
     */
    public void changeMode() {
        _state.changeMode();
    }

    /**
     * Increments the current selection
     */
    public void increment() {
        _state.increment();
    }
}
