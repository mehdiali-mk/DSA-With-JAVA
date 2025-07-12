import java.util.Scanner;

public class _11_GenerateBill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of pencil = ");
        float costOfPencil = sc.nextFloat();
        System.out.print("Enter cost of pen = ");
        float costOfPen = sc.nextFloat();
        System.out.print("Enter cost of eraser = ");
        float costOfEraser = sc.nextFloat();

        float totalCost = costOfPencil + costOfPen + costOfEraser;
        float gstAmount = (0.18f * totalCost);
        float finalCostWithGST = totalCost + gstAmount;

        System.out.println("\nTotal Cost of Items = " + totalCost);
        System.out.println("(+) GST Amount = " + gstAmount);
        System.out.println("\nTotal Amount = " + finalCostWithGST);

    }
}
