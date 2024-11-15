package Lecture09;
public class Binarysearch {
    static boolean Binarysearch(int [] arr, int num) {
    int low=0;
    int high= arr.length-1;
    while(low<= high){
        int mid = (high+low)/2;
        if(arr[mid]== num){
        return true;
    }
        else if (arr[mid]<num){
        low= mid +1;
        }
        else
        high = mid -1;
    }
    return false;
}
public static void main(String[] args){
    int[] arr = {6,7,8,9,10,11,12,13};
    int num=8;
    boolean b= Binarysearch( arr, num);
    System.out.print(b);
}
}