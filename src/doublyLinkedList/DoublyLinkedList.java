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


    public void insertAtStart (int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
        }
        else {
            newNode.setNextNode(head);
            head.setPreviousNode(newNode);
            head = newNode;
            length++;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
        }
        else {
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
            length++;
        }

    }


    public boolean isEmpty () {
        return length == 0;
    }








}
