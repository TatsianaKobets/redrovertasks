package by.http.redrovertasks.task_12.hw12_2;

public class Main {

  public static void main(String[] args) {
    WorkerPool pool = new WorkerPool(3);
    for (int i = 0; i < 6; i++) {
      Worker worker = pool.getWorker();
      worker.doWork("Task " + i);
    }
  }
}
