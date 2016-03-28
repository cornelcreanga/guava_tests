package com.ccreanga.guava.showcase.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BiMapExample {

    public static void main(String[] args) {
        Map<Integer, UUID> idToUUID = new HashMap<>();
        Map<UUID, Integer> UUIDToId = new HashMap<>();

        UUID uuid = UUID.randomUUID();
        idToUUID.put(7624, uuid);
        UUIDToId.put(uuid, 7624);

        System.out.println(idToUUID.get(7624));
        System.out.println(UUIDToId.get(uuid));

        //prone to error:

        idToUUID.put(7625, UUID.randomUUID());//will work
        System.out.println(idToUUID.get(7624));


        //use a bimap
        BiMap<Integer, UUID> idUUID = HashBiMap.create();
        idUUID.put(7624, uuid);
        System.out.println(idUUID.get(7624));
        System.out.println(idUUID.inverse().get(uuid));


        idUUID.put(7625, uuid);//will fail



    }

}
