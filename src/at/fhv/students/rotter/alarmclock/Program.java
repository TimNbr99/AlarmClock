package at.fhv.students.rotter.alarmclock;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean running = true;
        AlarmClock ac = new AlarmClock();
        Scanner s = new Scanner(System.in);
        while(running) {
            System.out.println("Actual time: " + ac.getTime());
            System.out.println("Actual alarm: " + ac.getAlarm());
            System.out.println("Actual state: " + ac.getState());
            System.out.println("Change mode: Press c");
            System.out.println("Increment: Press i");
            System.out.println("Stop: Press s");

            switch(s.next().charAt(0)) {
                case 'c':
                    ac.changeMode();
                    break;
                case 'i':
                    ac.increment();
                    break;
                case 's':
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
