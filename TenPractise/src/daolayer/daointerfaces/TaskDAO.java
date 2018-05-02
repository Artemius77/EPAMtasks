package daolayer.daointerfaces;

import entities.Task;
import entities.Worker;

import java.util.List;

public interface TaskDAO {

    List<Task> getAll();

    void addTask(Task task);

    List<Task> taskForWorkers(Worker worker);

    void delete(int id);
}
