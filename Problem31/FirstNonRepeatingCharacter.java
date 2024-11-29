package Problem31;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        FirstNonRepeatingCharacterString firstNonRepeat = new FirstNonRepeatingCharacterString();

        String str = "ssdhdhakfhdakdst";
        try {
            Object value = firstNonRepeat.firstNonRepeatedCharacter(str.toLowerCase());
            System.out.println("First non-repeated character is: " +value.toString());
        } catch(Exception e) {
            System.out.println("Every characters are repeated");
        }
    }
}
