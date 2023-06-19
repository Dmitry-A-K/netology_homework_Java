// Epic — задача, состоящая из подзадач.
// Про неё известны id (число) и subtasks — массив из подзадач, каждая из которых является простым текстом (String);

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String text : subtasks) {
            if (text.contains(query)) {
                return true;
            }
        }
        return false;
    }

}
