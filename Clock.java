import java.util.Scanner;

public class Clock {

    // Converts Seconds to Minutes
    public double secondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    // Converts Seconds to Hours
    public double secondsToHours(int seconds) {
        return seconds / 3600.0;
    }

    // Converts Minutes to Seconds
    public int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    // Converts Minutes to Hours
    public double minutesToHours(int minutes) {
        return minutes / 60.0;
    }

    // Converts Hours to Seconds
    public int hoursToSeconds(int hours) {
        return hours * 3600;
    }

    // Converts Hours to Minutes
    public int hoursToMinutes(int hours) {
        return hours * 60;
    }

    // Main method to drive the menu and conversions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock();
        boolean continueConversion = true;

        while (continueConversion) {
            // Display menu options
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");
            System.out.print("Choose the Conversion: ");
            int choice = scanner.nextInt();

            System.out.print("Enter the Value: ");
            int value = scanner.nextInt();

            // Perform the selected conversion
            switch (choice) {
                case 1:
                    System.out.println("Seconds to Minutes: " + clock.secondsToMinutes(value));
                    break;
                case 2:
                    System.out.println("Seconds to Hours: " + clock.secondsToHours(value));
                    break;
                case 3:
                    System.out.println("Minutes to Seconds: " + clock.minutesToSeconds(value));
                    break;
                case 4:
                    System.out.println("Minutes to Hours: " + clock.minutesToHours(value));
                    break;
                case 5:
                    System.out.println("Hours to Seconds: " + clock.hoursToSeconds(value));
                    break;
                case 6:
                    System.out.println("Hours to Minutes: " + clock.hoursToMinutes(value));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to convert time? (Y/N): ");
            char response = scanner.next().charAt(0);
            if (response == 'N' || response == 'n') {
                continueConversion = false;
            }
            System.out.println("---------------------------------------------");
        }

        scanner.close();
        System.out.println("Thank you for using the Clock Conversion Program!");
    }
}