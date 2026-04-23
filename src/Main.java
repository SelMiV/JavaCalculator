import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberSystemConverter converter = new NumberSystemConverter();
        OperationExecutor executor = new OperationExecutor();

//        System.out.print("Введите число в десятичной системе: ");
//        int input = Integer.parseInt(scanner.nextLine());
//
//        System.out.println(converter.fromDec(input, NumberSystem.BIN));
//        System.out.println(converter.fromDec(input, NumberSystem.OCT));
//        System.out.println(converter.fromDec(input, NumberSystem.HEX).toUpperCase());
//
//        System.out.print("Введите число в восьмиричной системе: ");
//        String input1 = scanner.nextLine();
//        System.out.println(converter.toDec(input1, NumberSystem.HEX));

        System.out.println(executor.execute(4, 2, '/'));
    }
}
