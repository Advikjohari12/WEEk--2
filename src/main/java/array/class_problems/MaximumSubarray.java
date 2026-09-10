import java.util.Scanner;

class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int current = nums[0];
        int maximum = nums[0];

        for (int i = 1; i < n; i++) {

            current = Math.max(nums[i], current + nums[i]);

            maximum = Math.max(maximum, current);
        }

        System.out.println("Maximum Subarray Sum: " + maximum);
    }
}