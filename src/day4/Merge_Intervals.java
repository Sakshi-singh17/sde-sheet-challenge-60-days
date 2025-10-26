package day4;

import java.util.ArrayList;
import java.util.Arrays;

//56. Merge Intervals
public class Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length ==0){
            return new int[0][];
        }
        Arrays.sort(intervals,(a, b) -> a[0]-b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            int newStart = intervals[i][0];
            int newEnd = intervals[i][1];

            if(newStart<=end){
                end = Math.max(end, newEnd);
            }
            else{
                result.add(new int[]{start, end});
                start=newStart;
                end=newEnd;
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}
