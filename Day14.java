class Solution {
    public String simplifyPath(String path) {
      Stack<String> s = new Stack<>();
        for(String x : path.split("/")){
            if(x.equals("..")){
                if(!s.isEmpty())
                    s.pop(); //that means removing crecently added current(x) dur goiung to prev
            }else if(x.length() > 0 && !x.equals(".")){ //if some string is present and not curr(x) dir then add
                s.add(x);                               //to stack
            }
        }
        return "/" + String.join("/",s);
    }
}