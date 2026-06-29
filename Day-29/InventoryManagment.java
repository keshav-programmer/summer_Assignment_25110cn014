import java.util.Scanner;

public class InventoryManagment {
    static final int STOCK_LIMIT = 50;
    static int[]    productId    = new int[STOCK_LIMIT];
    static String[] productName  = new String[STOCK_LIMIT];
    static int[]    productQty   = new int[STOCK_LIMIT];
    static double[] productPrice = new double[STOCK_LIMIT];
    static int      productCount = 0;

    static void addProduct(Scanner sc) {
        if (productCount >= STOCK_LIMIT) { System.out.println("Inventory full."); return; }
        System.out.print("Product ID    : "); productId[productCount]    = sc.nextInt(); sc.nextLine();
        System.out.print("Product Name  : "); productName[productCount]  = sc.nextLine();
        System.out.print("Quantity      : "); productQty[productCount]   = sc.nextInt();
        System.out.print("Price per unit: Rs. "); productPrice[productCount] = sc.nextDouble(); sc.nextLine();
        productCount++;
        System.out.println("Product added to inventory.");
    }

    static void displayInventory() {
        if (productCount == 0) { System.out.println("Inventory is empty."); return; }
        System.out.println("\n--- Current Inventory ---");
        System.out.printf("%-6s %-20s %-10s %-12s %-12s%n", "ID", "Name", "Qty", "Price", "Total Value");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < productCount; i++) {
            double totalVal = productQty[i] * productPrice[i];
            System.out.printf("%-6d %-20s %-10d Rs.%-9.2f Rs.%-9.2f%n",
                    productId[i], productName[i], productQty[i], productPrice[i], totalVal);
        }
    }

    static void updateQuantity(Scanner sc) {
        System.out.print("Enter Product ID to update: ");
        int pid = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < productCount; i++) {
            if (productId[i] == pid) {
                System.out.print("New quantity: ");
                productQty[i] = sc.nextInt(); sc.nextLine();
                System.out.println("Quantity updated.");
                return;
            }
        }
        System.out.println("Product ID not found.");
    }

    static void lowStockAlert() {
        System.out.println("\n--- Low Stock Alert (Qty < 5) ---");
        boolean any = false;
        for (int i = 0; i < productCount; i++) {
            if (productQty[i] < 5) {
                System.out.println(productName[i] + " -> Qty: " + productQty[i] + " [REORDER NEEDED]");
                any = true;
            }
        }
        if (!any) System.out.println("All products are sufficiently stocked.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1.Add Product  2.View Inventory  3.Update Qty  4.Low Stock Alert  5.Exit");
            System.out.print("Option: ");
            opt = sc.nextInt(); sc.nextLine();
            switch (opt) {
                case 1: addProduct(sc);      break;
                case 2: displayInventory();  break;
                case 3: updateQuantity(sc);  break;
                case 4: lowStockAlert();     break;
                case 5: System.out.println("Inventory system closed."); break;
                default: System.out.println("Invalid option.");
            }
        } while (opt != 5);
        sc.close();
    }
}
