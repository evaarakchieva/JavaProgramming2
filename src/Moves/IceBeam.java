package Moves;
import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove  {
    public IceBeam (){
        super(Type.ICE, 90, 100);
    } @Override
    protected java.lang.String describe (){
        return "Противник поражен атакой IceBeam, он может быть полностью заморожен";
    } @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect = new Effect();
        effect.chance(0.1);
        Effect.freeze(p);
        p.addEffect(effect);
    }
}
