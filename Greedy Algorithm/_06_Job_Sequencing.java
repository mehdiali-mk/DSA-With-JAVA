import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _06_Job_Sequencing {
    static class Job {
        int id;
        int profit;
        int deadline;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.profit = profit;
            this.deadline = deadline;
        }
    }

    public static void main(String args[]) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (object1, object2) -> object2.profit - object1.profit);

        ArrayList<Integer> sequence = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job currentJob = jobs.get(i);
            if (currentJob.deadline > time) {
                sequence.add(currentJob.id);
                time++;
            }
        }

        System.out.println("\n\n\nMaximum job to do = " + sequence.size());
        System.out.print("Number of jobs = [");
        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(" " + sequence.get(i));
        }
        System.out.println(" ]\n\n");
    }
}
