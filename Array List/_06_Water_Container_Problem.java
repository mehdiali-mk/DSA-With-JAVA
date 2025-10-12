import java.util.ArrayList;

public class _06_Water_Container_Problem {

    public static int findMaximumWater(ArrayList<Integer> heightOfContainers) {
        int maximumWater = Integer.MIN_VALUE;

        for (int i = 0; i < heightOfContainers.size(); i++) {
            for (int j = i + 1; j < heightOfContainers.size(); j++) {
                int height = Math.min(heightOfContainers.get(i), heightOfContainers.get(j));
                int width = j - i;
                int water = height * width;
                if (water > maximumWater) {
                    maximumWater = water;
                }
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