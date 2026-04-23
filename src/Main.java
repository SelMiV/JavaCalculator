import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberSystemConverter converter = new NumberSystemConverter();

        System.out.println("Введите число: ");
        int input = Integer.parseInt(scanner.nextLine());

        System.out.println(converter.fromDec(input, NumberSystem.BIN));
        System.out.println(converter.fromDec(input, NumberSystem.OCT));
        System.out.println(converter.fromDec(input, NumberSystem.HEX));
    }
}
