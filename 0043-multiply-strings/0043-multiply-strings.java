import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger s=new BigInteger(num1);
        BigInteger h=new BigInteger(num2);
        BigInteger v= s.multiply(h);
        String r="";
        r+=v;
        return r;
    }
}