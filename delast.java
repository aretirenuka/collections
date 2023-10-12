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

    public void delN() {
        if (head == null || head.next == null) {
            // If the list is empty or contains only one node, there's nothing to delete
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
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
        l1.delN();
        l1.display();
        
    }
}
