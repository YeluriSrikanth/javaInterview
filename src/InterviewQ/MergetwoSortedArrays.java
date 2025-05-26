package InterviewQ;

import java.util.Arrays;

public class MergetwoSortedArrays {
    public static void main(String[] args) {

        int nums1[] = {1, 2, 2, 0, 0, 0, 0};
        int nums2[] = {3, 5, 7, 9};
        int m = 3, n = 4;

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0 && i>=0) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                k--;
                j--;

            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;

            } else {
                nums1[k]=nums1[i];
                i--;
                k--;
            }

        }
        System.out.println(Arrays.toString(nums1));

    }
}
