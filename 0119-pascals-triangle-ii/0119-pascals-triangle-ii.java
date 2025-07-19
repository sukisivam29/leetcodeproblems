class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new LinkedList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> l = new LinkedList<>();
            
            if (i == 0) {
                l.add(1);
            } else if (i == 1) {
                l.add(1);
                l.add(1);
            } else {
                l.add(1);
                for (int j = 1; j < i; j++) {
                    int sum = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    l.add(sum);
                }
                l.add(1);
            }

            list.add(l);
        }

        return list.get(rowIndex);
    }
}
