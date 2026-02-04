import java.util.Arrays;

public class MergeSortBookPrices {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
    }

    private static void mergeSort(int[] arr, int l, int r, int[] temp) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid, temp);
        mergeSort(arr, mid + 1, r, temp);
        merge(arr, l, mid, r, temp);
    }

    private static void merge(int[] arr, int l, int mid, int r, int[] temp) {
        int i = l, j = mid + 1, k = l;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        for (int p = l; p <= r; p++) arr[p] = temp[p];
    }

    public static void main(String[] args) {
        int[] prices = {399, 199, 499, 299};
        mergeSort(prices);
        System.out.println(Arrays.toString(prices)); // [199, 299, 399, 499]
    }
}
