import java.util.Arrays;

public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int t = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break; // already sorted
        }
    }

    public static void main(String[] args) {
        int[] marks = {70, 50, 90, 60};
        bubbleSort(marks);
        System.out.println(Arrays.toString(marks)); // [50, 60, 70, 90]
    }
}
