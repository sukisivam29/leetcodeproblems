class Solution {
    public int climbStairs(int n) {
        int start = 0;
        int next = 1;
        int sum = 0;
        for(int i = 0;i<n ;i++){
            sum = start + next;
            start = next;
            next = sum;
        }
        return sum;
    }
}