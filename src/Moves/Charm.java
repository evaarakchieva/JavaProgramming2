package Moves;
import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm(){
        super(Type.FAIRY,0.0,100);
    } @Override
    protected java.lang.String describe() {
        return "Противник очарован покемоном и уменьшает силу своей атаки";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect = new Effect();
        effect.turns(2);
        effect.stat(Stat.ATTACK,-6);
        p.addEffect(effect);
    }
}
