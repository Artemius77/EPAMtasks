package daolayer.daoimpl;

import com.sun.istack.internal.logging.Logger;
import daolayer.daofactory.PseudoFactory;
import daolayer.daointerfaces.DepartmentDAO;
import daolayer.daointerfaces.TaskDAO;
import daolayer.daointerfaces.WorkerDAO;
import entities.Task;
import entities.Worker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class TaskDAOimpl implements TaskDAO {

    private Connection connection;
    private WorkerDAO workerDAO ;

    public TaskDAOimpl(Connection connection) {
        workerDAO =  new PseudoFactory().getWorkerDAO(connection);
        this.connection = connection;
    }

    @Override
    public List<Task> getAll() {
        List<Task> ls = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("select * from task");
            rs =   statement.executeQuery();
            while (rs.next()){
                Task task = new Task(
                        rs.getInt(1),
                        rs.getString(2),
                        workerDAO.getById(rs.getInt(3))
                );
                ls.add(task);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAOImpl.class).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return ls;
    }

    public void addTask(Task task){
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("insert into task(id, descripton, work_id)  values(?,?,?)");
            ps.setInt(1, task.getId());
            ps.setString(2, task.getDescription());
            ps.setInt(3, task.getWorker().getId());
            int count = ps.executeUpdate();
            if (count != 1) throw new SQLException("execute problem!");
        } catch (SQLException ex) {
            Logger.getLogger(TaskDAOimpl.class).log(Level.SEVERE, null, ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<Task> taskForWorkers(Worker worker) {
        List<Task> ls = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("select * from task where work_id = ? ");
            statement.setInt(1,worker.getId());
            rs =   statement.executeQuery();
            while (rs.next()){
                Task task = new Task(
                        rs.getInt(1),
                        rs.getString(2),
                        workerDAO.getById(rs.getInt(3))
                );
                ls.add(task);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAOImpl.class).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return ls;
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("delete from task where id = ?");
            statement.setInt(1,id);
            int count = statement.executeUpdate();
            if (count != 1) throw new SQLException("wrong delete");
        } catch (SQLException ex) {
            Logger.getLogger(WorkerDAOimpl.class).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
