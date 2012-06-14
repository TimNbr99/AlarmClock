package at.fhv.students.rotter.alarmclock;

/**
 * This state shows the current time
 */
public class DisplayTimeState extends AlarmClockState {

    public DisplayTimeState(AlarmClock alarmClock) {
        super(alarmClock);
    }

    /**
     * Changes the mode of the alarm clock
     */
    @Override
    public void changeMode() {
        getAlarmClock().setState(new SetHourState(getAlarmClock()));
    }

    /**
     * Increments the current selection
     */
    @Override
    public void increment() {
        //Do nothing
    }
}
