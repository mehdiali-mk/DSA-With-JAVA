import java.util.concurrent.ThreadLocalRandom;

public class _40_Mind_Game {
    public static int mindGame(int k) {
        // code here
        int chosenNumber = ThreadLocalRandom.current().nextInt(1, 11);

        return ((((chosenNumber * 2) + k) / 2) - chosenNumber);
    }

    public static void main(String args[]) {
        System.out.println(mindGame(6));
    }
}