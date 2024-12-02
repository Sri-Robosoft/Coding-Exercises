public class NumberOfWordsInString {

    public static int findNumberOfWords(String str) {
        int count = 0;

        if(str.length() == 0)
            return count; 
        
        count++;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ' ')
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello Hey Hi";
        int countOfWords = findNumberOfWords(str.trim());
        System.out.println("Count of words in give string " +str+ "is: " +countOfWords);
    }
}
