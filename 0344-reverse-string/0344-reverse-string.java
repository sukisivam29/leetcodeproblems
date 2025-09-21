class Solution {
    public void reverseString(char[] s) {
        int right = s.length-1;
        int left = 0;
        while(left<right){
            char t = s[left];
            s[left] = s[right];
            s[right] = t;
            left++;
            right--;
        }
        return;
    }
}