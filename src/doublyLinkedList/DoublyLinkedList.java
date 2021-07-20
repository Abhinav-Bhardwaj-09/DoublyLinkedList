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
    private int length;


    public void insertAtStart (int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
        }
        else {
            newNode.setNextNode(head);
            head = newNode;
            length++;
        }
    }




}
