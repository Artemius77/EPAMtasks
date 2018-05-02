package daolayer.daointerfaces;

import entities.Worker;

import java.util.List;

public interface WorkerDAO {

       List<Worker> getAll();

       Worker getById(int id);

       List<Worker> getAllByDeptId(int id);

       void delete(int id);
}
