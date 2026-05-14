public class CalcSolver implements ICalculator{
    // выполнение обычной операции с двумя числами
    @Override
    public long calculate(long a, long b, String operator) {
        long res = 0;
        switch (operator) {
            case "+": res = a + b; break;
            case "-": res = a - b; break;
            case "*": res = a * b; break;
            case "/":
                if (b != 0) {
                    res = a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                    System.out.println(" ");
                    res = 0;
                }
                break;
            case "%":
                if (b != 0) {
                    res = a % b;
                } else {
                    System.out.println("Ошибка: деление на ноль (остаток)");
                    System.out.println(" ");
                    res = 0;
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция");
        }
        return res;
    }
}