class Solution {
    public int search(int[] nums, int t) {
        int p=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t)
            p=i;
        }
        return p;
    }
}