/*
You are given two 2D integer arrays series1 and series2.
Each element in both series is of the form [timestamp, value], where:
      -> timestamp is an integer representing the time.
      -> value is an integer representing the value at that timestamp.
      -> Each array is sorted in strictly increasing order of timestamp.
For any timestamp not present in a series, its value is taken from the next available timestamp in the same series if one exists. Otherwise, its value is considered 0.The aggregated series is formed by summing the corresponding values from both series at every timestamp that appears in either series.
Return the aggregated series as a 2D integer array of [timestamp, summedValue] 
pairs, sorted in strictly increasing order of timestamp.*/


import java.util.*;
class AggregateTimeSeries {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
       List<List<Integer>>ans=new ArrayList<>();
        int i=0,j=0;
        while(i<series1.length && j<series2.length){
            if(series1[i][0]==series2[j][0]){
                ans.add(Arrays.asList(series1[i][0],series2[j][1]+series1[i][1]));
                i++;j++;  
            }
            else if(series1[i][0]<series2[j][0]){
                ans.add(Arrays.asList(series1[i][0],series1[i][1]+series2[j][1]));
                i++;
            }
            else{
                ans.add(Arrays.asList(series2[j][0],series2[j][1]+series1[i][1]));
            j++;
            }
        }
        while(i<series1.length){
               ans.add(Arrays.asList(series1[i][0],series1[i][1]));
            i++;
        }
        while(j<series2.length){
            ans.add(Arrays.asList(series2[j][0],series2[j][1]));
            j++;
        }
        return ans;
    }
}