package Problem25;

public class PyramidPattern{
    public static void main(String []args){
        int row = 5;

        for(int i=1; i<=row; i++) {
            for(int j=row-i;j>0;j--)
                System.out.print(" ");
            for(int k=1; k<=(2*i)-1;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
