package Moves;
import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
    public Slash() {
        super(Type.NORMAL, 70, 100);
    } @Override
    protected java.lang.String describe(){
        return"Противник сильно исцарапан когтями";
    } @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, -10);
    }
}
