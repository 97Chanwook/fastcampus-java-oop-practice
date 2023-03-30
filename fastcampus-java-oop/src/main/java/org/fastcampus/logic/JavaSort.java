package org.fastcampus.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>>{

    public List<T> sort(List<T> input){
        List<T> output = new ArrayList<>();
        Collections.sort(output);
        return output;
    }
}
