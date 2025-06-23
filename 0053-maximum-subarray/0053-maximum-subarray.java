class Solution {
    public int maxSubArray(int[] nums) {
        int maxsub = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum=sum+nums[i];
            maxsub=Math.max(maxsub,sum);
        }
        return maxsub;
    }
}