package ru.netology.StringsAndArrays.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFoundSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFoundAverageSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSum = 15;
        long actualAverageSum = service.averageSumSales(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void shouldFoundMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFoundMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinMonth = 9;
        long actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFoundCountBelow() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedCountMonthBelow = 5;
        long actualCountMonthBelow = service.belowTheAverageSales(sales);

        Assertions.assertEquals(expectedCountMonthBelow, actualCountMonthBelow);
    }

    @Test
    public void shouldFoundCountAbove() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedCountMonthAbove = 5;
        long actualCountMonthAbove = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedCountMonthAbove, actualCountMonthAbove);
    }
}