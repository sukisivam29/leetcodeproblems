class Solution {
    public int lengthOfLastWord(String s) {
        int n = 0;
        String se[] = s.trim().split(" ");
        n = se[se.length - 1].length();
        return n;
    }
}
