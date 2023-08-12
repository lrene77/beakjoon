import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //초기화
        int num1,num2,num3,num4,num5,num6;

        //입력
        Scanner scn = new Scanner(System.in);

        num1 = scn.nextInt();
        num2 = scn.nextInt();
        num3 = scn.nextInt();
        num4 = scn.nextInt();
        num6 = scn.nextInt();

        //제곱값 반환
        double squ1 = Math.pow(num1,2);
        double squ2 = Math.pow(num2,2);
        double squ3 = Math.pow(num3,2);
        double squ4 = Math.pow(num4,2);
        double squ5 = Math.pow(num6,2);

//        System.out.println(squ1);
//        System.out.println(squ2);
//        System.out.println(squ3);
//        System.out.println(squ4);
//        System.out.println(squ5);

        //형변환
        System.out.println((int)(squ1+squ2+squ3+squ4+squ5)%10);




    }
}