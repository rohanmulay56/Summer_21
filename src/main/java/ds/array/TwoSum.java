package ds.array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40};
        new TwoSum().twoSum(myNum, 6);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(Math.abs(target - nums[i])) != null) {
                ans[0] = i;
                ans[1] = map.get(Math.abs(target - nums[i]));
                return ans;
            }
            map.put(nums[i], i);
        }
        return new int[1];
    }
}
