
import java.util.*;
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList
{
    Node head;
    Node insertMid(Node head,int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            return temp;
        }
        Node slo=head,fas=head.next;
        while(fas!=null&&fas.next!=null)
        {
            slo=slo.next;
            fas=fas.next.next;
        }
        temp.next=slo.next;
        slo.next=temp;
        return head;
    }
    void append(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newnode;
        }
    }
    void printlis()
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
        int k=sc.nextInt();
        l1.head=l1.insertMid(l1.head,k);
        l1.printlis();
        
    }
}
