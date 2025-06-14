import java.util.Scanner;

public class ReservationSystem {
    static String storedUsername = "user";
    static String storedPassword = "pass";
    static int pnr = 1001;
    static String reservedName = "";
    static boolean ticketBooked = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login
        System.out.println("=== Online Reservation System ===");
        System.out.print("Enter Username: ");
        String user = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(storedUsername) || !pass.equals(storedPassword)) {
            System.out.println("Login failed. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Reserve Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    if (ticketBooked) {
                        System.out.println("Ticket already booked with PNR: " + pnr);
                    } else {
                        System.out.print("Enter your name: ");
                        reservedName = sc.nextLine();
                        ticketBooked = true;
                        System.out.println("Ticket booked successfully! Your PNR is: " + pnr);
                    }
                    break;

                case 2:
                    if (!ticketBooked) {
                        System.out.println("No ticket to cancel.");
                    } else {
                        System.out.print("Enter PNR to cancel: ");
                        int enteredPNR = sc.nextInt();
                        if (enteredPNR == pnr) {
                            ticketBooked = false;
                            System.out.println("Ticket cancelled successfully.");
                        } else {
                            System.out.println("Invalid PNR.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the system.");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
