package Moves;
import ru.ifmo.se.pokemon.*;


public class Rest extends StatusMove{
    public Rest() { super(Type.PSYCHIC,0.0,0.0); }
    @Override
    protected java.lang.String describe(){
        return "Покемон 2 хода находится во сне, но полностью восстанавливается";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect=new Effect();
        effect.turns(2);
        Effect.sleep(p);
        effect.stat(Stat.HP);
        p.addEffect(effect);
    }
}