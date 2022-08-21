package eolymp;

import java.util.Scanner;

public class TwoFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte();
        byte y = scanner.nextByte();
        if(x <= 0 || y <= 0) System.out.print(0);
        else System.out.println(fun(x, y));
    }
    private static int fun(int x, int y){
        if(x <= 0 || y <= 0) return 0;
        if(x <= y) return fun(x - 1, y - 2) + fun(x - 2, y - 1) + 2;
        return fun(x - 2, y - 2);
    }
}
