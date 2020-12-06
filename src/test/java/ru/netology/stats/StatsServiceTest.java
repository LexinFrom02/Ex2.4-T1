package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesAmount() {
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        StatsService statsService = new StatsService();
        int actual = statsService.salesAmount(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        StatsService statsService = new StatsService();
        int actual = statsService.averageAmount(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        StatsService statsService = new StatsService();
        int actual = statsService.maxSales(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void leastSales() {
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        StatsService statsService = new StatsService();
        int actual = statsService.leastSales(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void monthsLessThanAverageSales() {
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService statsService = new StatsService();
        int actual = statsService.monthsLessThanAverageSales(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void monthsMoreThanAverageSales() {
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService statsService = new StatsService();
        int actual = statsService.monthsMoreThanAverageSales(salesByMonth);
        assertEquals(expected, actual);
    }
}