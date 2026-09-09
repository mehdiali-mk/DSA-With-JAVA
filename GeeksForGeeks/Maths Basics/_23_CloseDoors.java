import java.util.ArrayList;

public class _23_CloseDoors {

    public static ArrayList<Integer> checkDoorStatus(int n) {
        // code here
        ArrayList<Integer> myArrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            myArrayList.add(0);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0 + i - 1; j < n; j += i == 0 ? 1 : i) {
                System.out.println(j);
                myArrayList.set(j, myArrayList.get(j) == 1 ? 0 : 1);
            }
        }

        return myArrayList;
    }

    public static void main(String args[]) {
        System.out.println(checkDoorStatus(5));
    }
}
