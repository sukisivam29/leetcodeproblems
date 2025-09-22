class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int n : nums){
            if(n<0){
                list1.add(n);
            }
            else{
                list2.add(n);
            }
        }
        int res[] = new int[nums.length];
        int index = 0;
        for(int i=0;i<list1.size();i++){
            res[index++] = list2.get(i);
            res[index++] = list1.get(i);
        }
        return res;
    }
}