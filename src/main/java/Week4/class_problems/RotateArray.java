import java.util.Scanner;

class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        System.out.println("Rotated Array:");

        for (int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
    }
}