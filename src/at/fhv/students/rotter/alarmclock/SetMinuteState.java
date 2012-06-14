package at.fhv.students.rotter.alarmclock;

public class SetMinuteState extends AlarmClockState {
    public SetMinuteState(AlarmClock alarmClock) {
        super(alarmClock);
    }

    /**
     * Changes the mode of the alarm clock
     */
    @Override
    public void changeMode() {
        getAlarmClock().setState(new SetAlarmHourState(getAlarmClock()));
    }

    /**
     * Increments the current selection
     */
    @Override
    public void increment() {
        getAlarmClock().getTime().incrementMinute();
    }
}
