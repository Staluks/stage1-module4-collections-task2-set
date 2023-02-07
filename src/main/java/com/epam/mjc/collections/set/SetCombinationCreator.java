package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();
        Iterator<String> it = firstSet.iterator();
        while (it.hasNext()){
            String component = it.next();
            if(firstSet.contains(component) && secondSet.contains(component) && !thirdSet.contains(component)){
                set.add(component);
            }
        }
        Iterator<String> itThird = thirdSet.iterator();
        while (itThird.hasNext()){
            String element = itThird.next();
            if(!firstSet.contains(element) && !secondSet.contains(element)){
                set.add(element);
            }
        }
        return set;
    }
}
