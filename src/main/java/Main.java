import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = Infrastructure.newArray(50000000, 10000000);
        int[] arr2 = Arrays.copyOf(arr, 50000000);
//        Infrastructure.showArray(arr);
        long start = System.nanoTime();
        Sorting.heapSort(arr);
        long end = System.nanoTime();
//        Infrastructure.showArray(arr);
        System.out.println((double)end - start + " нсек");

        long start2 = System.nanoTime();
        Sorting.quickSort(arr2, 0, 49999999);
        long end2 = System.nanoTime();
//        Infrastructure.showArray(arr2);
        System.out.println((double)end2 - start2 + " нсек");
    }
}
