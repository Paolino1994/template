package ar.fiuba.tdd.template;


public class Node<X> {
    private X item;
    private Node next;

    public Node(X data) {
        item = data;
    }

    public X getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }
}
