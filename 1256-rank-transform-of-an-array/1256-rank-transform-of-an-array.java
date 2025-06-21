class Solution {
    public int[] arrayRankTransform(int[] arr) {
          int[] s = arr.clone();
        Arrays.sort(s);
        
        Map<Integer, Integer> r = new HashMap<>();
        int rank = 1;
        
        for (int num : s) {
            if (!r.containsKey(num))
                r.put(num, rank++);
        }
        
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = r.get(arr[i]);
        }
        
        return res;
    }
}