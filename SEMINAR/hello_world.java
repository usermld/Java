package SEMINAR;

public class hello_world {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 1, 1, 1, 1, 0, 9 };

        int max = getRebeatOnce(arr);
        System.out.println(max);
    }

    private static int getRebeatOnce(int[] arr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = max < count ? count : max;
                //max = Math.max(count, max);
                // if (max < count) {
                // max = count;
                // }
            } else {
                count = 0;
            }

        }
        return max;
    }
}
