package Problem2;

public class VowelOrConsonant {
    public static void main(String[] args) {
        VowelOrConsonantCheckerClass vowelOrConsonant = new VowelOrConsonantCheckerClass();

        int value = vowelOrConsonant.checkVowelOrConsonant('a');

        if(value == 1001)
            System.out.println("Character is neither vowel nor consonant");
        else if (value == 1) {
            System.out.println("Character is vowel");
        } else if (value == 0) {
            System.out.println("Character is consonant");
        }
    }
}
