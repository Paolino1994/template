package ar.fiuba.tdd.template;

interface Queue<T> {
    boolean isEmpty();

    int size();

    void add(T item); // agregar un item

    T top(); // retornar el primer item, lanzar    exception si esta vacío.

    void remove(); // remover el primer item,    lanzar exception si esta vacío.
}