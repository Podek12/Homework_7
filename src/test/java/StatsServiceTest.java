import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 180;
        long allSum = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSales, allSum);
    }


    @Test
    public void sumAverageSalesInMonth() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumAverageSalesInMonth = 15;
        long Average = service.sumAverageSalesInMonth(sales);

        Assertions.assertEquals(expectedSumAverageSalesInMonth, Average);


    }

    @Test
    public void sumMaxSalesMonth() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMaxSalesMonth = 8;
        long SumMaxSalesMonth = service.sumMaxSalesMonth(sales);

        Assertions.assertEquals(expectedSumMaxSalesMonth, SumMaxSalesMonth);

    }

    @Test
    public void sumMinSalesMonth() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMinSalesMonth = 9;
        long sumMinSalesMonth = service.sumMinSalesMonth(sales);

        Assertions.assertEquals(expectedSumMinSalesMonth, sumMinSalesMonth);


    }

    @Test
    public void minCalcMonthBelowAverage() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinCalcMonthBelowAverage = 5;
        long minCalcMonthBelowAverage = service.minCalcMonthBelowAverage(sales);

        Assertions.assertEquals(expectedMinCalcMonthBelowAverage, minCalcMonthBelowAverage);


    }

    @Test
    public void maxCalcMonthHigherAverage() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxCalcMonthHigherAverage = 5;
        long maxCalcMonthHigherAverage = service.maxCalcMonthHigherAverage(sales);

        Assertions.assertEquals(expectedMaxCalcMonthHigherAverage, maxCalcMonthHigherAverage);

    }
}