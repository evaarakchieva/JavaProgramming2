package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Togekiss extends Pokemon {
    public Togekiss (String name, int level){
        super (name,level);
        setType(Type.FAIRY, Type.FLYING);
        setStats(85D, 50D, 95D, 120D, 115D, 80D);
        setMove( new Tackle(), new Rest(), new SonicBoom());
    }
}