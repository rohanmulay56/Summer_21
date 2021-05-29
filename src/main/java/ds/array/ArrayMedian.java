package ds.array;

public class ArrayMedian {
    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        double medianSortedArrays = new ArrayMedian().findMedianSortedArrays(num1, num2);
        System.out.println(medianSortedArrays);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ansLength = nums1.length + nums2.length;
        int[] ans = new int[ansLength];
        int p1 = 0, p2 = 0;
        for (int i = 0; i < ansLength; i++) {
            if (p2 >= nums2.length || (p1 < nums1.length && nums1[p1] < nums2[p2])) {
                ans[i] = nums1[p1];
                p1++;
            } else {
                ans[i] = nums2[p2];
                p2++;
            }
        }
        if (ansLength % 2 == 0) {
            return (ans[ansLength / 2] + ans[ansLength / 2 - 1]) / (double) 2;
        } else {
            return ans[ansLength / 2];
        }
    }

    private void printArray(int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            System.out.printf("," + ans[i]);
        }
    }
}
