class Solution {
    public int heightChecker(int[] heights) {
         int e[]=heights.clone();
        Arrays.sort(e);
        int c=0;
        for(int i=0;i<heights.length;i++){
                if(heights[i]!=e[i])
                c++;
        }
        return c;
    }
}