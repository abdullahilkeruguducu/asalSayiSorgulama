//Patika.dev linkim --> https://app.patika.dev/ailker

import java.util.Scanner;

public class Main {
    static void prime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int n = input.nextInt();
        int num = 1, b = 0;
        for (int i = 2; i <= n; i++) {
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    b = 1;
                    break;
                }
            }
            if (b == 0) {
                num = i;
            }
            b = 0;
        }
        if (num == n) {
            System.out.print(n + " sayisi ASALDIR !");
        } else {
            System.out.print(n + " sayisi ASAL degildir !");
        }
    }

    public static void main(String[] args) {
        prime();
    }
}