package node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 20-07-2021
 * Time: 01:20
 */

public class Node {
    int data;
    Node previousNode;
    Node nextNode;

    public Node(int data) {
        this.data = data;
        this.previousNode = null;
        this.nextNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
