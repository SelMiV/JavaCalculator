public class NumberSystemConverter {

    // Перевод в десятичную систему
    public int toDec(String value, NumberSystem system) {
        return Integer.parseInt(value, system.getBase());
    }

    // Перевод из десятичной системы
    public String fromDec(int value, NumberSystem system) {
        return Integer.toString(value, system.getBase());
    }
}