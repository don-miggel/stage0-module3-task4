package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        float a = 1f;
        float b = 3f;
        float res;
        res = (9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        System.out.println(res);
    }
}
