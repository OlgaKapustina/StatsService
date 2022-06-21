package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void totalSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 180;
        int actual = service.totalSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateAverageSalesInMonth() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 15;
        int actual = service.monthAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void findMonthWithMaxSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 8;
        int actual = service.monthWithMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void findMonthWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 9;
        int actual = service.monthWithMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void countMonthsWithSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.monthsWhereSalesBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void countMonthsWithSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.monthsWhereSalesAboveAverage(sales);
        assertEquals(expected, actual);
    }
}