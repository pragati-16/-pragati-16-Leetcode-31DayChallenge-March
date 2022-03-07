class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
      ListNode head=null;
        ListNode tail=null;
        while(list1!=null&&list2!=null) {
        if(list1.val<=list2.val) {
            if(head==null&&tail==null) {
                head=new ListNode(list1.val);
                tail=head;
            }
            else {
                tail.next=new ListNode(list1.val);
                tail=tail.next;
            }
            list1=list1.next;
        }
            else {
              if(head==null&&tail==null) {
                head=new ListNode(list2.val);
                tail=head;
            }
            else {
                tail.next=new ListNode(list2.val);
                tail=tail.next;
            }
                list2=list2.next;
        }
    }
        while(list1!=null) {
            tail.next=new ListNode(list1.val);
            tail=tail.next;
            list1=list1.next;
        }
         while(list2!=null) {
            tail.next=new ListNode(list2.val);
            tail=tail.next;
             list2=list2.next;
        }
        return head;
    }
}