import java.util.*;

class BookingService {
    private Map<String, Integer> inventory;
    private Map<String, Set<String>> allocatedRooms;

    public BookingService(Map<String, Integer> inventory) {
        this.inventory = inventory;
        this.allocatedRooms = new HashMap<>();
    }

    public void allocateRoom(String type) {
        if (inventory.getOrDefault(type, 0) > 0) {
            String roomId = type + "_" + UUID.randomUUID().toString().substring(0, 5);

            allocatedRooms.putIfAbsent(type, new HashSet<>());
            allocatedRooms.get(type).add(roomId);

            inventory.put(type, inventory.get(type) - 1);

            System.out.println("Allocated Room: " + roomId);
        } else {
            System.out.println("No rooms available for " + type);
        }
    }
}

public class UseCase6RoomAllocationService {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 2);

        BookingService service = new BookingService(inventory);

        service.allocateRoom("Single");
        service.allocateRoom("Single");
        service.allocateRoom("Single"); // no availability
    }
}
