port java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head;
    void append(int data)
    {
        Node nenode=new Node(data);
        if(head==null)
        {
            head=nenode;
        }
        else
        {
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=nenode;
        }
    }
    public static Node pairwise_swap(Node node)
    {
        // your code here
        Node curr=node;
        while(curr!=null&&curr.next!=null)
        {
            int temp=curr.data;
            curr.data=curr.next.data;
            curr.next.data=temp;
            curr=curr.next.next;
        }
        return node;
    }
    void printli()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList l1=new LinkedList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            l1.append(data);
        }
       
        
        l1.head=pairwise_swap(l1.head);
        l1.printli();
        
    }
}
