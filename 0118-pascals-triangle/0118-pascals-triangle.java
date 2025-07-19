class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> l = new LinkedList<>();
            if(i==1){
                l.add(1);
            }
            if(i==2){
                l.add(1);
                l.add(1);
            }
            if(i>2){
                l.add(1);
                for(int j=1;j<=i-2;j++){
                    l.add(list.get(i-2).get(j-1)+list.get(i-2).get(j));
                }
                l.add(1);
            }
            list.add(l);
        }
        return list;
    }
}