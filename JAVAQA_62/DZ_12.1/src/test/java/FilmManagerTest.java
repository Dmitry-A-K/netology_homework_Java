import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    private int movieCount = 3; // Количество (первых/последних) фильмов, для отображения части коллекции
    Movie item1 = new Movie("973200", "Бладшот", "Вин Дизель в главной роли", "боевик", "url", "Новинка");
    Movie item2 = new Movie("548091", "Вперёд", "Синие отрываются на машине", "мультфильм", "url", "Уже на экранах");
    Movie item3 = new Movie("104617", "Отель Белград", "Семейная пара развлекается", "комедия", "url", "Уже на экранах");
    Movie item4 = new Movie("993211", "Джентельмены", "Группа парней в кожанках...", "боевик", "url", "Новинка");
    Movie item5 = new Movie("159513", "Человек невидимка", "Чел раально невидимый", "ужасы", "url", "Скоро в кинотеатрах");
    Movie item6 = new Movie("236819", "Тролли. Мировой тур", "Тролли снова выходят на тропу", "мультфильм", "url", "Скоро в кинотеатрах");
    Movie item7 = new Movie("236904", "Номер один", "Первый, но не единственный...", "комедия", "url", "Уходит с экранов");
    Movie item8 = new Movie("000000", "нет данных", "нет данных", "нет данных", "нет данных", "нет данных");

    @Test
    public void testAddAndRemove() {
        FilmManager collection = new FilmManager();
        collection.addMovie(item1);
        collection.addMovie(item2);
        collection.addMovie(item3);
        collection.addMovie(item4);
        collection.addMovie(item5);
        collection.addMovie(item6);
        collection.addMovie(item7);
        collection.removeById(item1.getMovieCount());
        collection.removeById(item6.getMovieCount());

        Movie[] expected = {item2, item3, item4, item5, item7};
        Movie[] actual = collection.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addResult() {
        FilmManager collection = new FilmManager(movieCount);

        //  Пустая коллекция
        System.out.println("Коллеция после инициации (пустая):");
        collection.print(collection.findAll());
        System.out.println();

        // Создание коллекции
        collection.addMovie(item1);
        collection.addMovie(item2);
        collection.addMovie(item3);
        collection.addMovie(item4);
        collection.addMovie(item5);
        collection.addMovie(item6);
        collection.addMovie(item7);

        // Просмотр коллекции после создания
        System.out.println("Вся коллеция:");
        collection.print(collection.findAll());
        System.out.println();
        System.out.println("Коллеция - фильмы добавленные первыми:");
        collection.print(collection.findFirst());
        System.out.println();
        System.out.println("Коллеция - фильмы добавленные последними:");
        collection.print(collection.findLast());
        System.out.println();

        // Удаление части коллекции
        collection.removeById(item1.getMovieCount());
        collection.removeById(item3.getMovieCount());
        collection.removeById(item7.getMovieCount());

        // Просмотр коллекции после удаления части фильмов
        System.out.println("Коллеция - оставшиеся фильмы добавленные первыми:");
        collection.print(collection.findFirst());
        System.out.println();
        System.out.println("Коллеция - оставшиеся фильмы добавленные последними:");
        collection.print(collection.findLast());
        System.out.println();

    }

    @Test
    public void changeMovie() {
        Movie old = new Movie();
        old = item1;
        Movie change = new Movie();
        change = item8;

        System.out.println("Начальные параметры полей");
        System.out.println(old.movieToString());
        System.out.println();

        old.setMovieCount(change.getMovieCount());
        old.setMovieId(change.getMovieId());
        old.setMovieName(change.getMovieName());
        old.setMovieDescription(change.getMovieDescription());
        old.setMovieGenre(change.getMovieGenre());
        old.setMoviePoster(change.getMoviePoster());
        old.setMoviePromo(change.getMoviePromo());

        System.out.println("Конечные параметры полей");
        System.out.println(old.movieToString());
        System.out.println();

        String[] expected = old.movieToArray();
        String[] actual = item8.movieToArray();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void countTest() {
        int count;

        count = -1; // Если хотят отрицательное количество
        int expected1 = 3; // Ожидается вся коллекция

        FilmManager collection1 = new FilmManager(count);
        collection1.addMovie(item1);
        collection1.addMovie(item2);
        collection1.addMovie(item3);

        int actualFirst1 = collection1.findFirst().length;
        Assertions.assertEquals(expected1, actualFirst1);

        int actualLast1 = collection1.findLast().length;
        Assertions.assertEquals(expected1, actualLast1);

        count = 0;  // Если хотят нулевое количество
        int expected2 = 0; // Ожидается пустая коллекция

        FilmManager collection2 = new FilmManager(count);
        collection2.addMovie(item1);
        collection2.addMovie(item2);
        collection2.addMovie(item3);

        int actualFirst2 = collection2.findFirst().length;
        Assertions.assertEquals(expected2, actualFirst2);

        int actualLast2 = collection2.findLast().length;
        Assertions.assertEquals(expected2, actualLast2);

        count = movieCount * 100; // Если хотят больше чем есть в коллекции
        int expected3 = 3;  // Ожидается вся коллекция

        FilmManager collection3 = new FilmManager(count);
        collection3.addMovie(item1);
        collection3.addMovie(item2);
        collection3.addMovie(item3);

        int actualFirst3 = collection3.findFirst().length;
        Assertions.assertEquals(expected3, actualFirst3);

        int actualLast3 = collection3.findLast().length;
        Assertions.assertEquals(expected3, actualLast3);
    }
}