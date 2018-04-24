import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class spiral{

      /*
       *      * Complete the miniMaxSum function below.
       *           */
      static void generate(int n) {
        int[][] mat= new int[n][n];
        int gnum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              
              mat[i][j]=gnum;
              gnum++;
              System.out.print(" "+mat[i][j]);
            }
            System.out.print("\n");
          }
      int i=0;  
      for(int j=0;j<n;j++)
      {
        System.out.print(mat[i][j]);
    
      }
    }

private static final Scanner scan = new Scanner(System.in);

public static void main(String[] args) {

                    int n = Integer.parseInt(scan.nextLine());
                     generate(n);
   }
}

