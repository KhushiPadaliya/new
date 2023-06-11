import java.util.Scanner;

public class star3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n-1; j++)
                System.out.println("*");
            for(int j = 1; j<=n; j++)
                System.out.print("*");
        }
        System.out.println("");
    }
}
