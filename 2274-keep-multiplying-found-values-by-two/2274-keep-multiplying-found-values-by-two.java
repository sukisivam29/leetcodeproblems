class Solution {
    public int findFinalValue(int[] n, int o) {
        Set<Integer>h= new HashSet<>();
        for(int i:n)
        h.add(i);
        while(h.contains(o))
        o*=2;
        return o;
    }
}