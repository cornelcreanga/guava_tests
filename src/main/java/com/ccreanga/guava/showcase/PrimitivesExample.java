package com.ccreanga.guava.showcase;

import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedInts;

public class PrimitivesExample {

    public static void main(String[] args) {
        UnsignedInteger integer = UnsignedInteger.valueOf(2147483648l);

        System.out.println(integer);
        System.out.println(UnsignedInts.parseUnsignedInt(integer.toString()));
//        Integer integer2 = Integer.valueOf("2147483648");
//        System.out.println(integer2);
    }

}
