package roadmap.week4.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        System.out.println("Hello binary search");
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
        BinarySearch binarySearchFinder = new BinarySearch(values);
        int queries;
        queries = cin.nextInt();
        for(i=0; i<queries; i++)
        {
            long target = cin.nextLong();
            int index = binarySearchFinder.findIndex(target);
            if(index != -1)
            {
                System.out.println("Element found at index: " + index);
            }
            else
            {
                System.out.println("Element not found");
            }
        }
        cin.close();
    }
}
