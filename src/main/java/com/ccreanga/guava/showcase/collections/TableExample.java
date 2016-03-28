package com.ccreanga.guava.showcase.collections;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.HashMap;
import java.util.Map;

public class TableExample {

    public static void main(String[] args) {
        Table<String,Integer,String> persons = HashBasedTable.create();
        persons.put("bucharest",23,"ionel");
        persons.put("bucharest",26,"escu");
        persons.put("cluj",26,"traian");
        persons.put("cluj",29,"traian");

        System.out.println(persons.get("bucharest",23));
        System.out.println(persons.row("bucharest"));

        System.out.println(persons.rowKeySet());
        System.out.println(persons.columnKeySet());

        //the alternative is to use
        Map<String,Map<Integer,String >> map = new HashMap<>();

        //converting the table to a map<string, map<integer,string>>
        map = persons.rowMap();
    }
}
