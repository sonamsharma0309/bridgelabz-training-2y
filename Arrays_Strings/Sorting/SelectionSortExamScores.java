import java.util.Arrays;

public class SelectionSortExamScores {
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int t = scores[i];
            scores[i] = scores[minIdx];
            scores[minIdx] = t;
        }
    }

    public static void main(String[] args) {
        int[] scores = {88, 95, 70, 82};
        selectionSort(scores);
        System.out.println(Arrays.toString(scores)); // [70, 82, 88, 95]
    }
}
