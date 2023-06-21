import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {
    private SimpleTask simpleTask1 = new SimpleTask(5, "Позвонить родителям");
    private SimpleTask simpleTask2 = new SimpleTask(6, "Позвонить детям");
    private SimpleTask simpleTask3 = new SimpleTask(7, "Позвонить детям");
    private String[] subtasks1 = {"Молоко", "Яйца", "Хлеб"};
    private String[] subtasks2 = {"Мука", "Творог", "Сметана"};
    private String[] subtasks3 = {"Молоко", "Яйца", "Котлеты"};
    private Epic epic1 = new Epic(51, subtasks1);
    private Epic epic2 = new Epic(63, subtasks2);
    private Epic epic3 = new Epic(84, subtasks3);
    private Meeting meeting1 = new Meeting(
            521,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );
    private Meeting meeting2 = new Meeting(
            562,
            "Презентация новой версии",
            "Приложение НетоБанка",
            "Пятница утром"
    );
    private Meeting meeting3 = new Meeting(
            595,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    @Test
    public void shouldAddThreeTasksOfDifferentType() {

        Todos todos = new Todos();
        todos.add(simpleTask1);
        todos.add(simpleTask2);
        todos.add(simpleTask3);
        todos.add(epic1);
        todos.add(epic3);
        todos.add(meeting3);
        todos.add(meeting2);

        Task[] expected = {simpleTask1, simpleTask2, simpleTask3, epic1, epic3, meeting3, meeting2};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }   // Проверка что все записи попали в Todos

    @Test
    public void queryNullMeeting() {
        String query = "Среда вечером"; // Искомые строки

        Todos todos = new Todos();
        todos.add(meeting1);
        todos.add(meeting2);
        todos.add(meeting3);

        Task[] expected = {};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нет похожих записей в Meeting

    @Test
    public void queryOneMeeting() {
        String query = "Презентация новой версии"; // Искомые строки

        Todos todos = new Todos();
        todos.add(meeting1);
        todos.add(meeting2);
        todos.add(meeting3);

        Task[] expected = {meeting2};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение одной записи в Meeting

    @Test
    public void queryMoreMeeting() {

        String query = "Выкатка 3й версии приложения"; // Искомые строки

        Todos todos = new Todos();
        todos.add(meeting1);
        todos.add(meeting2);
        todos.add(meeting3);

        Task[] expected = {meeting1, meeting3};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение несколько записей в Meeting

    @Test
    public void queryNullSubtasks() {
        String query = "Сигареты"; // Искомые строки

        Todos todos = new Todos();
        todos.add(epic1);
        todos.add(epic2);
        todos.add(epic3);

        Task[] expected = {};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нет похожих записей в Epic

    @Test
    public void queryOneSubtasks() {
        String query = "Творог"; // Искомые строки


        Todos todos = new Todos();
        todos.add(epic1);
        todos.add(epic2);
        todos.add(epic3);

        Task[] expected = {epic2};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение одной записи в Epic

    @Test
    public void queryMoreSubtasks() {
        String query = "Молоко"; // Искомые строки

        Todos todos = new Todos();
        todos.add(epic1);
        todos.add(epic2);
        todos.add(epic3);

        Task[] expected = {epic1, epic3};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение несколько записей в Epic

    @Test
    public void queryNullSimpleTask() {
        String query = "Купить макароны"; // Искомые строки

        Todos todos = new Todos();
        todos.add(simpleTask1);
        todos.add(simpleTask2);
        todos.add(simpleTask3);

        Task[] expected = {};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нет похожих записей в SimpleTask

    @Test
    public void queryOneSimpleTask() {
        String query = "Позвонить родителям"; // Искомые строки

        Todos todos = new Todos();
        todos.add(simpleTask1);
        todos.add(simpleTask2);
        todos.add(simpleTask3);

        Task[] expected = {simpleTask1};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение одной записи в SimpleTask

    @Test
    public void queryMoreSimpleTask() {
        String query = "Позвонить детям"; // Искомые строки

        Todos todos = new Todos();
        todos.add(simpleTask1);
        todos.add(simpleTask2);
        todos.add(simpleTask3);

        Task[] expected = {simpleTask2, simpleTask3};
        Task[] actual = todos.search(query);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение несколько записей в SimpleTask

}
