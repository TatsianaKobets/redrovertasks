package by.http.redrovertasks.task_12.hw12_2;

public class Worker {

  private int id;

  public Worker(int id) {
    this.id = id;
  }

  public void doWork(String taskSummary) {
    System.out.println("Worker " + id + " is doing " + taskSummary);
  }
}
