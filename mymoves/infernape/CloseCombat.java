package mymoves.infernape;

import ru.ifmo.se.pokemon.*;

public class CloseCombat extends PhysicalMove {
    public CloseCombat(double pow, double acc){
        super(Type.FIGHTING, pow, acc);


    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, -1 );
        Effect e1 = new Effect().stat(Stat.SPECIAL_DEFENSE, -1 );

        p.addEffect(e);
        p.addEffect(e1);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }
}
