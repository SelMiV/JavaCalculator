import java.util.Scanner;

public class Main {

    static NumberSystemConverter converter = new NumberSystemConverter();
    static OperationExecutor executor = new OperationExecutor();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("==== Калькулятор =====");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Целочисленное деление");
            System.out.println("5. Вычисление остатка от деления");
            System.out.println("6. Выйти");
            System.out.println("-------------------------");
            System.out.print("Выберите операцию: ");

            int operChoice = getMenuChoice(1, 6);

            if (operChoice == 6) {
                return;
            }

            char operation = getOperation(operChoice);

            System.out.println("=====================");
            System.out.println("1. Двоичная");
            System.out.println("2. Восьмеричная");
            System.out.println("3. Десятичная");
            System.out.println("4. Шестнадцатиричная");
            System.out.print("Выберите систему счисления: ");

            int sysChoice = getMenuChoice(1, 4);

            NumberSystem numSys = getNumSys(sysChoice);

            String numA = inputNumber("Введите первое число: ", numSys);

            String numB = inputNumber("Введите второе число: ", numSys);

            int decA = converter.toDec(numA, numSys);
            int decB = converter.toDec(numB, numSys);

            try {
                int result = executor.execute(decA, decB, operation);

                System.out.println();
                System.out.println("=====================");
                System.out.println("Результат:");

                System.out.println(numSys + ": " + converter.fromDec(result, numSys).toUpperCase());

                if (numSys != NumberSystem.BIN) {
                    System.out.println("BIN: " + converter.fromDec(result, NumberSystem.BIN));
                }

                if (numSys != NumberSystem.OCT) {
                    System.out.println("OCT: " + converter.fromDec(result, NumberSystem.OCT));
                }

                if (numSys != NumberSystem.DEC) {
                    System.out.println("DEC: " + result);
                }

                if (numSys != NumberSystem.HEX) {
                    System.out.println("HEX: " + converter.fromDec(result, NumberSystem.HEX).toUpperCase());
                }
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
        }
    }

    public static boolean isValidNumber(String num, NumberSystem base) {
        try {
            converter.toDec(num, base);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getMenuChoice(int start, int end) {
        String choice;
        int num;

        while (true) {

            choice = scanner.next();

            if (!isValidNumber(choice, NumberSystem.DEC)) {
                System.out.println("Введите цифры");
                continue;
            }

            num = Integer.parseInt(choice);

            if (num < start || num > end) {
                System.out.println("Введите от " + start + " до " + end);
                continue;
            }

            return num;
        }
    }

    public static NumberSystem getNumSys(int choice) {
        switch (choice) {
            case 1:
                return NumberSystem.BIN;

            case 2:
                return NumberSystem.OCT;

            case 3:
                return NumberSystem.DEC;

            case 4:
                return NumberSystem.HEX;

            default:
                throw new IllegalArgumentException("Неизвестная система");
        }
    }

    public static char getOperation(int choice) {
        switch (choice) {
            case 1:
                return '+';

            case 2:
                return '-';

            case 3:
                return '*';

            case 4:
                return '/';

            case 5:
                return '%';

            default:
                throw new IllegalArgumentException("Неизвестная операция");
        }
    }

    public static String inputNumber(String text, NumberSystem system) {
        String value;
        while (true) {
            System.out.print(text);
            value = scanner.next();

            if (!isValidNumber(value, system)) {
                System.out.println("Неправильное число");
                continue;
            }

            return value;
        }
    }
}