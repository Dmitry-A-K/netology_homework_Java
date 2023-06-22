import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShopRepositoryTest {
    private Product item1 = new Product(1, "Майка", 10);
    private Product item2 = new Product(2, "Футболка", 15);
    private Product item3 = new Product(3, "Шорты", 20);
    private Product item4 = new Product(4, "Блюки", 25);
    private Product item5 = new Product(5, "Кроссовки", 35);

    @Test
    public void createRepo() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        Product[] expected = {item1, item2, item3, item4, item5};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }   // проверка успешности добавления элементов

    @Test
    public void addCopyRepoID() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);

        try {
            repo.add(item1);
        } catch (AlreadyExistsException e) {
            Product[] expected = {item1, item2};
            Product[] actual = repo.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }
    }   // проверка, что элемент с повторяющимся ID не добавляется в репозиторий

    @Test
    public void addCopyRepoIdAlready() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);

        Assertions.assertThrows(AlreadyExistsException.class, () -> {
           repo.add(item1);
        });
    }   // исключение при попытке добавить элемент с повторяющимся ID

    @Test
    public void removeFromRepo() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.removeById(3);

        Product[] expected = {item1, item2, item4, item5};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }   // проверка успешности удаления существующего элемента

    @Test
    public void removeNotFoundID() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(10);
        });
    }   // попытка удаления несуществующего элемента



}
