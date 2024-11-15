package Lecture04;

public class PatternPrinting {
   public static void main(String[] args) {
    // sqaure

    //int n=4;
    //for(int i= 1; i<=n;i++){
    //for(int j=1; j<=n;j++)
   // System.out.print("*");
     // System.out.println();
   //}


   //Left Facing Triangle

    //int n=5;
   // for(int i= 1; i<=n;i++){
    //for printing spaces
   // for(int k= 1; k<=(n-i);k++)
   // System.out.print("  ");
    //for printing stars
   // for(int j=1; j<=i;j++)
   // System.out.print("* ");
   // System.out.println();
//}
  // }
//}


//Inverted Right facing Triangle

// int n=5;
// for(int i=n; i>=1;i--){
//     for(int j=1; j<=i;j++)
//    System.out.print("* ");
//     System.out.println();
// }
//    }
// }


//Inverted left facing triangle

//for(int i=n; i>=1;i--){
   // for(int k= 1; k<=n-i;k++)
   // System.out.print("  ");
   // for(int j=1; j<=i;j++)
  //  System.out.print("* ");
   // System.out.println();
//}
  // }
//}


//pdf ques 6

//int n = 5;
//for(int i=n; i>=1;i--){
//     for(int k= 1; k<=2*(n-i);k++)
//      System.out.print("  ");
//      for(int j=1; j<=i;j++)
//      System.out.print("* ");
//      System.out.println();
// }
//    }
// }



//pdf ques 7

// int n=5;
// for(int i=1; i<=n;i++){
//     for(int j=1; j<=n; j++){
//     if(i==n||j==1||i==1||j==n){
//         System.out.print("* ");
//     }else{
//         System.out.print("  ");
//     }

//     }
//     System.out.println();
// }
// }
// }


//pdf ques 8

// int n=5;
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=n;j++)
//            if(i==j || j==n-i+1)
//                System.out.print("* ");
//            else
//                System.out.print("  ");
//        System.out.println();
//    }
// }
// }

//for self practice

// for(int i=1;i<=n;i++){
//    for(int j=1;j<=n;j++)
// if(i==j||j==n-i+1)
// System.out.print("* ");
// else
// System.out.print("  ");
// System.out.println();
//    }
// }
// }


//pdf ques 9

// int n=5;
//    for(int i= 1; i<=n;i++){
//    //for printing spaces
//     for(int k= 1; k<=(n-i);k++)
//     System.out.print("  ");
//     //for printing stars
//     for(int j=1; j<=i;j++)
//    System.out.print("* ");
//     System.out.println();
// }
//    }
// // } 






        
//         int n = 5; // Given n = 5
        
//         for (int i = 1; i <= n; i++) {
//             // Printing spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }
//             // Printing stars
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

int n = 5; // Given n = 5
        
for (int i = 1; i <= n; i++) {
    // Printing spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
    }
    // Printing stars and exclamation marks
    for (int j = 1; j <= 2 * i - 1; j++) {
        if (j % 2 == 0) {
            System.out.print("! ");
        } else {
            System.out.print("* ");
        }
    }
    System.out.println();
}
}
}