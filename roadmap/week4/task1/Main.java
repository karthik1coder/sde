package roadmap.week4.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        long n;
        Scanner cin = new Scanner(System.in);
        n= cin.nextLong();
        long i;
        List<Long> values = new ArrayList<>();
        for(i=0; i<n; i++)
        {
            long x = cin.nextLong();
            values.add(x);
        }
        MaxFinder maxFinder = new MaxFinder(values);
        System.out.println("max value is: " + maxFinder.findMax());
        System.out.println("min value is: " + maxFinder.findMin());
        cin.close();
    }
}
