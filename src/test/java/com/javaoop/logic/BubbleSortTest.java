package com.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName(value = "버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void given_List_WhenExcuting_ThenReturnSortedList() {

        //Given
        BubbleSort<Integer> bubblleSort = new BubbleSort<>();

        //When
        List<Integer> actual = bubblleSort.sort(List.of(3, 2, 4, 5, 1));

        //Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}