package chap01;
import java.util.Scanner;

public class study3 {
    static int med(int a, int b, int c){
        if (a >= b)
            if (b >= c)
                return b;
            else if ( a <= c)
                return a;
            else 
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else 
            return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.println("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.println("c의 값 : ");
        int c = stdIn.nextInt();
        
        System.out.println("중앙값은 "+ med(a, b, c) + "입니다.");
    }
}
