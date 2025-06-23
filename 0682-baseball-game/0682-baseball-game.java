class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(String str : operations){
            if(str.equals("C")){
                s.pop();
            }
            else if(str.equals("D")){
                s.push(2*s.peek());
            }
            else if(str.equals("+")){
                int l = s.pop();
                int sl = s.peek();
                s.push(l);
                s.push(l+sl);
            }
            else{
                s.push(Integer.parseInt(str));
            }
        }
        int sum = 0;
        for(int a : s){
            sum+=a;
        }
        return sum;
    }
}