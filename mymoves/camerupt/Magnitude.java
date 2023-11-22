package mymoves.camerupt;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Magnitude extends PhysicalMove {
    public Magnitude(double pow, double acc){
        super(Type.GROUND, pow, acc);


    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }

}

