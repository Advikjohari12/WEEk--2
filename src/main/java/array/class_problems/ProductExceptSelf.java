import java.util.Scanner;

class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int product = 1;

        // Left product
        for (int i = 0; i < n; i++) {
            answer[i] = product;
            product = product * nums[i];
        }

        product = 1;

        // Right product
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * product;
            product = product * nums[i];
        }

        System.out.println("Answer:");

        for (int i = 0; i < n; i++)
            System.out.print(answer[i] + " ");
    }
}
