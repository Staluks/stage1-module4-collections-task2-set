package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hSet = new HashSet<>();
        Iterator<Integer> it = sourceList.iterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x % 2 != 0) {
                hSet.add(x);
                hSet.add(x * 2);
            }
            if (x % 2 == 0) {
                hSet.add(x);
                int y = x;
                while (y % 2 == 0) {
                    y = y / 2;
                    hSet.add(y);
                }
            }
        }
        return hSet;
    }
}
