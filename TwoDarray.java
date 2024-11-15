package Lecture12;
import java.util.*;
public class TwoDarray {
        static void populate(int[][] nums){
            int n=1;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[0].length;j++){
                    nums[i][j]=n;
                    n++;
                }
            }
        }
        static void display(int[][] nums){
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[0].length;j++){
                    System.out.print(nums[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        static void sort(int[][] nums){
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
    }
    static void sortbycol(int[][]nums){
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
    }
    static void transpose(int[][]nums){
    for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums[0].length;j++){
            int temp= nums[i][j];
            nums[i][j]=nums[j][i];
            nums[j][i]= temp;
        }
    }
}
    static int[] flaten(int[][] nums){
    int rows= nums.length;
    int cols= nums[0].length;
    int[] arr= new int[rows * cols];
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            arr[cols*i + j]= nums[i][j];
        }
    }
    return arr;
}
    static void fillArray(int[][] nums, int[] arr){
    int rows= nums.length;
    int cols= nums[0].length;
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            nums[i][j]=arr[cols*i + j];
        }
    }
}
    static void sortComplete(int[][] nums){
    int[] arr= flaten(nums);
    Arrays.sort(arr);
    fillArray(nums, arr);
}
    public static void main(String[] args) {
       System.out.println();

        // int n=5;
        // int [] num = new int [4];
        // int [][] arr = new int [5][6];
        // // int [][][] arr1 = new int[2][4][2];
        // // int [][][][]arr2 = new int[3][4][2][5];
        // arr[0][0]=10;
        // System.out.println(arr[0][0]);

        
    }
}
