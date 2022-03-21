class Solution {
    public List<Integer> partitionLabels(String s1) {
         List<Integer> l1 = new ArrayList<>();
     int []arr = new int[26];
     for(int i =0;i<s1.length();i++)
     {
         arr[s1.charAt(i)-'a'] = i;
     }
      int start = 0;
     int end = 0;
     for(int i =0;i<s1.length();i++)
     {
         end = Math.max(end, arr[s1.charAt(i)-'a']);
         if(i==end) {
             l1.add(i-start+1);
             start = i+1;
         }
     }
 return l1;
    }
        
    
}