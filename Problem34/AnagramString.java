package Problem34;

public class AnagramString {
    public static void main(String[] args) {
        AnagramStringCheck anagram = new AnagramStringCheck();

        boolean isAnagram = anagram.checkIsAnagram("Angel", "ganel");
        if(isAnagram) {
            System.out.println("Yes it is anagram");
        } else {
            System.out.println("No it is not anagram");
        }
    }
}


