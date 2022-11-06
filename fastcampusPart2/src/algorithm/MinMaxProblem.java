package algorithm;

public class MinMaxProblem {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int max = 0, min = 1000;
        int maxPos = 0, minPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPos = i + 1;
            }
            if (arr[i] < min) {
                min = arr[i];
                minPos = i + 1;
            }
        }

        System.out.println("max = " + max + "," + maxPos + "번째"
                        + ", 그리고 min = " + min + "," + minPos + "번째");
    }
}
