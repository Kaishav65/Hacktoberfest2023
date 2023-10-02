package gfg_practice.arrays.easy;

import java.util.ArrayList;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        System.out.println(subArraySum(arr, 42, 468).toString());
    }

    static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {
        ArrayList<Integer> a = new ArrayList<>();
        int l = 0, r = 0;
        int sum = arr[0];
        if (s == 0) {
            a.add(-1);
            return a;
        }
        boolean isFound = false;
        while (r < n) {
            if (sum == s) {
                isFound = true;
                break;
            } else if (sum < s) {
                r++;
                if (r < n) sum += arr[r];
            } else {
                sum -= arr[l];
                l++;
            }
        }
        if (isFound) {
            a.add(l + 1);
            a.add(r + 1);
            return a;
        }

        a.add(-1);
        return a;
    }
}
