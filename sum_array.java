import java.util.Arrays;
import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = arr[n - 1 - i];
        }
        System.out.println("Reversed array: " + Arrays.toString(nums));
    }
}
