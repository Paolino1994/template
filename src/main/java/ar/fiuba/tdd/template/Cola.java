package ar.fiuba.tdd.template;

public class Cola<T> {
    private Node<T> top;
    private Node<T> bottom;
    private Integer size;

    public Cola() {
        this.size = 0;
    }


    public boolean isEmpty() {
        return (top == null);
    }

    public int size() {
        return this.size;
    }

    public void add(T item) {
        Node<T> newNode = new Node<T>(item);
        try {
            this.bottom.setNext(newNode);//si esta vacia tira la excepcion
        } catch (Exception exception) {
            this.top = newNode;
        }
        this.bottom = newNode;
        this.size++;
    } // agregar un item

    public T top() {
        try {
            T itemToReturn = this.top.getItem();
            replaceNextItem();
            return itemToReturn;
        } catch (Exception exceptionE) {
            throw new AssertionError();
        }
    }  // retornar el primer item, lanzar    exception si esta vacío.

    public void remove() {
        try {
            replaceNextItem();
        } catch (Exception exceptionE) {
            throw new AssertionError();
        }
    } // remover el primer item,    lanzar exception si esta vacío.

    private void replaceNextItem() {
        this.top = this.top.getNext();
        this.size--;
    }
}
