import java.util.Arrays;

public class Problem5 {

    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    public static int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(target);

            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accB", "accA", "accB", "accC"};

        // Linear
        int lin = linearSearch(arr, "accB");
        System.out.println("Linear Search index: " + lin);

        // Binary (need sorted array)
        Arrays.sort(arr);
        int bin = binarySearch(arr, "accB");
        System.out.println("Binary Search index: " + bin);
    }
}