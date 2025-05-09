class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int presum = 0, cnt = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);  

        for (int i = 0; i < n; i++) {
            presum += nums[i];
            int rem = presum - k;
            cnt += mpp.getOrDefault(rem, 0);
            mpp.put(presum, mpp.getOrDefault(presum, 0) + 1);
        }

        return cnt;
    }
}
