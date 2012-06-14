package at.fhv.students.rotter.alarmclock.test;

import at.fhv.students.rotter.alarmclock.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlarmClockTest {
    private AlarmClock alarmClock;

    @Before
    public void setUp() {
        alarmClock = new AlarmClock();
    }

    @Test
    public void standard() {
        Time expected = new Time(0,0,0);
        assertEquals(expected, alarmClock.getTime());
        assertEquals(expected, alarmClock.getAlarm());
        assertTrue(alarmClock.getState() instanceof DisplayTimeState);
    }

    @Test
    public void modeSequence() {
        assertTrue(alarmClock.getState() instanceof DisplayTimeState);
        alarmClock.changeMode();
        assertTrue(alarmClock.getState() instanceof SetHourState);
        alarmClock.changeMode();
        assertTrue(alarmClock.getState() instanceof SetMinuteState);
        alarmClock.changeMode();
        assertTrue(alarmClock.getState() instanceof SetAlarmHourState);
        alarmClock.changeMode();
        assertTrue(alarmClock.getState() instanceof SetAlarmMinuteState);
        alarmClock.changeMode();
    }

    @Test
    public void displayTime() {
        alarmClock.setState(new DisplayTimeState(alarmClock));
        alarmClock.increment();
        Time expectedTime = new Time(0,0,0);
        assertEquals(expectedTime, alarmClock.getTime());
        Time expectedAlarm = new Time(0,0,0);
        assertEquals(expectedAlarm, alarmClock.getAlarm());
    }

    @Test
    public void setHour() {
        alarmClock.setState(new SetHourState(alarmClock));
        alarmClock.increment();
        Time expectedTime = new Time(1,0,0);
        assertEquals(expectedTime, alarmClock.getTime());
        Time expectedAlarm = new Time(0,0,0);
        assertEquals(expectedAlarm, alarmClock.getAlarm());
    }

    @Test
    public void setMinute() {
        alarmClock.setState(new SetMinuteState(alarmClock));
        alarmClock.increment();
        Time expectedTime = new Time(0,1,0);
        assertEquals(expectedTime, alarmClock.getTime());
        Time expectedAlarm = new Time(0,0,0);
        assertEquals(expectedAlarm, alarmClock.getAlarm());
    }

    @Test
    public void setAlarmHour() {
        alarmClock.setState(new SetAlarmHourState(alarmClock));
        alarmClock.increment();
        Time expectedTime = new Time(0,0,0);
        assertEquals(expectedTime, alarmClock.getTime());
        Time expectedAlarm = new Time(1,0,0);
        assertEquals(expectedAlarm, alarmClock.getAlarm());
    }

    @Test
    public void setAlarmMinute() {
        alarmClock.setState(new SetAlarmMinuteState(alarmClock));
        alarmClock.increment();
        Time expectedTime = new Time(0,0,0);
        assertEquals(expectedTime, alarmClock.getTime());
        Time expectedAlarm = new Time(0,1,0);
        assertEquals(expectedAlarm, alarmClock.getAlarm());
    }
}
