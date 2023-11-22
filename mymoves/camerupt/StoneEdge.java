package mymoves.camerupt;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(double pow, double acc){
        super(Type.ROCK, pow, acc);


    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 0.125;
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }
}
