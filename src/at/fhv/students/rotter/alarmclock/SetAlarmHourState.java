package at.fhv.students.rotter.alarmclock;

public class SetAlarmHourState extends AlarmClockState {
    public SetAlarmHourState(AlarmClock alarmClock) {
        super(alarmClock);
    }

    /**
     * Changes the mode of the alarm clock
     */
    @Override
    public void changeMode() {
        getAlarmClock().setState(new SetAlarmMinuteState(getAlarmClock()));
    }

    /**
     * Increments the current selection
     */
    @Override
    public void increment() {
        getAlarmClock().getAlarm().incrementHour();
    }
}
