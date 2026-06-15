import java.util.Scanner;

public class HotelReservationSystem {
    static boolean[] rooms = new boolean[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewRooms();
                    break;

                case 2:
                    System.out.print("Enter room number (1-5): ");
                    int room = sc.nextInt();

                    if (!rooms[room - 1]) {
                        rooms[room - 1] = true;
                        System.out.println("Room booked successfully!");
                    } else {
                        System.out.println("Room already booked.");
                    }
                    break;

                case 3:
                    System.out.print("Enter room number (1-5): ");
                    room = sc.nextInt();

                    if (rooms[room - 1]) {
                        rooms[room - 1] = false;
                        System.out.println("Booking cancelled.");
                    } else {
                        System.out.println("Room is already available.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void viewRooms() {
        for (int i = 0; i < 5; i++) {
            if (rooms[i])
                System.out.println("Room " + (i + 1) + ": Booked");
            else
                System.out.println("Room " + (i + 1) + ": Available");
        }
    }
}