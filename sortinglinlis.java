class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head==null||head.next==null)
        {
            return head;
        }
        Node curr=head;
        Node one=new Node(0);
        Node two=new Node(1);
        Node thr=new Node(2);
        Node zero=one,won=two,too=thr;
        while(curr!=null)
        {
            if(curr.data==0)
            {
                zero.next=curr;
                zero=zero.next;
            }
            else if(curr.data==1)
            {
                won.next=curr;
                won=won.next;
            }
            else
            {
                too.next=curr;
                too=too.next;
            }
            curr=curr.next;
        }
        zero.next=(two.next!=null)?two.next:thr.next;
        won.next=thr.next;
        too.next=null;
        head=one.next;
        return head;
    }
}


