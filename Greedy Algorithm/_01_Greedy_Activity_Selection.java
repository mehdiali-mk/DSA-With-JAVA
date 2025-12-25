import java.util.ArrayList;

public class _01_Greedy_Activity_Selection {
    public static void main(String args[]) {

        int startActivity[] = { 1, 3, 0, 5, 8, 5 };
        int endActivity[] = { 2, 4, 6, 7, 9, 9 };

        int maximumActivities = 1;
        ArrayList<Integer> activitiesToDo = new ArrayList<>();

        int previousActivity = endActivity[0];
        activitiesToDo.add(0);
        for (int i = 1; i < startActivity.length; i++) {
            if (startActivity[i] >= previousActivity) {
                maximumActivities++;
                activitiesToDo.add(i);
                previousActivity = endActivity[i];
            }
        }

        System.out.println("\n\nMaximum Activity can be done = " + maximumActivities);
        System.out.print("Activities are = [");
        for (int i = 0; i < activitiesToDo.size(); i++) {
            System.out.print(" A" + activitiesToDo.get(i));
        }
        System.out.println(" ]\n\n");
    }
}
