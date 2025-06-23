class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){return false;}
                else{
                    char t = st.peek();
                    if((s.charAt(i)==')'&&t=='(')||(s.charAt(i)=='}'&&t=='{')||(s.charAt(i)==']'&&t=='[')){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}