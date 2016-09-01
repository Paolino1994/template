package ar.fiuba.tdd.template;


public class Node<T> {
    private T item;
    private Node<T> next;

    public Node(T data) {
        this.item = data;
    }

    public T getItem() {
        return this.item;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> nextNode) {
        this.next = nextNode;
    }
    public void deleteNext() {
        this.next = null;
    }
}
