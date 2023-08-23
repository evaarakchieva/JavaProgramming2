package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Togepi extends Pokemon {
    public Togepi (String name, int level){
        super (name,level);
        setType(Type.FAIRY);
        setStats(35D, 20D, 65D, 40D, 65D, 20D);
        setMove( new Tackle(), new Rest());
    }
}
