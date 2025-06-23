class Solution {
    public int reverse(int x) {
        int ans ;
        String s = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(s).reverse();
        try{
            ans = Integer.parseInt(sb.toString());
        }
        catch(NumberFormatException e){
            return 0;
        }
        if(x>0){
            ans = rev(x);
        }
        else if(x==0){
            ans = 0;
        }
        else{
            ans = rev(x*-1)*-1;
        }
        return ans;
    }
    public static int rev(int n){
        int m = n;
        int p = 0;
        while(m>0){
            int rem = m % 10;
            p = p * 10 +rem;
            m = m / 10;
        }
        return p;
    }
}