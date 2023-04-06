package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void MinimumСompanySales() {

        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void MaximumСompanySales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    @Test

    public void AverageMonthlySales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumSel = 15;
        int actualSumSel = service.averageSale(sales);

        Assertions.assertEquals(expectedSumSel, actualSumSel);
    }
    @Test

    public void CalculateMonthlySalesAmount() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumSel = 180;
        int actualSumSel = service.monthlySalesAmount(sales);

        Assertions.assertEquals(expectedSumSel, actualSumSel);
    }
    @Test

    public void BelowTheAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumSel = 5;
        int actualSumSel = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedSumSel, actualSumSel);
    }

    @Test
    public void aboveAverageSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumSel = 5;
        int actualSumSel = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedSumSel, actualSumSel);
    }
}
