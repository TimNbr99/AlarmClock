package at.fhv.students.rotter.alarmclock.test;

import at.fhv.students.rotter.alarmclock.InvalidHourException;
import at.fhv.students.rotter.alarmclock.InvalidMinuteException;
import at.fhv.students.rotter.alarmclock.InvalidSecondException;
import at.fhv.students.rotter.alarmclock.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TimeTest {
    private Time time;

    @Before
    public void setUp(){
        time = new Time(23,59,59);
    }

    @Test
    public void standard() {
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());

        time = new Time();
        assertEquals(0, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());

        //Testing exceptions
        try {
            time.setHour(24);
            fail("No InvalidHourException thrown");
        } catch(InvalidHourException exc){

        }
        try {
            time.setHour(-1);
            fail("No InvalidHourException thrown");
        } catch(InvalidHourException exc){

        }
        try {
            time.setMinute(60);
            fail("No InvalidMinuteException thrown");
        } catch(InvalidMinuteException exc){

        }
        try {
            time.setMinute(-1);
            fail("No InvalidMinuteException thrown");
        } catch(InvalidMinuteException exc){

        }
        try {
            time.setSecond(60);
            fail("No InvalidSecondException thrown");
        } catch(InvalidSecondException exc){

        }
        try {
            time.setSecond(-1);
            fail("No InvalidSecondException thrown");
        } catch(InvalidSecondException exc){

        }
    }

    @Test
    public void incrementation() {
        time.incrementHour();
        assertEquals(0, time.getHour());
        time.incrementMinute();
        assertEquals(0, time.getMinute());
        time.incrementHour();
        assertEquals(1, time.getHour());
        time.incrementMinute();
        assertEquals(1,time.getMinute());
    }
}