import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int N;
        N = scn.nextInt();

        for(int i=1; i<=9; i++){

            System.out.println(N +  " * " +  i  + " = "  + (N*i));
        }

        return;

    }
}