package com.ccreanga.guava.showcase.collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap
public class MultimapExample {

    public static void main(String[] args) {
        Map<String,List<Integer>> map = new HashMap<>();

        //add one element
        List<Integer> list = map.get("key1");
        if(list == null) {
            list = new ArrayList<>();
            map.put("key1",list);
        }
        list.add(12);
        System.out.println(list);

        Multimap<String,Integer> multimap = ArrayListMultimap.create();
        multimap.put("key1",12);
        multimap.put("key1",13);
        multimap.put("key2",15);

        System.out.println(multimap);

        //Multimap<K, V> is not a Map<K, Collection<V>> ;see bellow

        System.out.println(map.get("NON_EXISTING_KEY"));
        System.out.println(multimap.get("NON_EXISTING_KEY"));

        //Convert to a map
        System.out.println(multimap.asMap().get("NON_EXISTING_KEY"));


    }
}
