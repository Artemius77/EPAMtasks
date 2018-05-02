package daolayer.daointerfaces;

import entities.Department;

import java.sql.Connection;
import java.util.List;

public interface DepartmentDAO {

    List<Department> getAll();

    Department getDeptById(int id);

}
