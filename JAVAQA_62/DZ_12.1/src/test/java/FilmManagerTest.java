import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class FilmManagerTest {
    private FilmManager collection = new FilmManager(); // Объявление коллекции

    @ParameterizedTest
    @CsvSource({
            "ISAN,Бладшот,Вин Дизель в главной роли,боевик,url,Новинка",
            "ISAN,Вперёд,Синие отрываются на машине,мультфильм,url,Уже на экранах",
            "ISAN,Отель Белград,Семейная пара развлекается,комедия,url,Уже на экранах",
            "ISAN,Джентельмены,Группа парней в кожанках...,боевик,url,Новинка",
            "ISAN,Человек невидимка,Чел раально голый и невидимый,ужасы,url,Скоро в кинотеатрах",
            "ISAN,Тролли. Мировой тур,Трлли снова выходят на тропу,мультфильм,url,Скоро в кинотеатрах",
            "ISAN,Номер один,Маньяк-шизофреник считающий себя одиночкой,комедия,url,Уходит с экранов"
    })
    public void add(String filmId, String filmName, String filmDescription, String filmGenre, String filmPoster, String filmPromo) {
        new FilmManager(filmId, filmName, filmDescription, filmGenre, filmPoster, filmPromo);
    }
}