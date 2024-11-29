package Problem11;

class BinaryDecimalConversion {
    private int lastDigit;
    private int decimal;
    private int power;

    BinaryDecimalConversion() {
        this.lastDigit = 0;
        this.decimal = 0;
        this.power = 0;
    }

    public long convertBinaryToDecimal(long binary) {
        while(binary!=0) {
            lastDigit = (int) binary%10;
            binary = binary/10;
            decimal = decimal + (lastDigit * ((int) Math.pow(2, power)));
            power++;
        }
        return decimal;
    }
}
