package Problem2;

public class VowelOrConsonantCheckerClass {
    char[] vowelArray = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};

    public int checkVowelOrConsonant(char ch) {
        if((int) ch < 65 || (int) ch >=91 && (int) ch <97 || (int) ch >=123) {
            return 1001;
        }
        for(char character: vowelArray) {
            if(character == ch) {
                return 1;
            }
        }
        return 0;
    }
}
