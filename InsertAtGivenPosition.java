public class InsertAtGivenPosition {

    // A node in a singly linked list
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Inserts a new node at the given position in the linked list
    public static Node insertAtGivenPosition(Node head, int data, int position) {
        // Create a new node
        Node newNode = new Node(data);

        // If the list is empty or we want to insert at position 0, make the new node the head
        if (head == null || position == 0) {
            newNode.next = head;
            return newNode;
        }

        // Traverse the list up to the given position
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        // Insert the new node after the current node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    // Prints the linked list
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a linked list
        Node head = null;
        head = insertAtGivenPosition(head, 1, 0);
        head = insertAtGivenPosition(head, 2, 1);
        head = insertAtGivenPosition(head, 3, 2);

        // Print the linked list
        printLinkedList(head);
    }
}
