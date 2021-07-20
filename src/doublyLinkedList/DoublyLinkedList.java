package doublyLinkedList;

import node.Node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 20-07-2021
 * Time: 08:55
 */

public class DoublyLinkedList {
    private Node head, tail;
    private int length = 0;



    // To insert before head
    public void insertAtStart (int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNextNode(head);
            head.setPreviousNode(newNode);
            head = newNode;
        }
        length++;
    }



    // To insert after tail
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
        }
        length++;
    }



    // To check whether LinkedList is empty or not
    public boolean isEmpty () {
        return length == 0;
    }



    // To print from head towards tail
    public void displayH2T () {
        if(isEmpty()) {
            System.out.println("Your Doubly LinkedList is empty...");
            return;
        }

        Node current = head;
        while(current != null) {

            System.out.print(current.getData());

            if(current.getNextNode() != null) {
                System.out.print(" --> ");
            }
            else {
                System.out.println();
            }
            current = current.getNextNode();
        }
    }




    // To print from tail towards head
    public void displayT2H () {
        if(isEmpty()) {
            System.out.println("Your Doubly LinkedList is empty...");
            return;
        }

        Node current = tail;
        while(current != null) {
            System.out.print(current.getData());

            if(current.getPreviousNode() != null) {
                System.out.print(" <-- ");
            }
            else {
                System.out.println();
            }
            current = current.getPreviousNode();
        }
    }









}
