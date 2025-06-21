class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.sort(nums);
        int e=0,o=1;
       for(int n :nums){
if(n%2==0){
arr[e]=n;
e+=2;
}
else
{
    arr[o]=n;
    o+=2;
}
        }
        return arr;
    }
}