package Problem27;

public class ArmstrongNumber {
    private int sum;
    private int rem;
    private int countOfOrder;

    ArmstrongNumber() {
        this.sum = 0;
        this.rem = 0;
        this.countOfOrder = 0;
    }

    public int getCountOfOrder(int n) {
        while(n!=0) {
            this.countOfOrder++;
            n /= 10;
        }
        return countOfOrder;
    }

    public int getSumOfArmstrongNumber(int n, int c) {
        while(n!=0) {
            rem = n%10;
            sum += (int) Math.pow(rem, c);
            n /= 10;
        }
        return sum;
    }

    public void checkArmstrongNumber(int num) {
        if(num<0)
            System.out.println("Enter positive number");

        int count = getCountOfOrder(num);
        int result = getSumOfArmstrongNumber(num, count);

        if(result == num)
            System.out.println("Number is an armstrong number");
        else
            System.out.println("Number is not an armstrong number");
    }
}
