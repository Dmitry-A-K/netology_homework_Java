import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.FreelanceVacation;


public class FreelanceVacationTest {

    @Test
    public void vacation1() {
        FreelanceVacation service = new FreelanceVacation();
        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
        System.out.println("Удасться отдохнуть -" + expected + " раза.");
        System.out.println();
    }

    @Test
    public void vacation2() {
        FreelanceVacation service = new FreelanceVacation();
        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
        System.out.println("Удасться отдохнуть -" + expected + " раза.");
        System.out.println();
    }

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    public void vacationCsv(int income, int expenses, int threshold, int expected) {
        FreelanceVacation service = new FreelanceVacation();
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
        System.out.println("Удасться отдохнуть -" + expected + " раза.");
        System.out.println();
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vocation.csv")
    public void vacationCsvFile(int income, int expenses, int threshold, int expected) {
        FreelanceVacation service = new FreelanceVacation();
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
        System.out.println("Удасться отдохнуть -" + expected + " раза.");
        System.out.println();
    }
}
