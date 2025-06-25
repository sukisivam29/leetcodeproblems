class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low;i<=high;i++){
            if(sym(Integer.toString(i))==true){
                count++;
            }
        }
       return count;
    }
    public boolean sym(String n){
        if(n.length()%2==0){
            int l = n.length()/2;
            int sum1 = 0; int sum2=0;
            for(int i=0;i<l;i++)
                sum1+=Integer.parseInt(n.charAt(i)+"");
            for(int i=l;i<n.length();i++){
                sum2+=Integer.parseInt(n.charAt(i)+"");
            }
            if(sum1==sum2){
                return true;
            }
        }
        return false;
    }

}