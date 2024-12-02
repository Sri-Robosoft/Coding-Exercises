public class CountUpperLowerCaseLetters {

    public static void countUpperLowerCaseLettersInString(String str) {
        int lowerCount = 0;
        int upperCount = 0;

        for(int i=0; i<str.length(); i++) {
            int asciiCode = (int) str.charAt(i);

            if(asciiCode>64 && asciiCode<91)
                upperCount++;
            else if(asciiCode>96 && asciiCode<123)
                lowerCount++;
        }
        System.out.println("Count of Uppercase letters in String " +str+ "is: " +upperCount);
        System.out.println("Count of Lowercase letters in String " +str+ "is: " +lowerCount);
    }
    public static void main(String[] args) {
        String str = "hgKJbbHkbhHJN,&%7946##$&gdfgv";
        countUpperLowerCaseLettersInString(str);
    }
}
