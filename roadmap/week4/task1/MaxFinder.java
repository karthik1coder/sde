
package roadmap.week4.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxFinder {
    List<Long> numbers = new ArrayList<>();
    int i;
    
    public MaxFinder(List<Long> numbers) {
        this.numbers = numbers;
    }
    
    public long findMax()
    {
       Long max = Long.MIN_VALUE;
       for(i=0; i<numbers.size(); i++)
       {
           if(numbers.get(i) > max)
           {
               max = numbers.get(i);
           }
       }
       return max;
    }
    public long findMin()
    {
        Long min = Long.MAX_VALUE;
        for(i=0; i<numbers.size(); i++)
        {
            if(numbers.get(i) < min)
            {
                min = numbers.get(i);
            }
        }
        return min;
    }


    



}
