import java.util.Scanner;

class InventoryParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter record: ");
        String input = sc.nextLine();

        String[] data = input.split(",");

        if (data.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + data[0] +
                    " | SKU: " + data[1] +
                    " | Qty: " + data[2]);
        }
    }
}