package cs3500.learnmath;

import java.util.ArrayList;
import java.util.Random;

public class ProblemSet {
    private ArrayList<MathProblem> problemSet = new ArrayList<>();

    public ProblemSet(int count) {
        Random random = new Random();

        this.problemSet =
                new ProblemGenerator(count, 10, random)
                        .generateProblems();
    }
}
