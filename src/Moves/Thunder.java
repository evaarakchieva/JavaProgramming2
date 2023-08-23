package Moves;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC,110,70);
    } @Override
    protected java.lang.String describe(){
        return"На противника направляется свирепая молния, наносящая значительный урон. Также жертва может остаться порализованной";
    } @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, Math.round(10));
    } @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect = new Effect();
        effect.chance(0.3);
        Effect.paralyze(p);
        p.addEffect(effect);
    }
}

