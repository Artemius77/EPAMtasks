package controller;

import daolayer.daointerfaces.DepartmentDAO;
import daolayer.daointerfaces.TaskDAO;
import daolayer.daointerfaces.WorkerDAO;
import daolayer.serviceimpl.ManageServiceImpl;
import daolayer.serviceimpl.RetrieveServiceImpl;
import daolayer.serviceinterfaces.ManageService;
import daolayer.serviceinterfaces.RetrieveService;
import entities.Task;

public class Controller {

    public static void main(String[] args) {
        //!!!!!!

        RetrieveService retrieveService = new RetrieveServiceImpl();
        ManageService manageService = new ManageServiceImpl();
        //!!!!

        System.out.println(retrieveService.getAllDept());
        System.out.println("________________________");
        System.out.println(retrieveService.getAllWork());
        System.out.println("________________________");
        System.out.println(retrieveService.getAllTask());
        System.out.println(retrieveService.getWorkersByDeptId(2));
        /*manageService.addTask(new Task(7,"Clean house",retrieveService.getWorkersByDeptId(1).get(0))); */

        /*System.out.println(retrieveService.getTasksForWorker(retrieveService.getWorkersByDeptId(3).get(0)));*/
       // manageService.deleteWorker(4);
    }

}
