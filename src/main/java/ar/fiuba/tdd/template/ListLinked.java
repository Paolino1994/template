package ar.fiuba.tdd.template;


public class ListLinked<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public ListLinked() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public void addLast(T item) {
        Node<T> newNode = new Node<T>(item);
        try {
            this.last.setNext(newNode);
        } catch (Exception e) {
            this.first = newNode;
        }
        this.last = newNode;
        this.size++;
    }

    public T returnFirst() {
        try {
            return this.first.getItem();
        } catch (Exception e) {
            throw new AssertionError();
        }
    }

    public void removeFirstItem() {
        try {
            this.first = this.first.getNext();
            this.size--;
        } catch (Exception e) {
            this.first = null;
            this.last = null;
            this.size = 0;//cubro el caso que este vacio
            throw new AssertionError();
        }

    }

    public int getSize() {
        return this.size;
    }

}
