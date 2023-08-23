package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Phione extends Pokemon {
    public Phione (String name, int level){
        super (name, level);
        setType(Type.WATER);
        setStats(80D, 80D, 80D, 80D, 80D, 80D);
        setMove(new WildCharge(), new Sing(), new IceBeam(), new Blizzard());
    }
}
