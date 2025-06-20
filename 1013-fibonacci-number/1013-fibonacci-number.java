class Solution {
    public int fib(int n) {
        if(n==0)
        return 0;
        if(n==1||n==2)
        return 1;
        int a=1,b=1,sum=0;
        while(n>2){
            sum=a+b;
            b=a;
            a=sum;
            n--;

        }
        return a;
    }
}