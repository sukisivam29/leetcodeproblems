class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        while(num > 0) {
            while(num >= 1000) {
                num-=1000;
                ans.append("M");
            }
            if(num >= 900) {
                num-=900;
                ans.append("CM");
            }
            if(num >= 500) {
                num -= 500;
                ans.append("D");
            }
            if(num >= 400) {
                num -= 400;
                ans.append("CD");
            }
            while(num >= 100) {
                num -= 100;
                ans.append("C");
            }
            if(num >= 90) {
                num -= 90;
                ans.append("XC");
            }
            if(num >= 50) {
                num -= 50;
                ans.append("L");
            }
            if(num >= 40) {
                num -= 40;
                ans.append("XL");
            }
            while(num >= 10) {
                ans.append("X");
                num -= 10;
            }
            if(num == 9) {
                ans.append("IX");
                num -= 9;
            }
            if(num >= 5) {
                ans.append("V");
                num -= 5;
            }
            if(num == 4) {
                ans.append("IV");
                num -= 4;
            }
            while(num > 0) {
                num -= 1;
                ans.append("I");
            }

        }
        return ans.toString();
    }
}