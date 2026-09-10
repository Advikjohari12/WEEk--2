import java.util.Scanner;

class SeatDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println("Enter seat numbers:");
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (seats[i] == seats[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seats[i]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Duplicate Seats Found");
        }
    }
}