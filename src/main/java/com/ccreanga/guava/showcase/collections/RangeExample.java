package com.ccreanga.guava.showcase.collections;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import com.google.common.primitives.Ints;

import java.util.Set;

public class RangeExample {

    public static void main(String[] args) {
        Range<Integer> range = Range.closed(0, 9);

        System.out.println(range);
        System.out.print("[0,9] : ");

        System.out.println("5 is present: " + range.contains(5));
        System.out.println("(1,2,3) is present: " + range.containsAll(Ints.asList(1, 2, 3)));
        System.out.println("Lower Bound: " + range.lowerEndpoint());
        System.out.println("Upper Bound: " + range.upperEndpoint());

        range = Range.openClosed(0, 9);
        System.out.println(range);
        range = Range.closedOpen(0, 9);
        System.out.println(range);

    }
}
