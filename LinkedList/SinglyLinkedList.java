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
    
    public void printLinkedList() {
        /* 
        
        1. Store headNode in a temp variable
        2. Traverse temp node till temp.next is null
        3. Print the values encountered temp.data value for every traversal 

        */

        Node temp = headNode;

        while(temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

    }
}