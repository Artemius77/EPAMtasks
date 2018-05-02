package daolayer.serviceinterfaces;

import entities.Department;
import entities.Task;
import entities.Worker;

import java.util.List;

public interface RetrieveService {

    List<Department> getAllDept();

    List<Worker> getAllWork();

    List<Task> getAllTask();

    List<Worker> getWorkersByDeptId(int id);

    List<Task> getTasksForWorker(Worker worker);
}

