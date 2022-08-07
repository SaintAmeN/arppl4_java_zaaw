package pl.sda.arppl4.strategia;

/**
 * @author Paweł Recław, AmeN
 * @project arppl4_java_zaaw
 * @created 06.08.2022
 */
public class Main {
    public static void main(String[] args) {
        Bohater bohater1 = new Bohater("Marian", new StrategiaWalkiMagią());
        bohater1.walcz(); // Abracadabra...
        bohater1.setMetodaWalki(new StrategiaWalkiŁukiem());
        bohater1.walcz(); // Śfist śfist, szczelam szczałami!
        bohater1.walcz(); // Śfist śfist, szczelam szczałami!
        bohater1.setMetodaWalki(new StrategiaWalkiMieczem());
        bohater1.walcz(); // Ciach ciach, walczę mieczem!
        bohater1.walcz(); // Ciach ciach, walczę mieczem!
        bohater1.setMetodaWalki(new StrategiaWalkiMagią());
        bohater1.walcz(); // Abracadabra...

        Bohater bohater2 = new Bohater("Miriam");
        bohater2.walcz(); // Ciach ciach, walczę mieczem!
        bohater2.walcz(); // Ciach ciach, walczę mieczem!
        bohater2.walcz(); // Ciach ciach, walczę mieczem!
        bohater2.setMetodaWalki(new StrategiaWalkiŁukiem());
        bohater2.walcz(); // // Śfist śfist, szczelam szczałami!
        bohater2.walcz(); // // Śfist śfist, szczelam szczałami!
        bohater2.walcz(); // // Śfist śfist, szczelam szczałami!
        bohater2.setMetodaWalki(new StrategiaWalkiMieczem());
        bohater2.walcz(); // Ciach ciach, walczę mieczem!
        bohater2.walcz(); // Ciach ciach, walczę mieczem!
        bohater2.walcz(); // Ciach ciach, walczę mieczem!
        bohater2.setMetodaWalki(new StrategiaWalkiOwcą());
        bohater2.walcz(); // Ogarniam Meeee...

    }
}
