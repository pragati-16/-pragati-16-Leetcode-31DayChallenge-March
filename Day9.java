class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        while(head!=null) {
        map.put(head.val,map.getOrDefault(head.val,0)+1);
            head=head.next;
        }
        ListNode tail=null;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1) {
         if(head==null&&tail==null) {
          head=new ListNode(entry.getKey());
        tail=head;
         }
            else 
            {
          tail.next=new ListNode(entry.getKey());
        tail=tail.next;
            }
        } }
        return head;
    }
}