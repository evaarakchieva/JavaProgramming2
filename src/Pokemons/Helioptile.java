package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Helioptile extends Pokemon {
    public Helioptile (String name, int level){
        super (name, level);
        setType(Type.ELECTRIC, Type.NORMAL);
        setStats(44D, 38D, 33D, 61D, 43D, 70D);
        setMove(new Thunder(), new Rest(), new Charm());
    }
}
