public class NumberSystemConverter {

    // Метод для получения информации о системе счисления
    private int getBase(NumberSystem system){
        switch (system){
            case BIN:
                return 2;
            case OCT:
                return 8;
            case DEC:
                return 10;
            case HEX:
                return 16;
            default:
                throw new IllegalArgumentException("Неизвестная система счисления");
        }
    }

    // Метод для перевода в десятичную систему счисления
    public int toDec(String value, NumberSystem system) {
        int base = getBase(system);
        return Integer.parseInt(value, base);
    }

    // Метод для перевода из десятичной системы счисления в любую поддерживаемую систему счисления
    public String fromDec(int value, NumberSystem system) {
        int base = getBase(system);
        return Integer.toString(value, base);
    }
}
