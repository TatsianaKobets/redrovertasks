package by.http.redrovertasks.task_12.hw12_1;

public class Main {

  /**
   * Нужно смоделировать подключение наушников к телефону. Наушники могут быть проводными и
   * беспроводными.
   * <p>
   * Создать: Абстрактный класс Headphones, который знает марку/модель наушников Конкретные классы
   * WiredHeadphones и WirelessHeadphones Класс Phone, в котором есть методы connect(WiredHeadphones
   * wh) и connect(WirelessHeadphones). Когда эти методы вызываются, на консоль выводится сообщение
   * о том, какие конкретные наушники какого типа были подключены.
   *
   * @param args
   */
  public static void main(String[] args) {
    // Создаем объекты наушников
    WiredHeadphones wiredHeadphones = new WiredHeadphones("Sony", "MDR-7506");
    WirelessHeadphones wirelessHeadphones = new WirelessHeadphones("Apple", "AirPods Pro");

    // Создаем объект телефона
    Phone phone = new Phone();

    // Подключаем наушники к телефону
    phone.connect(wiredHeadphones);
    phone.connect(wirelessHeadphones);
  }
}
