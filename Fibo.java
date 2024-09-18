import java.util.Scanner;

public class Fibo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(makeFibo(sc.nextInt()));
    }
    public static int makeFibo(int n){
        if(n < 2){
            return n;
        }
        int[] fibos = new int[n+1];
        fibos[0] = 0;
        fibos[1] = 1;
        for(int i = 2; i <= n; i++){
            fibos[i] = fibos[i-1] + fibos[i-2];
        }
        return fibos[n];
    }
}