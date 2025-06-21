class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer>e=new ArrayList<>();
        for(int i:nums){
            if(i%2==0)
            e.add(i);
        }
         List<Integer>o=new ArrayList<>();
        for(int i:nums){
            if(i%2==1)
            o.add(i);
        }
        e.addAll(o);
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        arr[i]=e.get(i);
        return arr;
    }
}