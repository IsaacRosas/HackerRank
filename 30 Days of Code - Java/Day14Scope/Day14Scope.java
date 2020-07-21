import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] a){
        elements = a;
    }
    
    public void computeDifference(){
        int diferencia = 0;
        int maxdiferencia = 0;
        for(int i = 0;i < elements.length;i++){
            for(int a = 0; a < elements.length;a++){
                diferencia = Math.abs(elements[i]-elements[a]);
                if(diferencia > maxdiferencia){
                    maxdiferencia = diferencia;
                }
            }
        }
        maximumDifference = maxdiferencia;
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}