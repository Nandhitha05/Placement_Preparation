class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int tot=0;
        for(int num: nums){
            tot+=num;
        }
        int lsum=0,rsum=tot;
        for(int i=0; i<n; i++){
            rsum-=nums[i];
            if(lsum==rsum){ return i; }
            lsum+=nums[i];
        }
        return -1;
    }
}
