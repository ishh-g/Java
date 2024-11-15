package Lecture13;

public class Rotate {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
              for(int j=0;j<i;j++){
                  int temp= matrix[i][j];
                  matrix[i][j]=matrix[j][i];
                  matrix[j][i]= temp;  
      }
  }
  for(int i=0;i<matrix.length;i++){
      int j=0,k=matrix[0].length-1;
      while(j<k){
          int temp= matrix[i][j];
          matrix[i][j]= matrix[i][k];
          matrix[i][k]= temp;
          j++;k--;
          
      }
  }

  public static void main(String[] args) {
    System.out.println();

  }
}
}