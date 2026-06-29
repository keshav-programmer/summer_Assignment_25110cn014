import java.util.Scanner;
public class TicketBookingSystem {
    static final int TOTAL_SEATS = 20;
    static boolean[] seatOccupied = new boolean[TOTAL_SEATS + 1];
    static String[]  seatHolder   = new String[TOTAL_SEATS + 1];

    static void viewSeats() {
        System.out.println("\n--- Seat Availability ---");
        for (int i = 1; i <= TOTAL_SEATS; i++) {
            System.out.print("Seat " + i + ": " + (seatOccupied[i] ? "[BOOKED]" : "[FREE]  ") + "  ");
            if (i % 4 == 0) System.out.println();
        }
    }

    static void bookTicket(Scanner sc) {
        System.out.print("Enter seat number (1-" + TOTAL_SEATS + "): ");
        int seat = sc.nextInt(); sc.nextLine();
        if (seat < 1 || seat > TOTAL_SEATS) { System.out.println("Invalid seat."); return; }
        if (seatOccupied[seat]) { System.out.println("Seat " + seat + " already booked."); return; }
        System.out.print("Enter your name: ");
        seatHolder[seat] = sc.nextLine();
        seatOccupied[seat] = true;
        System.out.println("Seat " + seat + " booked for " + seatHolder[seat] + ". Enjoy the show!");
    }

    static void cancelTicket(Scanner sc) {
        System.out.print("Enter seat number to cancel: ");
        int seat = sc.nextInt(); sc.nextLine();
        if (!seatOccupied[seat]) { System.out.println("Seat not booked."); return; }
        System.out.println("Booking cancelled for " + seatHolder[seat] + " (Seat " + seat + ").");
        seatOccupied[seat] = false;
        seatHolder[seat] = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            System.out.println("\n=== Cinema Ticket Booking ===");
            System.out.println("1.View Seats  2.Book Ticket  3.Cancel  4.Exit");
            System.out.print("Option: ");
            opt = sc.nextInt(); sc.nextLine();
            switch (opt) {
                case 1: viewSeats();        break;
                case 2: bookTicket(sc);     break;
                case 3: cancelTicket(sc);   break;
                case 4: System.out.println("Booking system closed."); break;
                default: System.out.println("Invalid option.");
            }
        } while (opt != 4);
        sc.close();
    }
}
