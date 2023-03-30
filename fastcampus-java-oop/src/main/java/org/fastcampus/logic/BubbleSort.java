package org.fastcampus.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> input){
        List<T> output = new ArrayList<>(input);

        for(int i=0; i< output.size(); i++){
            for(int j=0; j<i; j++){
                T x = output.get(i);
                T y = output.get(j);
                if(x.compareTo(y) < 0){
                    output.set(i,y);
                    output.set(j,x);
                }
            }
        }
        return output;
    }
}
