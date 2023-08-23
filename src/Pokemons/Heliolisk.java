package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Heliolisk extends Pokemon {
    public Heliolisk (String name, int level){
        super (name,level);
        setType(Type.ELECTRIC, Type.NORMAL);
        setStats(62D, 55D, 52D, 109D,94D,109D);
        setMove(new Thunder(), new Rest(), new Charm(), new Slash());
    }
}
