class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Set<Integer> ans = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i < nums1.length;i++){
            l1.add(nums1[i]);
        }
        for(int i = 0;i < nums2.length;i++){
            l2.add(nums2[i]);
        }
        for(int i = 0; i < nums2.length;i++){
            if(l1.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        for(int i = 0;i < nums3.length;i++){
            if(l1.contains(nums3[i])){
                ans.add(nums3[i]);
            }
        }
        for(int i = 0;i < nums3.length;i++){
            if(l2.contains(nums3[i])){
                ans.add(nums3[i]);
            }
        }
        for(int i : ans){
            res.add(i);
        }
        return res;
    }
}