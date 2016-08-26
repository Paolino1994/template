package ar.fiuba.tdd.template;


public class Node<T> {
    private T item;
    private Node next;

    public Node(T data){
        item=data;
    }

    public T getItem() {
        return item;
    }

    public void setNext(Node nextNode){

        this.next=nextNode;
    }

    public Node getNext() {
        return next;
    }
}
