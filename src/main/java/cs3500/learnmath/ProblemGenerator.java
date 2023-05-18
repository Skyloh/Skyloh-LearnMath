package cs3500.learnmath;

import java.util.Random;
import java.util.ArrayList;

public class ProblemGenerator {

    private final int countToGenerate;
    private final int cap;
    private final Random random;

    public ProblemGenerator(int countToGenerate, int cap, Random random) {
        this.countToGenerate = countToGenerate;
        this.cap = cap;
        this.random = random;
    }

    /**
     * Generate a set of math problems
     *
     * @return an arraylist of problems
     */
    public ArrayList<MathProblem> generateProblems() {

        ArrayList<MathProblem> problems = new ArrayList<>();

        for (int count = 0; count < countToGenerate; count += 1) {
            // r.nextInt() % 10 : returns 0 to 9
            // max(...) : returns 1 to 9
            int firstParameter = Math.max(random.nextInt() % cap, 1);
            int secondParameter;

            MathProblem problem;

            // find out how to randomly get one of these
            ProblemOperands operand = ProblemOperands.getRandomOperand(random);

            switch (operand) {

                case ADDITION -> {
                    // see line 17
                    secondParameter = Math.max(random.nextInt() % cap, 1);

                    // less picky
                    problem = new AdditionMathProblem(firstParameter, secondParameter);
                }

                case SUBTRACTION -> {
                    // generates a number up to/equal to the firstParameter.
                    secondParameter = random.nextInt(firstParameter + 1);

                    // that means we never have a negative subtraction problem
                    problem = new SubtractionMathProblem(firstParameter, secondParameter);
                }

                default -> throw new IllegalStateException("Unexpected value: " + operand);
            }

            problems.add(problem);
        }

        return problems;
    }
}
