package Problem11;

public class BinaryDecimal {
    public static void main(String[] args) {
        BinaryDecimalConversion decimal = new BinaryDecimalConversion();

        long binaryValue = 1011;
        long decimalValue = decimal.convertBinaryToDecimal(binaryValue);
        System.out.println(binaryValue + " conversion to decimal value: " +decimalValue);
    }
}

