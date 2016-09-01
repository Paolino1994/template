package ar.fiuba.tdd.template;

public class Cola<T> implements Queue<T> {
    private ListLinked<T> list;

    public Cola() {
        list = new ListLinked<T>();
    }


    public boolean isEmpty() {
        return (list.isEmpty());
    }

    public int size() {
        return list.getSize();
    }

    public void add(T item) {
        list.addLast(item);
    }

    public T top() {
        return list.returnFirst();
    }

    public void remove() {
        list.removeFirstItem();
    }

}
