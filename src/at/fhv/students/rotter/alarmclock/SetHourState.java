package at.fhv.students.rotter.alarmclock;

/**
 * This state increments the hour of the time
 */
public class SetHourState extends AlarmClockState {

    public SetHourState(AlarmClock alarmClock) {
        super(alarmClock);
    }

    /**
     * Changes the mode of the alarm clock
     */
    @Override
    public void changeMode() {
        getAlarmClock().setState(new SetMinuteState(getAlarmClock()));
    }

    /**
     * Increments the current selection
     */
    @Override
    public void increment() {
        getAlarmClock().getTime().incrementHour();
    }
}
