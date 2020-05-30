import java.util.Arrays;

public class FindingClosetSumPair {

    public static void main(String[] args) {

    }

    public static int[] getClosetPair(int[] arr1, int[] arr2, int sum) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = arr1.length - 1;
        int smallestDiff = Math.abs(arr1[0] + arr2[0] - sum);
        int[] resArr = {arr1[0], arr2[0]};
        while (i < arr1.length && j >= 0) {
            int n1 = arr1[i];
            int n2 = arr2[j];
            int curr_diff = n1 + n2 - sum;
            if (Math.abs(curr_diff) < smallestDiff) {
                smallestDiff = Math.abs(curr_diff);
                resArr[0] = n1;
                resArr[1] = n2;
            }
            if (curr_diff == 0) {
                return resArr;
            } else if (curr_diff < 0) {
                i = i + 1;
            } else {
                j = j - 1;
            }
        }

        return resArr;

    }
}
