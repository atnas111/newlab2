package mypokemons;

import mymoves.pheromosa.BulkUp;
import mymoves.pheromosa.Confide;
import mymoves.pheromosa.FocusEnergy;
import mymoves.pheromosa.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pheromosa extends Pokemon{
    public Pheromosa(String name, int level){
        super(name, level);

        super.setType(Type.FIGHTING, Type.GHOST);
        super.setStats(71, 137, 37, 137, 37, 151);

        Confide confide = new Confide(0, 0);
        BulkUp bulkUp = new BulkUp(0, 0);
        RockTomb rockTomb = new RockTomb(60, 95);
        FocusEnergy focusEnergy = new FocusEnergy(0, 0);

        super.setMove(confide, bulkUp, rockTomb, focusEnergy);
    }
}
