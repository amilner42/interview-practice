package interviewProblems;

import java.util.*;

public class Problem6 {

    public static void main(String[] args) {
        List<Schedule> schedules1 = Arrays.asList();
        printSchedules(scheduler(schedules1));

        List<Schedule> schedules2 = Arrays.asList(new Schedule(1, 3));
        printSchedules(scheduler(schedules2));

        List<Schedule> schedules3 = Arrays.asList(new Schedule(1, 3), new Schedule(1, 2), new Schedule(1, 5), new Schedule(9, 11) , new Schedule(4 , 12));
        printSchedules(scheduler(schedules3));

        List<Schedule> schedules4 = Arrays.asList(new Schedule(1, 3), new Schedule(1, 2), new Schedule(5, 6), new Schedule(9, 11));
        printSchedules(scheduler(schedules4));

        List<Schedule> schedules5 = Arrays.asList(new Schedule(100, 105), new Schedule(1, 34), new Schedule(5, 6), new Schedule(35, 99));
        printSchedules(scheduler(schedules5));

        List<Schedule> schedules6 = Arrays.asList(new Schedule(4, 5), new Schedule(1, 3));
        printSchedules(scheduler(schedules6));

        List<Schedule> schedules7 = Arrays.asList(new Schedule(4, 5), new Schedule(1, 2));
        printSchedules(scheduler(schedules7));
    }

    // O(nlogn) speed
    // O(n) memory
    private static List<Schedule> scheduler(List<Schedule> schedules) {
        List<Schedule> result = new ArrayList<>();

        // Sort by startTime, ties decided by endTime
        Collections.sort(schedules, (x, y) -> {
            int compare = x.startTime - y.startTime;
            if (compare == 0) {
                return x.endTime - y.endTime;
            } else {
                return compare;
            }
        });

        // Go through and check overlaps, being extra careful with index mistakes
        for(int i = 0; i < schedules.size(); i++) {
            if(i == schedules.size() - 1) {
                result.add(schedules.get(i));
            } else {
                int currentStartTime = schedules.get(i).startTime;
                int currentEndTime = schedules.get(i).endTime;
                while (currentEndTime + 1 >= schedules.get(i + 1).startTime) {
                    currentEndTime = Math.max(currentEndTime, schedules.get(i + 1).endTime);
                    i++;
                    if(i == schedules.size() - 1) {
                        break;
                    }
                }
                result.add(new Schedule(currentStartTime , currentEndTime));
            }
        }
        return result;
    }

    private static void printSchedules(List<Schedule> schedules) {
        for(Schedule current: schedules) {
            System.out.println(current + " ");
        }
        System.out.println("");
    }
}

class Schedule {
    public int startTime;
    public int endTime;

    public Schedule(int startTime , int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "(" + startTime + " , " + endTime + ")";
    }
}