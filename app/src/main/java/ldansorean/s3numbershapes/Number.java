package ldansorean.s3numbershapes;

import static java.lang.Math.*;

public class Number {
    private final int number;
    private final boolean isSquare, isTriangular;

    public Number(int number) {
        this.number = number;
        this.isSquare = computeIsSquare();
        this.isTriangular = computeIsTriangular();
    }

    public boolean isSquare() {
        return isSquare;
    }

    public boolean isTriangular() {
        return isTriangular;
    }

    private boolean computeIsSquare() {
        double root = sqrt(number);
        return root == floor(root);
    }

    private boolean computeIsTriangular() {
        int triangularNumber = 1;
        int step = 2;
        while (triangularNumber < number) {
            triangularNumber += step;
            step++;
        }
        return triangularNumber == number;
    }
}
