package daolayer.daoimpl;

import com.sun.istack.internal.logging.Logger;
import daolayer.daofactory.PseudoFactory;
import daolayer.daointerfaces.DepartmentDAO;
import daolayer.daointerfaces.WorkerDAO;
import daolayer.serviceimpl.RetrieveServiceImpl;
import entities.Department;
import entities.Worker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

public class WorkerDAOimpl implements WorkerDAO {

   // private RetrieveServiceImpl departService = new RetrieveServiceImpl(new MySqlDaoFactory().getDepartmentDAO());
    private DepartmentDAO departDAO ; // !!!!!connection
    private Connection connection; // !!!

   public WorkerDAOimpl (Connection connection) {
       departDAO = new PseudoFactory().getDepartmentDAO(connection);
       this.connection = connection;
   }

    @Override
    public List<Worker> getAll() {
        List<Worker> ls = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("select * from workers");
            rs =   statement.executeQuery();
            while (rs.next()){
                Worker worker = new Worker(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        departDAO.getDeptById(rs.getInt(5))

                );
                ls.add(worker);
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
    public Worker getById(int id){
        List<Worker> ls = new LinkedList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("select * from workers where id = ? ");
            statement.setInt(1,id);
            rs =   statement.executeQuery();
            while (rs.next()){
                Worker worker = new Worker(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        departDAO.getDeptById(rs.getInt(5))

                );
                ls.add(worker);
            }
            if (ls.size() > 1) throw new SQLException("More than one dep!");
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAOImpl.class).log(Level.SEVERE, null, ex);
        }

        return ls.iterator().next();

    }

    @Override
    public List<Worker> getAllByDeptId(int id) {
        List<Worker> ls = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("select * from workers as w join department " +
                    "as d on w.dept_id = d.id where dept_id = ? ");
            statement.setInt(1,id);
            rs =   statement.executeQuery();
            while (rs.next()){
                Worker worker = new Worker(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        departDAO.getDeptById(rs.getInt(5))

                );
                ls.add(worker);
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
            statement = connection.prepareStatement("delete from workers where id = ?");
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
