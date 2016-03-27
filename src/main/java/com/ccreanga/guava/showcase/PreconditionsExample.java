package com.ccreanga.guava.showcase;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//https://en.wikipedia.org/wiki/Precondition
public class PreconditionsExample {


    public void process(Map<String,BigDecimal> map) {
        if( map == null ) {
            throw new IllegalArgumentException( "Map must not be null" );
        }
        BigDecimal value = map.get("USD_TO_RON_CURRENCY");
        if( value == null ) {
            throw new IllegalArgumentException( "Map should contain the USD_TO_RON_CURRENCY" );
        }
        complexProcessing(value);

    }

//    public void process(Map<String,BigDecimal> map) {
//        Preconditions.checkNotNull(map,"Map must not be null");
//        BigDecimal value = Preconditions.checkNotNull(
//                map.get("USD_TO_RON_CURRENCY"),
//                "Map should contain the USD_TO_RON_CURRENCY");
//        complexProcessing(value);
//    }

    public void complexProcessing(BigDecimal value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        PreconditionsExample preconditionsExample = new PreconditionsExample();

        HashMap<String, BigDecimal> currencies = new HashMap<>();
        currencies.put("USD_TO_RON_CURRENCY",new BigDecimal("3.26"));
        preconditionsExample.process(currencies);

    }

}
