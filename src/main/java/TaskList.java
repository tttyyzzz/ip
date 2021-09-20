import java.util.ArrayList;

public class TaskList {
    private static final int INDEX_FIX = 1;
    protected static ArrayList<Task> list = new ArrayList<>();

    /**
     * Add new Task in list
     *
     * @param newTask Task object created based on command.
     */
    //might move to main/duke class
    public static void addTask(Task newTask) {
        list.add(newTask);
        Ui.printAddNewTask(newTask);
    }

    /**
     * Add new Task in list
     *
     * @param newTask Task object created based on command.
     */
    //might move to main/duke class
    public static void reloadTask(Task newTask) {
        list.add(newTask);
    }
    /**
     * Calls Task.markAsDone().
     *
     * @param taskNumber Task number that is tagged to the task on console.
     */
    public static void checkDoneTask(int taskNumber) {
        int taskIndex = taskNumber - INDEX_FIX;
        list.get(taskIndex).markAsDone();
    }

    public static void deleteTask(int taskNumber) {
        int taskIndex = taskNumber - INDEX_FIX;
        Task task = list.remove(taskIndex);
        Ui.printDeleteTask(list.size(), task);
    }

    public static ArrayList<Task> getList() {
        return list;
    }

    public static int getArraySize() { return list.size();}

    public static Task getTask(int index) { return list.get(index); }
}