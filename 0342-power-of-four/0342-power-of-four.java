class Solution {
    public boolean isPowerOfFour(int n) {
         if (n <= 0) return false;
        double logResult = Math.log10(n) / Math.log10(4);
        return logResult == (int) logResult;
    }
}