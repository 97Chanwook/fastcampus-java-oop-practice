package org.fastcampus.service;

import org.fastcampus.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService service = new SortService(new JavaSort<>());

    @Test
    void Test(){
        assertEquals(List.of("1","2","3"),service.doSort(List.of("3","2","1")));
    }
}