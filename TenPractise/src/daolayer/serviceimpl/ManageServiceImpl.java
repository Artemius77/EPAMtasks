package daolayer.serviceimpl;

import daolayer.daofactory.PseudoFactory;
import daolayer.daointerfaces.TaskDAO;
import daolayer.daointerfaces.WorkerDAO;
import daolayer.serviceinterfaces.ManageService;
import database.ConnectionManager;
import entities.Task;
import entities.Worker;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ManageServiceImpl implements ManageService {

   PseudoFactory factory = new PseudoFactory();

    @Override
    public void addTask(Task task) {
        Connection connection = ConnectionManager.getConnection();
        TaskDAO taskDAO = factory.getTaskDAO(connection);
        try {
           taskDAO.addTask(task);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteWorker(int id) {
        Connection connection = ConnectionManager.getConnection();
        TaskDAO taskDAO = factory.getTaskDAO(connection);
        WorkerDAO workerDAO = factory.getWorkerDAO(connection);
        try {
            //firstly retrieve all related tasks for worker and delete them
            List<Task> taskList = taskDAO.taskForWorkers(workerDAO.getById(id));
            for (Task task : taskList) {
                taskDAO.delete(task.getId());
            }

            // and now delete worker
            workerDAO.delete(id);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }


}
