package com.ccreanga.guava.showcase;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Worthy to mention:
 * - no null values!
 * -'smart' copy vs wrapping methods; structures optimized for readonly access;
 * order is preserved from construction time
 * - there is an immutable correspondent for each regular collection
 */
public class ImmutableExample {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();
        elements.add(2);
        elements.add(4);
        elements.add(5);
        elements.add(6);

        List immutable = Collections.unmodifiableList(elements);
        System.out.println(immutable);
        elements.remove(0);

        System.out.println(immutable);
        immutable.add(33);

        ImmutableList immutable2 = ImmutableList.copyOf(elements);
        System.out.println(immutable2);
        elements.remove(0);
        System.out.println(immutable2);

        //ImmutableList list = new I
    }

}
