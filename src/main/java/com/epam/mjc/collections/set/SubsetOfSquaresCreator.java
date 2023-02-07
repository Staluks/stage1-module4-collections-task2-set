package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();
        Iterator<Integer> it = sourceList.iterator();
        while(it.hasNext()){
            int x = it.next();
            x= x*x;
            if(x>= lowerBound && x<= upperBound){
                set.add(x);
            }
        }
        return set;
    }
}
