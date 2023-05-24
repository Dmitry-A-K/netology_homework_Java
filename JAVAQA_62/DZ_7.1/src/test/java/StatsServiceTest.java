import org.junit.jupiter.api.Test;
import ru.netology.services.StatsService;

public class StatsServiceTest {

    public int[] arraySales() {
        return new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    }

    @Test
    public void amountAllSalesTest() {
        StatsService service = new StatsService();
        int[] arr = arraySales();
        System.out.println("Общая сумма продаж - " + service.amountAllSales(arr));
        System.out.println();
    }

    @Test
    public void averageSalesPerMonthTest() {
        StatsService service = new StatsService();
        int[] arr = arraySales();
        System.out.println("Средняя сумма продаж в месяц - " + service.averageSalesPerMonth(arr));
        System.out.println();
    }

    @Test
    public void monthMaximumAmountTest() {
        StatsService service = new StatsService();
        int[] arr = arraySales();
        System.out.println("Месяц с максимальной суммой продаж - " + service.monthMaximumAmount(arr));
        System.out.println();
    }

    @Test
    public void monthMinimalAmountTest() {
        StatsService service = new StatsService();
        int[] arr = arraySales();
        System.out.println("Месяц с минимальной суммой продаж - " + service.monthMinimalAmount(arr));
        System.out.println();
    }

    @Test
    public void counterMonthMaxAmountTest() {
        StatsService service = new StatsService();
        int[] arr = arraySales();
        System.out.println("Месяцев с суммой продаж выше среднего - " + service.counterMonthMaxAmount(arr));
        System.out.println();
    }

    @Test
    public void counterMonthMinAmountTest() {
        StatsService service = new StatsService();
        int[] arr = arraySales();
        System.out.println("Месяцев с суммой продаж ниже среднего - " + service.counterMonthMinAmount(arr));
        System.out.println();
    }
}
