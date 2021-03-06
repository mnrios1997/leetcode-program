public class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;
        for (int i = 0; i <= nums.length; ++i) {
            if (i > maxIdx) return false;
            maxIdx = Math.max(i + nums[i], maxIdx);
            if (maxIdx >= nums.length - 1) return true;
        }

        return false;
    }
}
