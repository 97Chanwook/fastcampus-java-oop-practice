package org.fastcampus.service;

import org.fastcampus.logic.JavaSort;
import org.fastcampus.logic.Sort;

import java.util.List;

public class SortService {
    //dependency Injection
     private Sort<String> sort;

     public SortService(Sort<String> sort){
         this.sort = sort;
         System.out.println("구현체 : "+sort.getClass().getName());
     }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
