package Problem35;

public class PermutationsOfString {

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permute(char[] arr, int l, int r) {
        if (l == r) {
            System.out.println(String.valueOf(arr));
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        permute(input.toCharArray(), 0, input.length() - 1);
    }
}
