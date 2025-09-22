class Solution {
    public boolean isValid(String s) {
        if(s.length() %2 !=0) return false;

        Stack<Character> st = new Stack<>();
        for (char ch: s.toCharArray()){

            // opening bracket
            if(ch=='('||ch=='{'||ch=='[') 
                st.push(ch);
            else {
                    //closing bracket
                    if(st.isEmpty())
                        return false;
                    
                    char top = st.pop();
                    if((top == '(' && ch != ')')
                    || (top == '{' && ch != '}')
                    || (top == '[' && ch != ']')) 
                        return false;
            }
        } 
        return st.isEmpty(); // stack will be empty if ...
    }
}