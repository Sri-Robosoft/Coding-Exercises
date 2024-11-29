package Problem6;

import java.util.List;

public class AddFraction {
    public static void main(String[] args) {
        AddFractionsClass frac = new AddFractionsClass();
        int n1 = 1;
        int d1 = 3;
        int n2 = 3;
        int d2 = 9;
        System.out.print(n1 +"/"+ d1 +" + "+ n2 +"/"+ d2 +" : ");
        List<Integer> fractionList = frac.addFractions(n1,d1,n2,d2);
        System.out.println(fractionList.get(0) +"/"+ fractionList.get(1));
    }
}
