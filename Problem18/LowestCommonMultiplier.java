package Problem18;

public class LowestCommonMultiplier {
    public static void main(String[] args) {
        LcmClass lcm = new LcmClass();

        int a = 9;
        int b = 45;
        int lcmValue = lcm.calculateLcm(a,b);

        if(lcmValue == 1001)
            System.out.println("Please enter positive numbers");
        else {
            System.out.print("LCM of " +a+ " and " +b+ " is: " + lcmValue);
        }
    }
}
