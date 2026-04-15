import java.util.*;

class Room {
    String type;
    double price;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
    }
}

public class UseCase4RoomSearch {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 2);
        inventory.put("Double", 0);
        inventory.put("Suite", 1);

        List<Room> rooms = Arrays.asList(
                new Room("Single", 1000),
                new Room("Double", 2000),
                new Room("Suite", 5000)
        );

        System.out.println("Available Rooms:");

        for (Room room : rooms) {
            int available = inventory.getOrDefault(room.type, 0);
            if (available > 0) {
                System.out.println(room.type + " - ₹" + room.price + " | Available: " + available);
            }
        }
    }
}
