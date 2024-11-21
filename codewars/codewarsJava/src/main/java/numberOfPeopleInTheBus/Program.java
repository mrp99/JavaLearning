package numberOfPeopleInTheBus;

import java.util.ArrayList;

import static numberOfPeopleInTheBus.Metro.countPassengers;

public class Program {
    public static void main (String[] args) {
        ArrayList<int[]> metroStops1 = new ArrayList<>();
        metroStops1.add(new int[]{10, 0});
        metroStops1.add(new int[]{3, 5});
        metroStops1.add(new int[]{5, 8});

        ArrayList<int[]> metroStops2 = new ArrayList<>();
        metroStops2.add(new int[]{3, 0});
        metroStops2.add(new int[]{9, 1});
        metroStops2.add(new int[]{4, 10});
        metroStops2.add(new int[]{12, 2});
;

        System.out.println ();
        System.out.println("People left in metro in case 1: " + countPassengers(metroStops1));
        System.out.println ();
        System.out.println("People left in metro in case 2: " + countPassengers(metroStops2));
    }
}
