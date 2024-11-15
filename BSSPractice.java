package Lecture12;

public class BSSPractice {
    static boolean check (int []arr, int cars, long time){
        int count =0;
        for(int i=0; i<arr.length;i++)
        count+= Math.sqrt(time/arr[i]);
        return(count>=cars);
    }
    public long BSSPractice(int[] ranks, int cars){
        long low= 1, high =Long.MAX_VALUE;
        long ans =high;
        while(low<=high){
            long mid= high-(high-low)/2;
            if(check(ranks,cars,mid)){
                ans = mid;
                high=mid;
                high=mid-1;
            }
            else
            low = mid +1;
        }
    }
    return ans;
    }
public static void main(String[] args) {
    System.out.println()