class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch==')'){
                if(st.isEmpty() || ch=='(') st.push(i);
                else if(ch==')' && s.charAt(st.peek())=='(') st.pop();
                else st.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(st.isEmpty()) sb.append(ch);
            else if(ch=='(' || ch==')'){
                if(i==st.peek()) st.pop();
                else sb.append(ch);
            }else sb.append(ch);
        }
        sb.reverse();
        return sb.toString();
    }
}