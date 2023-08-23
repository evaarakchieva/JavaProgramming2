package Moves;
import ru.ifmo.se.pokemon.*;

public class SonicBoom extends SpecialMove {
    public SonicBoom(){
        super(Type.NORMAL,0.0,90);
    } @Override
    protected java.lang.String describe(){
        return"Противник поражен разрушающей шоковой волной, урон которой всегда составляет 20 HP";
    } @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect = new Effect();
        effect.stat(Stat.HP, -20);
        p.addEffect(effect);
    }
}
