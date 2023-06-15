package org.db.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAverageTest {

    @Test
    void getAverage() {
        int [] arr = {1,2,3,4,5,};
        //assertEquals(3, CalculateAverage.getAverage(arr));
        assertEquals(3, CalculateAverage.getAverage(new int[]{1,2,3,4,5}));
    }
    @Test
    void getAverageByStream() {
        int [] arr = {1,2,3,4,5,};
        //assertEquals(3, CalculateAverage.getAverageByStream(arr));
        assertEquals(3, CalculateAverage.getAverage(new int[]{1,2,3,4,5}));
    }
}