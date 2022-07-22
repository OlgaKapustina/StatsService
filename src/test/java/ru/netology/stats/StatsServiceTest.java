package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    StatsService service = new StatsService();

    @Test
    public void shouldSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void findAverageSales(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSalesMonth(sales);
        long expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void findMinMonth(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesMonth(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void findMonthsWithSalesAboveAverage(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void findMonthsWithSalesUnderAverage(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.underAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);

    }





}