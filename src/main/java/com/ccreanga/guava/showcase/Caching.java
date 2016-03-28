package com.ccreanga.guava.showcase;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Caching {


    public static String loadData(String key){
        return "loaded data";
    }

    public static void main(String[] args) throws ExecutionException {
        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .removalListener(notification -> System.out.println("removed"))
                .build(
                        new CacheLoader<String, String>() {
                            public String load(String key) throws Exception {
                                System.out.println("load");
                                return loadData(key);
                            }
                        });
        //cache.put("key","value");
        System.out.println(cache.get("key"));
        cache.invalidateAll();
    }

}
