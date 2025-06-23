class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            String s = "";
            s=nums[i];
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    s+=nums[j];
                    if(s.equals(target)){
                        count++;
                    }
                }
                s=nums[i];
            }
        }
        return count;
    }
}