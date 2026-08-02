class Solution {
    public int maxSubArray(int[] nums) {
       int cSum=0;
       int mSum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++) {
          int sum = cSum+nums[i];
          if(sum<nums[i]) {
            cSum=nums[i];

          }
          else {
            cSum=sum;
          }
          if(mSum<cSum) {
            mSum=cSum;
          }
       } 
       return mSum;
    }
}