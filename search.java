import java.util.*;
import java.util.Scanner;
import java.lang.Math;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=next;
    }
}
class LinkedList {
    Node head;

   
   
    public boolean search(int target)
    {
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data==target)
            {
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
}

class Main
{
    public static void main(String args[])
    {
        LinkedList l1=new LinkedList();
        l1.head=new Node(1);
        l1.head.next=new Node(2);
        l1.head.next.next=new Node(3);
        int tar=3;
        if(l1.search(tar))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}
