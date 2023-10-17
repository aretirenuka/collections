import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    Node insMid(Node head, int key) {
        Node temp = new Node(key);
        if (head == null) {
            return temp;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = slow.next;
        slow.next = temp;

        return head;
    }

    void append(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
        }
    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList(); // Create an instance of LinkedList

        for (int i = 0; i < n; i++) {
            int dt = sc.nextInt();
            l1.append(dt); // Append data to the linked list
        }

        int key = sc.nextInt();
        l1.head = l1.insMid(l1.head, key); // Insert key in the middle of the linked list
        l1.printList(); // Print the updated linked list
    }
}
