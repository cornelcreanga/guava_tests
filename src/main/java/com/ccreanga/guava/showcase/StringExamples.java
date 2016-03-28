package com.ccreanga.guava.showcase;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class StringExamples {

    public static void main(String[] args) {
        Joiner joiner = Joiner.on("; ").skipNulls();

        String joined = joiner.join("Harry", null, "Ron","", "Hermione");
        System.out.println(joined);

        System.out.println(Splitter.on(';')
                .trimResults()
                .omitEmptyStrings()
                .split(joined));



    }

}
