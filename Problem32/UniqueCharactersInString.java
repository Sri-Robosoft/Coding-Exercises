package Problem32;

import java.util.HashSet;
import java.util.Set;

class UniqueCharactersInString {
    private Set<Character> uniqueSet;;

    UniqueCharactersInString() {
        this.uniqueSet = new HashSet<>();
    }

    public boolean checkUniqueCharacter(String str) {
        for(int i=0; i<str.length(); i++) {
            uniqueSet.add(str.charAt(i));
        }
        return uniqueSet.size()==str.length();
    }
}
