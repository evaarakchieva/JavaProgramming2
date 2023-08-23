package Moves;
import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE,110,70);
    } @Override
    protected java.lang.String describe(){
        return "Аттака может заморозить противника";
    }
    @Override
    protected void applyOppEffects (Pokemon p){
        Effect effect = new Effect ();
        effect.chance(0.1);
        Effect.freeze(p);
        p.addEffect(effect);
    }
}
