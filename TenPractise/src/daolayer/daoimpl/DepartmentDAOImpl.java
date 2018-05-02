package daolayer.daoimpl;

import com.sun.istack.internal.logging.Logger;
import daolayer.daointerfaces.DepartmentDAO;
import entities.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

public class DepartmentDAOImpl implements DepartmentDAO {

    private Connection connection;

    public DepartmentDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Department> getAll() {

        List<Department> ls = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
             statement = connection.prepareStatement("select * from department");
             rs =   statement.executeQuery();
            while (rs.next()){
                Department department = new Department(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getLong(3)

                );
                ls.add(department);
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
    public  Department getDeptById(int id){
        List<Department> ls = new LinkedList<Department>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("select * from department where id = ? ");
            statement.setInt(1,id);
            rs =   statement.executeQuery();
            while (rs.next()){
                Department department = new Department(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getLong(3)

                );
                ls.add(department);
            }
            if (ls.size() > 1) throw new SQLException("More than one dep!");
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAOImpl.class).log(Level.SEVERE, null, ex);
        }

        return ls.iterator().next();

    }

}
