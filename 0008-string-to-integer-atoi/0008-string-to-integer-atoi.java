class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        if (str.isEmpty()) return 0;
        
        char arr[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        int i = 0, sign = 1;
        
        // Handle sign (+ or -)
        if (arr[i] == '-' || arr[i] == '+') {
            sign = (arr[i] == '-') ? -1 : 1;
            i++;
        }

        // Extract numerical digits
        while (i < arr.length && arr[i] >= '0' && arr[i] <= '9') {
            sb.append(arr[i]);
            i++;
        }

        // If no valid number was found, return 0
        if (sb.length() == 0) return 0;

        String s1 = sb.toString();
        
        // Handle number parsing with overflow check
        try {
            int res = Integer.parseInt(s1);
            return res * sign;
        } catch (NumberFormatException e) {
            // If number exceeds Integer range, return INT_MAX or INT_MIN
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}
