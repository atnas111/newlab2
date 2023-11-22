package mymoves.chimchar;

import laba2.lab2;
import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast(double pow, double acc) {
        super(Type.FIRE, pow, acc);


    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (lab2.chance(0.1)) {
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];

    }
}
