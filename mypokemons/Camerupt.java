package mypokemons;

import mymoves.camerupt.FireBlast;
import mymoves.camerupt.Magnitude;
import mymoves.camerupt.StoneEdge;
import mymoves.camerupt.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Camerupt extends Pokemon {
    public Camerupt(String name, int level){
        super(name, level);

        super.setType(Type.FIRE, Type.GROUND);
        super.setStats(70, 100, 70, 105, 75, 40);

        StoneEdge stoneEdge = new StoneEdge(100, 80);
        FireBlast fireBlast = new FireBlast(110, 85);
        Tackle tackle = new Tackle(40, 100);
        Magnitude magnitude = new Magnitude(70, 100);

        super.setMove(stoneEdge, fireBlast, tackle, magnitude);


    }
}
