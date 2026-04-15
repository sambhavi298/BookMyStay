class Client {
    String name;
    int riskScore;
    double balance;

    Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class Problem2 {

    // Bubble Sort (ascending)
    public static void bubbleSort(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort (descending)
    public static void insertionSortDesc(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Client[] clients = {
            new Client("A", 20, 5000),
            new Client("B", 50, 8000),
            new Client("C", 80, 2000)
        };

        // Bubble Sort
        bubbleSort(clients);
        System.out.println("Bubble (Ascending):");
        for (Client c : clients) {
            System.out.println(c);
        }

        // Insertion Sort
        insertionSortDesc(clients);
        System.out.println("\nInsertion (Descending):");
        for (Client c : clients) {
            System.out.println(c);
        }

        // Top 3 (or top 10 in real case)
        System.out.println("\nTop Risks:");
        for (int i = 0; i < clients.length; i++) {
            System.out.println(clients[i]);
        }
    }
}