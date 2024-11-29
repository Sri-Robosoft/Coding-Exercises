package Problem31;

public class FirstNonRepeatingCharacterString {
    public Object firstNonRepeatedCharacter(String str) {
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return null;
    }
}
