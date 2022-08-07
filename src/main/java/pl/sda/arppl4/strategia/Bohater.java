package pl.sda.arppl4.strategia;

/**
 * @author Paweł Recław, AmeN
 * @project arppl4_java_zaaw
 * @created 06.08.2022
 */
public class Bohater {
    private String imie;
    private IStrategiaWalki metodaWalki;

    public Bohater(String imie) {
        this.imie = imie;
        this.metodaWalki = new StrategiaWalkiMieczem(); // domyślna metoda walki
    }

    public Bohater(String imie, IStrategiaWalki metodaWalki) {
        this.imie = imie;
        this.metodaWalki = metodaWalki;
    }

    public void setMetodaWalki(IStrategiaWalki metodaWalki) {
        this.metodaWalki = metodaWalki;
    }

    public void walcz() {
        metodaWalki.walczStrategia();
    }
}
