class FreqStack {
    
    Map<Integer,Stack<Integer>> st;
    Map<Integer,Integer> map;
    int max = 0;

    public FreqStack() {
        st = new HashMap<>();
        map = new HashMap<>();
    }
    
    public void push(int val) {
        if(map.containsKey(val)) map.put(val,map.get(val)+1);
        else map.put(val,1);
        int freq = map.get(val);
        max = Math.max(max,freq);
        if(!st.containsKey(freq)) st.put(freq,new Stack<>());
        st.get(freq).push(val);
    }
    
    public int pop() {
        int ans = st.get(max).pop();
        if(st.get(max).size()==0){
            st.remove(max);
            max--;
        }
        map.put(ans,map.get(ans)-1);
        return ans;
    }
}