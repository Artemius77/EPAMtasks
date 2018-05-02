package daolayer.serviceimpl;

import daolayer.daofactory.PseudoFactory;
import daolayer.daointerfaces.DepartmentDAO;
import daolayer.daointerfaces.TaskDAO;
import daolayer.daointerfaces.WorkerDAO;
import daolayer.serviceinterfaces.RetrieveService;
import database.ConnectionManager;
import entities.Department;
import entities.Task;
import entities.Worker;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class RetrieveServiceImpl implements RetrieveService {
// where close connection!!

    PseudoFactory sqlDaoFactory = new PseudoFactory();



    @Override
    public List<Department> getAllDept() {
        Connection connection = ConnectionManager.getConnection();
        DepartmentDAO departmentDAO = sqlDaoFactory.getDepartmentDAO(connection);
        List<Department> list ;
        try {
            list = departmentDAO.getAll();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public List<Worker> getAllWork() {
        Connection connection = ConnectionManager.getConnection();
        WorkerDAO workerDAO = sqlDaoFactory.getWorkerDAO(connection);
        List<Worker> list ;
        try {
            list = workerDAO.getAll();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public List<Task> getAllTask() {
        Connection connection = ConnectionManager.getConnection();
        TaskDAO taskDAO = sqlDaoFactory.getTaskDAO(connection);
        List<Task> list ;
        try {
            list = taskDAO.getAll();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public List<Worker> getWorkersByDeptId(int id) {
        Connection connection = ConnectionManager.getConnection();
        WorkerDAO workerDAO = sqlDaoFactory.getWorkerDAO(connection);
        List<Worker> list ;
        try {
            list = workerDAO.getAllByDeptId(id);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public List<Task> getTasksForWorker(Worker worker) {
        Connection connection = ConnectionManager.getConnection();
        TaskDAO taskDAO = sqlDaoFactory.getTaskDAO(connection);
        List<Task> list ;
        try {
            list = taskDAO.taskForWorkers(worker);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


}
