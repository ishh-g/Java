package Lecture06;

public class Swaparray { 
    static void Swapping(int[]arr,int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;  
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int i=3;
        int j=5;
        swap(arr,i,j);
    }
    
}
