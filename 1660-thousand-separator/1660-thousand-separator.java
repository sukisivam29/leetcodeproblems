class Solution {
    public String thousandSeparator(int n) {
        if(n<1000){
            return Integer.toString(n);
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(n>0){
            int temp = n%10;
            count++;
            sb.append(temp);
            n=n/10;
            if(n>0&&count%3==0){
                sb.append(".");
            }
        }
        return sb.reverse().toString();
    }
}