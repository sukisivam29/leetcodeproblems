class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m= new HashMap<>();
        for(int i:nums)
            m.put(i,m.getOrDefault(i,0)+1);
            for(Map.Entry<Integer,Integer> e:m.entrySet()){
                if(e.getValue()>nums.length/2)
                return e.getKey();
            }
        return -1;
    }
}