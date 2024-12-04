package Problem36;

public class NumberOfWordsInString {

    public static int findNumberOfWords(String str) {
        int wordCount = 0;
        boolean isWord = false;

        if(str.isEmpty())
            return 1001;

        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isWhitespace(currentChar)) {
                isWord = false;
            } else if (!isWord) {
                wordCount++;
                isWord = true;
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {
        String str = "Hello  Hey Hi";
        int countOfWords = findNumberOfWords(str.trim());
        if(countOfWords == 1001)
            System.out.println("Entered string is empty");
        else
            System.out.println("Count of words in give string " +str+ " is: " +countOfWords);
    }
}