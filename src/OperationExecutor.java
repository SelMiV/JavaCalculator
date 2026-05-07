public class OperationExecutor {

    public int execute(int a, int b, char operator) {

        if (b == 0) {
            throw new ArithmeticException("Деление на 0");
        }

        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return  a % b;
            default:
                throw new IllegalArgumentException("Неизвестная операция");
        }
    }
}
