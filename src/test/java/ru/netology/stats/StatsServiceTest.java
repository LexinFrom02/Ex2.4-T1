package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesAmount() {
        int expected = 180;
        StatsService statsService = new StatsService();
        int actual = statsService.salesAmount();
        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        int expected = 15;
        StatsService statsService = new StatsService();
        int actual = statsService.averageAmount();
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        int expected = 8;
        StatsService statsService = new StatsService();
        int actual = statsService.maxSales();
        assertEquals(expected, actual);
    }

    @Test
    void leastSales() {
        int expected = 9;
        StatsService statsService = new StatsService();
        int actual = statsService.leastSales();
        assertEquals(expected, actual);
    }

    @Test
    void monthsLessThanAverageSales() {
        int expected = 5;
        StatsService statsService = new StatsService();
        int actual = statsService.monthsLessThanAverageSales();
        assertEquals(expected, actual);
    }

    @Test
    void monthsMoreThanAverageSales() {
        int expected = 5;
        StatsService statsService = new StatsService();
        int actual = statsService.monthsMoreThanAverageSales();
        assertEquals(expected, actual);
    }
}