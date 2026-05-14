public class NumberForm {
    // метод для вывода числа во всех системах счисления одновременно
    public static void printAllSystems(long value, String numSis){
        String mode = numSis.toUpperCase();
        switch (mode) {
            case "HEX":
                System.out.println("HEX: " + Long.toHexString(value).toUpperCase());
                System.out.println("DEC: " + value);
                System.out.println("OCT: " + Long.toOctalString(value));
                System.out.println("BIN: " + Long.toBinaryString(value));
                break;

            case "DEC":
                System.out.println("DEC: " + value);
                System.out.println("HEX: " + Long.toHexString(value).toUpperCase());
                System.out.println("OCT: " + Long.toOctalString(value));
                System.out.println("BIN: " + Long.toBinaryString(value));
                break;

            case "OCT":
                System.out.println("OCT: " + Long.toOctalString(value));
                System.out.println("HEX: " + Long.toHexString(value).toUpperCase());
                System.out.println("DEC: " + value);
                System.out.println("BIN: " + Long.toBinaryString(value));
                break;
            case "BIN":
                System.out.println("BIN: " + Long.toBinaryString(value));
                System.out.println("HEX: " + Long.toHexString(value).toUpperCase());
                System.out.println("DEC: " + value);
                System.out.println("OCT: " + Long.toOctalString(value));
                break;
        }
        System.out.println();
    }
}
