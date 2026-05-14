public class OperationExecutor {

    public int execute(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/': {
                if (b == 0) {
                    throw new ArithmeticException("Деление на 0");
                }
                return a / b;
            }
            case '%':
                return  a % b;
            default:
                throw new IllegalArgumentException("Неизвестная операция");
        }
    }
}
