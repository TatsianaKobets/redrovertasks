package by.http.redrovertasks.task_12.hw12_1;

public class Phone {

  public void connect(WiredHeadphones wh) {
    System.out.println("Connected wired headphones: " + wh.brand + " " + wh.model);
  }

  public void connect(WirelessHeadphones wh) {
    System.out.println("Connected wireless headphones: " + wh.brand + " " + wh.model);
  }
}
