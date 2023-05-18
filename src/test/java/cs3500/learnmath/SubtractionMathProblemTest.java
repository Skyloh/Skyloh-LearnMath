package cs3500.learnmath;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionMathProblemTest {

  SubtractionMathProblem problemA;
  SubtractionMathProblem problemB;

  @BeforeEach
  public void setupSubtractionTests() {
    problemA = new SubtractionMathProblem(3, 2);
    problemB = new SubtractionMathProblem(1, 1);
  }

  @Test
  public void checkMath() {
    assertEquals(1, problemA.getAnswer());
    assertEquals(0, problemB.getAnswer());
  }

  @Test
  public void checkOperatorCharacter() {
    assertEquals('-', problemA.getOperatorCharacter());
    assertEquals('-', problemB.getOperatorCharacter());
  }
}