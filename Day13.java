class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
         boolean isBalanced=false;
         for(int i=0;i<s.length();i++) {
             char c=s.charAt(i);
              if(c=='('||c=='{'||c=='[') {
                  stack.push(c);
                  continue;
              }
             if(stack.isEmpty())
                return false;
             if(c==')')
             {
                 if(stack.peek()=='(')
                 {
                     isBalanced=true;
                     stack.pop();
                 }
                 else { 
                     isBalanced=false;
                 break;
             }} 
             if(c=='}')
             {
                 if(stack.peek()=='{')
                 {
                     isBalanced=true;
                     stack.pop(); 
                 }
                 else { 
                     isBalanced=false;
                 break;
             }} 
             if(c==']')
             {
                 if(stack.peek()=='[')
                 {
                     isBalanced=true;
                     stack.pop();
                 }
                 else {
                     isBalanced=false;
                 break;
             }}}
        if(!stack.isEmpty())
            isBalanced=false;
              // return (stack.isEmpty());
             if(isBalanced)
                 return true;
             else
                 return false;
    }
}