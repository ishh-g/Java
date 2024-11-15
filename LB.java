package Lecture09;

public class LB {
    static int LB(int[] arr, int num){
        int low =0;
        int high = arr.length -1;
        int ans = -1;
        while(low <= high){
            int mid = (high + low)/2;
            if(num == arr[mid]){
                ans = mid;
                high = mid -1;
            }
            if(num> arr[mid])
            low = mid+1;
            if(num<arr[mid])
            high = mid -1;
        }
        return ans;
    }
    

public static void main(String[] args){
    int[] arr = {1,1,1,2,2,2,3,4,4};
    int num=2;
    int b= LB( arr, num);
    System.out.print(b);
}
}
