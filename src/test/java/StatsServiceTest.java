package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void testSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.average(sales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 15;
        int actualMoney = service.average(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

    @Test
    public void testBelowAverageMonths() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 5;
        int actualMoney = service.BelowAverageMonths(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

    @Test
    public void testAboveAverageMonths() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 5;
        int actualMoney = service.AboveAverageMonths(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

}
