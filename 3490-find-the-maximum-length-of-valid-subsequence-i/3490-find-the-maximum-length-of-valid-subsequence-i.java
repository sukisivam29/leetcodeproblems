class Solution {
    public int maximumLength(int[] nums) {
        int EvenCount = 0;
        int OddCount = 0;
        for(int i : nums){
            if(i%2==0){
                EvenCount++;
            }
            else{
                OddCount++;
            }
        }
        int even = 0;
        int odd = 0;
        for(int i : nums){
            if(i%2==0){
                even = Math.max(even, odd+1);
            }
            else{
                odd = Math.max(even+1, odd);
            }
        }
        return Math.max(Math.max(EvenCount, OddCount), Math.max(even, odd));
    }
}