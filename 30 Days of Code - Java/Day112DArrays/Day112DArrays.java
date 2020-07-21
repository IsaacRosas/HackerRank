import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day112DArrays{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int suma = 0, max_sum = Integer.MIN_VALUE; 
        for(int f = 0;f < 4;f++){
            for(int c = 0;c < 4;c++){
                suma = arr[f][c] + arr[f][c+1] + arr[f][c+2]
                        +arr[f+1][c+1]
                        + arr[f+2][c] + arr[f+2][c+1] + arr[f+2][c+2];
            
                if(suma > max_sum){
                    max_sum = suma;
                }
            }
        }
        System.out.println(max_sum);


        scanner.close();
    }
}
