class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if (Character.isLetterOrDigit(s1.charAt(i))) {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}