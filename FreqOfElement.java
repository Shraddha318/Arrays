public class FreqOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2, 2, 4, 3, 2};
        int[] frequencies = frequencyOfElement(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (frequencies[i] != -1) {
                System.out.println("Element " + arr[i] + " occurs " + frequencies[i] + " times.");
            }
        }
    }

    public static int[] frequencyOfElement(int[] arr, int n) {
        int[] freq = new int[n];
        int visited = -1;
        for (int i = 0; i < n; i++) {
            if (freq[i] == visited) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            freq[i] = count;
        }
        return freq;
    }
}
