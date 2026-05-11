import java.util.*;

class Room {
    String name;
    boolean isVIP;
    int days;
    double amount;

    Room(String name, boolean isVIP, int days, double amount) {
        this.name = name;
        this.isVIP = isVIP;
        this.days = days;
        this.amount = amount;
    }
}

public class HotelBookingSystem {
    static Room room1 = null;
    static Room room2 = null;
    static Room room3 = null;
    static Room room4 = null;
    static Room room5 = null;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Book Room\n2. Show Rooms\n3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            if (choice == 1) bookRoom();
            else if (choice == 2) showRooms();
            else break;
        }
    }

    static void bookRoom() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("VIP? (yes/no): ");
        boolean isVIP = sc.nextLine().equalsIgnoreCase("yes");
        System.out.print("Number of days: ");
        int days = sc.nextInt();
        System.out.print("Total amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline

        if (days > 7) amount *= 0.9;
        double advance = amount * 0.5;

        if (isRoomAvailable()) {
            assignRoom(new Room(name, isVIP, days, amount));
            System.out.println("Room booked! Advance: ₹" + advance);
        } else if (isVIP && replaceNormalCustomer(new Room(name, isVIP, days, amount))) {
            System.out.println("No rooms available. Replaced a normal customer. Advance: ₹" + advance);
        } else {
            System.out.println("Hotel Full!");
        }
    }

    static boolean isRoomAvailable() {
        return room1 == null || room2 == null || room3 == null || room4 == null || room5 == null;
    }

    static void assignRoom(Room r) {
        if (room1 == null) room1 = r;
        else if (room2 == null) room2 = r;
        else if (room3 == null) room3 = r;
        else if (room4 == null) room4 = r;
        else if (room5 == null) room5 = r;
    }

    static boolean replaceNormalCustomer(Room r) {
        if (room1 != null && !room1.isVIP) {
            room1 = r;
            return true;
        } else if (room2 != null && !room2.isVIP) {
            room2 = r;
            return true;
        } else if (room3 != null && !room3.isVIP) {
            room3 = r;
            return true;
        } else if (room4 != null && !room4.isVIP) {
            room4 = r;
            return true;
        } else if (room5 != null && !room5.isVIP) {
            room5 = r;
            return true;
        }
        return false;
    }

    static void showRooms() {
        showRoom(1, room1);
        showRoom(2, room2);
        showRoom(3, room3);
        showRoom(4, room4);
        showRoom(5, room5);
    }

    static void showRoom(int number, Room room) {
        if (room == null)
        {
            System.out.println("Room " + number + ": Available");
        }
        else
        {
            System.out.println("Room " + number + ": " + (room.isVIP ? "VIP" : "Normal") +" " + room.name + ", Days: " + room.days + ", Amount: ₹" + room.amount);
        }
            
    }
}