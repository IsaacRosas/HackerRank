import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int modulo,contador = 0,contador_max = 0;
        char[] Arreglo;
        String binario = "";
        while(n > 0){
            modulo = n % 2;
            binario = modulo + binario;
            n = n/2;
        }
        Arreglo = binario.toCharArray();
        for(int i = 0; i < Arreglo.length;i++){
            if(Arreglo[i] == '1'){
                contador++;
            }else{
                contador = 0;
            }
            if(contador > contador_max){
                contador_max = contador;
            }
        }
        System.out.println(contador_max);
        scanner.close();
    }
}