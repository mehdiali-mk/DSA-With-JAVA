import java.util.ArrayList;

public class _07_Water_Container_2_Pointer_Approach {

    public static int findMaximumWater(ArrayList<Integer> heightOfContainers) {
        int maximumWater = Integer.MIN_VALUE;
        int leftPointer = 0;
        int rightPointer = heightOfContainers.size() - 1;

        while (leftPointer < rightPointer) {
            int height = Math.min(heightOfContainers.get(leftPointer), heightOfContainers.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currentWater = height * width;
            maximumWater = Math.max(maximumWater, currentWater);
            if (heightOfContainers.get(leftPointer) < heightOfContainers.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maximumWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> heightOfContainers = new ArrayList<>();
        heightOfContainers.add(1);
        heightOfContainers.add(8);
        heightOfContainers.add(6);
        heightOfContainers.add(2);
        heightOfContainers.add(5);
        heightOfContainers.add(4);
        heightOfContainers.add(8);
        heightOfContainers.add(3);
        heightOfContainers.add(7);

        int maximumWater = findMaximumWater(heightOfContainers);
        System.out.println("\n\nMaximum Water in Container = " + maximumWater + "\n\n");
    }
}