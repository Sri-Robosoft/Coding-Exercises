public class RemoveCharactersInString {

    public static String removeCharactersInString(String str) {
        String newStr = "";
        for(int i=0; i<str.length(); i++) {
            int asciiCode = (int) str.charAt(i);

            if((asciiCode>65 && asciiCode<91) || (asciiCode>96 && asciiCode<123))
                newStr += str.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "Hsgh96(^%%$d654*^#hjss65&%^ bd";
        System.out.println("String " +str+ "after removing characters except alphabets will be: " +removeCharactersInString(str));
    }
}
