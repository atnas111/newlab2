package mymoves.infernape;

import ru.ifmo.se.pokemon.*;

public class SlackOff extends StatusMove {
    public SlackOff(double pow, double acc){
        super(Type.NORMAL, pow, acc);


    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.HP, 38);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }
}
