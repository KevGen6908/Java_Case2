package org.example;

import java.util.TreeSet;

public interface Tree<E> extends Iterable{
    boolean add(E e);
    MyList<E> get();
    int size();
    boolean contains(E e);
    boolean remove(E e);
    void clear();
    E first();
    E last();
    boolean containsAll(TreeSet<E> e); // for unit test
}
