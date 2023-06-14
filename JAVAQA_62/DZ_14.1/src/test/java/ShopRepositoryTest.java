import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    }

    @Test
    public void addCopyRepoID() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item1);
        Product[] expected = {item1, item2};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

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

    }

    @Test
    public void removeNotFoundID() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.removeById(6);
        Product[] expected = {item1, item2, item3, item4, item5};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}
