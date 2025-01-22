package code_coverage_4.code_coverage_4;

public class isIsosceles {
    public Boolean test(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a && (a == b || b == c || a == c);
    }
}
