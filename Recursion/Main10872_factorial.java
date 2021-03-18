import java.io.*;
import java.util.*;

public class Main10872{
    static int factorial(int n){
        if(n>0)
            return n*factorial(n-1);
        else
            return 1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        System.out.println(factorial(n));
    }
}