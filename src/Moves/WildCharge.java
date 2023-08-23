package Moves;
import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove {
    public WildCharge(){
        super (Type.ELECTRIC,90,100);
    } @Override
    protected java.lang.String describe(){
        return"Покемон окутывает себя электричеством и бросается на противника";
    } @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, Math.round(15));
    } @Override
    protected void applySelfDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, -15);
    }
}
