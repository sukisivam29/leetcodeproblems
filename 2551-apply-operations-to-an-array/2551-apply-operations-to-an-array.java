class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1] && nums[i]!=0){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int count=0;
        int res[] = new int[n];
        int index = 0;
        for(int i : nums){
            if(i!=0){
                res[index++] = i;
            }
        }
        return res;
    }
}