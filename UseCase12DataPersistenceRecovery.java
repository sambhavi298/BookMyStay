import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        String file = "data.ser";

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 3);

        // Save
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(inventory);
            System.out.println("Data Saved");
        } catch (Exception e) {
            System.out.println("Save Error");
        }

        // Load
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Map<String, Integer> loaded = (Map<String, Integer>) ois.readObject();
            System.out.println("Recovered Data: " + loaded);
        } catch (Exception e) {
            System.out.println("Load Error");
        }
    }
}
