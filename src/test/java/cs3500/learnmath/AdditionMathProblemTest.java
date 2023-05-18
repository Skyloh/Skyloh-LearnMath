package cs3500.learnmath;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionMathProblemTest {

  private AdditionMathProblem a1;
  private AdditionMathProblem a2;

  @BeforeEach
  public void setupAdditionTests() {
    a1 = new AdditionMathProblem(1, 1);
    a2 = new AdditionMathProblem(3, 4);
  }

  @Test
  public void checkMath() {
    System.out.println("Checking the Math of Addition Problems");
    assertEquals(2, a1.getAnswer());
    assertEquals(7, a2.getAnswer());
  }

  @Test
  public void checkOperatorCharacter() {
    assertEquals('+', a1.getOperatorCharacter());
  }

}