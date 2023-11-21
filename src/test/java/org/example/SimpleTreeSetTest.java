package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;


import java.util.Iterator;
import java.util.TreeSet;
public class SimpleTreeSetTest {

    @org.junit.Test
    public void add() {
        SimpleTreeSet<Integer> my_test = new SimpleTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();
        my_test.add(13);
        my_test.add(-3);
        my_test.add(45);
        my_test.add(1);
        my_test.add(-21);
        my_test.add(5);
        my_test.add(3);
        my_test.add(36);

        test.add(13);
        test.add(-3);
        test.add(45);
        test.add(1);
        test.add(-21);
        test.add(5);
        test.add(3);
        test.add(36);

        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete");
        Assertions.assertTrue(my_test.containsAll(test));
        System.out.println("Equals test successful complete ");
    }

    @org.junit.Test
    public void remove() {
        SimpleTreeSet<Integer> my_test = new SimpleTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        my_test.add(13);
        my_test.add(-3);
        my_test.add(45);
        my_test.add(1);
        my_test.add(-21);
        my_test.add(5);
        my_test.add(3);
        my_test.add(36);

        my_test.remove(1);

        test.add(13);
        test.add(-3);
        test.add(45);
        test.add(-21);
        test.add(5);
        test.add(3);
        test.add(36);
        Assertions.assertTrue(my_test.containsAll(test));
        System.out.println("Equals test successful complete ");
    }

    @org.junit.Test
    public void size() {
        SimpleTreeSet<Integer> my_test = new SimpleTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        my_test.add(13);
        my_test.add(-3);
        my_test.add(45);
        my_test.add(1);
        my_test.add(-21);
        my_test.add(5);
        my_test.add(3);
        my_test.add(36);

        my_test.remove(1);

        test.add(13);
        test.add(-3);
        test.add(45);
        test.add(-21);
        test.add(5);
        test.add(3);
        test.add(36);
        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete");

    }

    @org.junit.Test
    public void clear() {
        SimpleTreeSet<Integer> my_test = new SimpleTreeSet<>();

        my_test.add(13);
        my_test.add(-3);
        my_test.add(45);
        my_test.add(1);
        my_test.add(-21);
        my_test.add(5);
        my_test.add(3);
        my_test.add(36);
        my_test.clear();
        Assertions.assertEquals(my_test.get(), null);
        System.out.println("Equals test successful complete ");
    }

    @org.junit.Test
    public void first() {
        SimpleTreeSet<Integer> my_test = new SimpleTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();
        my_test.add(13);
        my_test.add(-3);
        my_test.add(45);
        my_test.add(1);
        my_test.add(-21);
        my_test.add(5);
        my_test.add(3);
        my_test.add(36);

        test.add(13);
        test.add(-3);
        test.add(45);
        test.add(1);
        test.add(-21);
        test.add(5);
        test.add(3);
        test.add(36);
        Assertions.assertEquals(my_test.first(), test.first());
        System.out.println("Equals test successful complete ");
    }

    @org.junit.Test
    public void last() {
        SimpleTreeSet<Integer> my_test = new SimpleTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();
        my_test.add(13);
        my_test.add(-3);
        my_test.add(45);
        my_test.add(1);
        my_test.add(-21);
        my_test.add(5);
        my_test.add(3);
        my_test.add(36);

        test.add(13);
        test.add(-3);
        test.add(45);
        test.add(1);
        test.add(-21);
        test.add(5);
        test.add(3);
        test.add(36);
        Assertions.assertEquals(my_test.last(), test.last());
        System.out.println("Equals test successful complete ");
    }

    @org.junit.Test
    public void contains() {
        SimpleTreeSet<Integer> my_test = new SimpleTreeSet<>();
        my_test.add(13);
        my_test.add(-3);
        my_test.add(45);
        assertTrue(my_test.contains(13));
        assertTrue(my_test.contains(-3));
        assertTrue(my_test.contains(45));
        System.out.println("Equals test successful complete ");
    }

    @org.junit.Test
    public void iterator() {
        SimpleTreeSet<Integer> mySet = new SimpleTreeSet<>();
        mySet.add(5);
        mySet.add(3);
        mySet.add(7);

        TreeSet<Integer> expectedSet = new TreeSet<>();
        expectedSet.add(5);
        expectedSet.add(3);
        expectedSet.add(7);

        Iterator<Integer> myIterator = mySet.iterator();
        Iterator<Integer> expectedIterator = expectedSet.iterator();

        while (myIterator.hasNext() && expectedIterator.hasNext()) {
            assertEquals(expectedIterator.next(), myIterator.next());
        }

        assertFalse(myIterator.hasNext());
        assertFalse(expectedIterator.hasNext());
        System.out.println("Equals test successful complete ");
    }
}