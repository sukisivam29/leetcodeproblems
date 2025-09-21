class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int len = l1+l2;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i=0;i<len;i++){
            if(i<l1){
                sb.append(word1.charAt(index));
            }
            if(i<l2){
                sb.append(word2.charAt(index));
            }
            index++;
        }
        return sb.toString();
    }
}