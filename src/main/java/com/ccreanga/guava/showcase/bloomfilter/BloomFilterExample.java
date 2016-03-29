package com.ccreanga.guava.showcase.bloomfilter;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//http://billmill.org/bloomfilter-tutorial/
public class BloomFilterExample {

    public static void main(String[] args) {

        Funnel<Person> personFunnel = new Funnel<Person>() {
            @Override
            public void funnel(Person person, PrimitiveSink into) {
                into
                        .putInt(person.id)
                        .putString(person.firstName, Charsets.UTF_8)
                        .putString(person.lastName, Charsets.UTF_8)
                        .putInt(person.birthYear);
            }
        };

        List<Person> personList = new ArrayList<>();
        for(int i=0;i<100;i++){
            personList.add(new Person(i,"costel","ion",1900+i));
        }


        BloomFilter<Person> friends = BloomFilter.create(personFunnel, 100, 0.01);
        for(Person friend : personList) {
            friends.put(friend);
        }

        for(int i=0;i<100;i++){
            Person modifiedPerson = new Person(1,"dummy","sammy",(int)(100*Math.random()));
            if (friends.mightContain(modifiedPerson)) { //low probability - around 1%
                System.out.println("found");
            };


        }

    }
}
