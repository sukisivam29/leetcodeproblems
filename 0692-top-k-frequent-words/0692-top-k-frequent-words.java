class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         Map<String,Integer> m= new HashMap<>();
        for(String s:words)
            m.put(s,m.getOrDefault(s,0)+1);
        List<String> l = new ArrayList<>(m.keySet());
        l.sort((a,b)->{
            int f= m.get(b)-m.get(a);
            if(f==0)
            return a.compareTo(b);
            return f;});
return l.subList(0,k);
    }
}