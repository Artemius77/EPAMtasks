package entities;

public class Task {

    private int id;
   private String description;
   private Worker worker;

    public Task(int id, String description, Worker worker) {
        this.id = id;
        this.description = description;
        this.worker = worker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", worker=" + worker +
                '}';
    }
}
