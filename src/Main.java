import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pomodoro Clock");
        System.out.println("This clock will tell you when your 25 minutes is up and your 5 minute break will begin.");
        Scanner user_input = new Scanner(System.in);
        System.out.println("Would you like to start a pomodoro clock? If so, type 'yes':");
        String start_clock = user_input.nextLine();
        System.out.println("You said: '" + start_clock + "'.");
        String affirm = "yes";
        if (start_clock.equalsIgnoreCase(affirm)){
            System.out.println("Excellent! the pomodoro clock will begin.");
            try {
                TimeUnit.MINUTES.sleep(25);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The timer is up! Here is your 5 minute break.");
            try {
                TimeUnit.MINUTES.sleep(5);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Your break is over.");
            System.out.println("Would you like to start another timer? If so, type 'yes':");
            String restart_clock = user_input.nextLine();
            while (restart_clock.equalsIgnoreCase(affirm)){
                System.out.println("Excellent! another pomodoro clock will begin.");
                try {
                    TimeUnit.MINUTES.sleep(25);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("The timer is up! Here is your 5 minute break.");
                try {
                    TimeUnit.MINUTES.sleep(5);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Your break is over.");
                System.out.println("Would you like to start another timer? If so, type 'yes':");
                String loop_clock = user_input.nextLine();
                if (!loop_clock.equalsIgnoreCase(affirm)) break;
            }
        } else{
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }
}