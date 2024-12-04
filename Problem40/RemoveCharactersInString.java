package Problem40;

public class RemoveCharactersInString {

    public static String removeCharactersInString(String str) {
        StringBuilder newStr = new StringBuilder();

        if(str.isEmpty())
            return null;

        for(int i=0; i<str.length(); i++) {
            int asciiCode = (int) str.charAt(i);

            if((asciiCode>65 && asciiCode<91) || (asciiCode>96 && asciiCode<123))
                newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "Hsgh96(^%%$d654*^#hjss65&%^ bd";
        String result = removeCharactersInString(str);
        if(result != null)
            System.out.println("String " +str+ "after removing characters except alphabets will be: " +removeCharactersInString(str));
        else
            System.out.println("Entered String is empty");
    }
}
