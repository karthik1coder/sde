package roadmap.week4.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    
    List<Long> numbers = new ArrayList<>();
    int i;
    public BinarySearch(List<Long> numbers) {
        numbers = sort(numbers);
        this.numbers = numbers;
    }

    private List<Long> sort(List<Long> values) {
        List<Long> sortedValues = new ArrayList<>(values);
        Collections.sort(sortedValues);
        return sortedValues;
    }

    public int findIndex(long target)
    {
        int left=0;
        int right= numbers.size()-1;
        int mid;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(numbers.get(mid)==target)
            {
                return mid;
            }
            else if(numbers.get(mid)<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}
