import java.util.Scanner;

// walang halong AI to heheheheh

// add a public class for the formula of the clock convertion
public class Clock {

    // Seconds to Minutes
    public double secondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    // Seconds to Hours
    public double secondsToHours(int seconds) {
        return seconds / 3600.0;
    }

    // Minutes to Seconds
    public int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    // Minutes to Hours
    public double minutesToHours(int minutes) {
        return minutes / 60.0;
    }

    // Hours to Seconds
    public int hoursToSeconds(int hours) {
        return hours * 3600;
    }

    // Hours to Minutes
    public int hoursToMinutes(int hours) {
        return hours * 60;
    }

}