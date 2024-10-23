package by.http.redrovertasks.task_12.hw12_2;

import java.util.ArrayList;
import java.util.List;

public class WorkerPool {

  private int maxSize;
  private List<Worker> workers;
  private int currentId = 0;

  public WorkerPool(int maxSize) {
    this.maxSize = maxSize;
    this.workers = new ArrayList<>(maxSize);
    for (int i = 0; i < maxSize; i++) {
      workers.add(new Worker(i));
    }
  }

  public Worker getWorker() {
    return workers.get(currentId++ % maxSize);
  }
}
