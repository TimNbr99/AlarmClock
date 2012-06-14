package at.fhv.students.rotter.alarmclock;

public class SetAlarmMinuteState extends AlarmClockState {
    public SetAlarmMinuteState(AlarmClock alarmClock) {
        super(alarmClock);
    }

    /**
     * Changes the mode of the alarm clock
     */
    @Override
    public void changeMode() {
        getAlarmClock().setState(new DisplayTimeState(getAlarmClock()));
    }

    /**
     * Increments the current selection
     */
    @Override
    public void increment() {
        getAlarmClock().getAlarm().incrementMinute();
    }
}
