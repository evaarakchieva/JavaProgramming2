package Moves;
import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing (){
        super(Type.NORMAL,0.0,55);
    } @Override
    protected java.lang.String describe(){
        return "Завораживающая песня погружает противника в глубокий сон";
    } @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect();
        effect.turns(1 | 2 | 3);
        Effect.sleep(p);
        p.addEffect(effect);
    }
}
