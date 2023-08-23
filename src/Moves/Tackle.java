package Moves;
import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
    public Tackle () {
        super(Type.NORMAL, 40, 100);
    } @Override
    protected java.lang.String describe(){
        return "Физическая атака, при которой покемон бросается всем телом на противника";
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, -10);
    }
}
