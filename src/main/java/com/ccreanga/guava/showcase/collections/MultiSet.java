package com.ccreanga.guava.showcase.collections;

import com.google.common.collect.BoundType;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultiset;
import com.google.common.collect.TreeMultiset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset
public class MultiSet {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("aa","aa","bb","cc");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer count = map.get(word);
            if (count == null) {
                map.put(word, 1);
            } else {
                map.put(word, count + 1);
            }
        }

        System.out.println(map);

        Multiset<String> multiSet = HashMultiset.create();
        for (String word : words) {
            multiSet.add(word);
        }
        //or even multiSet.addAll(words);
        System.out.println(multiSet);

        //remove one element
        multiSet.remove("aa");
        System.out.println(multiSet);



        List<Integer> latency = Arrays.asList(10,3,10,5,5,10,12);
        SortedMultiset<Integer> sortedMultiSet = TreeMultiset.create();
        sortedMultiSet.addAll(latency);
        sortedMultiSet = sortedMultiSet.subMultiset(1,BoundType.CLOSED,10,BoundType.CLOSED);

        System.out.println(sortedMultiSet);


    }
}
