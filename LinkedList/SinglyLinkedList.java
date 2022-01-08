class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class SinglyLinkedList {

    /* LinkedList are nodes where each node contains a data field and a reference to the next node.
    Each LinkedList has a head node that stores the information about the first Node which is connected to subsequent nodes 
    
    A LinkedList is represented in the following manner

    (head) [Data|Reference] --> [Data|Reference] --> ...... --> [Data|Reference=null](tail) */

    Node headNode;

    public void push(int val) {
        /* This function pushes the given number to the first position in the linked list, making it the head element */
        Node temp = new Node(val);
        temp.next = headNode;
        headNode = temp;
    }
    
    public void print() {
        /* Algorithm:
        1. Store headNode in a temp variable
        2. Traverse temp node till temp.next is null
        3. Print the values encountered temp.data value for every traversal */

        Node temp = headNode;

        while(temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void append(int val) {
        /* Adds a node to the tail
        
        Algorithm:
        1. Store the head node in a temp variable
        2. Create a new node for the data given
        3. Check if head node is null, if yes just make the head node the new node, return
        4. Otherwise iterate till temp variable is the last node
        5. Set the next node for the temp variable as the new node */

        Node temp = headNode;
        Node newNode = new Node(val);

        if (headNode == null) {
            headNode = newNode;
            return;
        }

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    public void addAfter(Node previous, int val) {
    }

    public static void main(String[] args) {

    }
}