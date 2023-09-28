 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node
{
  int data;
  Node next;
  public Node(int data)
  {
     this.data=data;
     this.next=null;
  }
}
class Solution {
  public static Node reverseLinked(Node head)
  {
    Node pre=null;
    Node curr=head;
    Node next=null;
    while(curr!=null)
    {
      next=curr.next;
      curr.next=pre;
      pre=curr;
      curr=next;
    }
    return pre;
  }
  public static void printLinkedList(Node head)
  {
    Node curr=head;
    while(curr!=null)
    {
      System.out.print(curr.data+" ");
      curr=curr.next;
    }
  }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node curr=null;
        Node head=null;
        for(int i=0;i<n;i++)
        {
          int val=sc.nextInt();
          if(head==null)
          {
            head=new Node(val);
            curr=head;
          }
          else
          {
            curr.next=new Node(val);
            curr=curr.next;
          }
        }
        head=reverseLinked(head);
        printLinkedList(head);


    }
}
