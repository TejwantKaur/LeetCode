class Solution {
    public boolean isValid(String s) {
        if(s.length() %2 !=0) 
            return false;
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // opening bracket
            if(ch=='('||ch=='{'||ch=='[') 
                st.push(ch);
            else {
                    //closing bracket
                    if(st.isEmpty())
                        return false;
                    
                    if((st.peek() == '(' && ch == ')')
                    || (st.peek() == '{' && ch == '}')
                    || (st.peek() == '[' && ch == ']'))
                        st.pop();
                    else 
                        return false;
            }
        } 
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}