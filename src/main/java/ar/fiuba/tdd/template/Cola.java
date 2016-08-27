package ar.fiuba.tdd.template;

public class Cola<T> /*implements Queue2<T> */ {
    private Node top;
    private Node bottom;
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
        Node newNode = new Node<>(item);
        try {
            this.bottom.setNext(newNode);
            this.bottom = newNode;
        } catch (Exception excepcion) {
            this.top = newNode;
            this.bottom = newNode;
        }
        size++;
    } // agregar un item

    public T top() throws Exception {
        try {
            T itemToReturn = (T) this.top.getItem();//Esto no se porque no anda, si el tipo de dato que devuelve es el mismo!!!
            this.top = this.top.getNext();
            this.size--;
            return itemToReturn;
        } catch (Exception exception) {
            throw new Exception();
        }
    }  // retornar el primer item, lanzar    exception si esta vacío.

    public void remove() throws Exception {
        try {
            this.top = this.top.getNext();
        } catch (Exception excepcion) {
            this.top = null;
            throw new Exception();
        }
        this.size--;
    } // remover el primer item,    lanzar exception si esta vacío.
}
