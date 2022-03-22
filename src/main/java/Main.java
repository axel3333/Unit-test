public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c;
        if (b != 0) {
            c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } else
            System.out.println("Деление на 0 невозможно");
    }
}