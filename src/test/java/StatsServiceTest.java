import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void avergSales() {
        StatsService service = new StatsService();
        double expected = 15;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.avergSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int expected = 9;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void lessThanAvergSales() {
        StatsService service = new StatsService();
        int expected = 7;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.lessThanAvergSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void aboveAvergSales() {
        StatsService service = new StatsService();
        int expected = 7;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.aboveAvergSales(sales);

        assertEquals(expected, actual);
    }

}