package pl.sda.arppl4.threads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        WykonywalnyObiekt wo = new WykonywalnyObiekt();
//        Thread watek = new Thread(wo);
//        watek.start();

        Thread watek = new Thread(() -> {
            for (int i = 0; i < 10000000; i++) {
                System.out.println("Hello world!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        watek.start();

        while (scanner.hasNext()){
            String slowo = scanner.next();
            System.out.println(slowo);
        }
    }
}
