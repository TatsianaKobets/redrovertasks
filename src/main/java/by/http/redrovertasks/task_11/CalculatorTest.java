package by.http.redrovertasks.task_11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  public void testAdd() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.add(2, 3), 5);
    assertEquals(calculator.add(-2, 3), 1);
    assertEquals(calculator.add(-2, -3), -5);
  }

  @Test
  public void testSubtract() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.subtract(2, 3), -1);
    assertEquals(calculator.subtract(-2, 3), -5);
    assertEquals(calculator.subtract(-2, -3), 1);
  }

  @Test
  public void testMultiply() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.multiply(2, 3), 6);
    assertEquals(calculator.multiply(-2, 3), -6);
    assertEquals(calculator.multiply(-2, -3), 6);
  }

  @Test
  public void testDivide() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.divide(2, 3), 2 / 3.0, 0.01);
    assertEquals(calculator.divide(-2, 3), -2 / 3.0, 0.01);
    assertEquals(calculator.divide(-2, -3), 2 / 3.0, 0.01);
  }

  @Test()
  public void testDivideByZero() {
    assertThrows(ArithmeticException.class, () -> new Calculator().divide(2, 0));

  }
}
