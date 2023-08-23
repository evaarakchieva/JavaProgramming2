package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Togetic extends Pokemon {
    public Togetic (String name, int level){
        super (name,level);
        setType(Type.FAIRY, Type.FLYING);
        setStats(55D, 40D, 85D, 80D, 105D, 40D);
        setMove( new Tackle(), new Rest(), new SonicBoom());
    }
}