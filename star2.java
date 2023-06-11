import java.util.Scanner;

public class star2 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();

         for(int i=1; i <= s;  i++){
             for (int j = 1; j <= s; j++)
                 System.out.print("*");
             System.out.println("");
         }
    }
}
