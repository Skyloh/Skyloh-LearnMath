package cs3500.learnmath;

import java.util.Random;

public enum ProblemOperands {
    ADDITION (0),
    SUBTRACTION (1);

    private final int i;

    ProblemOperands(int i) {
        this.i = i;
    }

    public static ProblemOperands getRandomOperand(Random random) {
        ProblemOperands[] array = ProblemOperands.values();

        return array[random.nextInt(array.length)];
    }
}
