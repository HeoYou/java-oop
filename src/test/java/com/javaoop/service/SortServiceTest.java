package com.javaoop.service;

import com.javaoop.logic.BubbleSort;
import com.javaoop.logic.JavaSort;
import com.javaoop.logic.Sort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {


    private SortService sut = new SortService(new BubbleSort<String>());

    @Test
    void test(){

        //Given

        //When
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        //Then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}