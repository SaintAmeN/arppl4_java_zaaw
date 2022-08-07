package pl.sda.arppl4.anonim;

import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project arppl4_java_zaaw
 * @created 07.08.2022
 */
public class Main {
    public static void main(String[] args) {
        Runnable anonimowa = new Runnable() {
            @Override
            public void run() {

            }
        };

        NieAnonimowa nieAnonimowa= new NieAnonimowa();
    }

    public static class NieAnonimowa implements Runnable{

        @Override
        public void run() {

        }
    }
}
