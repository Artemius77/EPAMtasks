package daolayer.daofactory;

import daolayer.daoimpl.DepartmentDAOImpl;
import daolayer.daoimpl.TaskDAOimpl;
import daolayer.daoimpl.WorkerDAOimpl;
import daolayer.daointerfaces.DepartmentDAO;
import daolayer.daointerfaces.TaskDAO;
import daolayer.daointerfaces.WorkerDAO;
import database.ConnectionManager;

import java.sql.Connection;

public class PseudoFactory {

    //private Connection connection  = ConnectionManager.getConnection();

    public DepartmentDAO getDepartmentDAO(Connection connection) {
        return new DepartmentDAOImpl(connection);
    }

    public WorkerDAO getWorkerDAO(Connection connection) {
        return new WorkerDAOimpl(connection);
    }

    public TaskDAO getTaskDAO(Connection connection) {
        return new TaskDAOimpl(connection);
    }

}
