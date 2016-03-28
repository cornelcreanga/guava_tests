package com.ccreanga.guava.showcase.collections;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtils {


    public static void main(String[] args) {
        List list1 = Arrays.asList("B","A","C");
        List list2 = Arrays.asList("B","D");

        Iterable iterable = Iterables.concat(list1,list2);


        Set<String> set1 = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
        Set<String> set2 = ImmutableSet.of("two", "three", "five", "seven");
        System.out.println(Sets.intersection(set1, set2));
        System.out.println(Sets.cartesianProduct(set1, set2));
        System.out.println(Sets.difference(set1, set2));


        Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> right = ImmutableMap.of("b", 2, "c", 4, "d", 5);
        MapDifference<String, Integer> diff = Maps.difference(left, right);

        System.out.println(diff.entriesInCommon());
        System.out.println(diff.entriesDiffering());
        System.out.println(diff.entriesOnlyOnLeft());
        System.out.println(diff.entriesOnlyOnRight());

    }

}
