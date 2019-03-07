import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println(" please enter your numbers :");
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println(max(numbers));
        System.out.println("hi");
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;

    }
}
