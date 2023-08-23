import Pokemons.*;
import ru.ifmo.se.pokemon.*;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream out = new Analyze(System.out);
        System.setOut(out);
        Battle b = new Battle();
        Pokemon p1 = new Phione("Phione", 50);
        Pokemon p2 = new Togepi("Togepi", 50);
        Pokemon p3 = new Heliolisk("Heliolisk", 50);
        Pokemon p4 = new Togetic("Togetic", 50);
         Pokemon p5 = new Helioptile("Helioptile", 50);
        Pokemon p6 = new Togekiss("Togekiss", 50);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
