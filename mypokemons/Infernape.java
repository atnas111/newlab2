package mypokemons;

import mymoves.infernape.CloseCombat;
import mymoves.infernape.FireBlast;
import mymoves.infernape.Flamethrower;
import mymoves.infernape.SlackOff;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Pokemon{
    public Infernape(String name, int level){
        super(name, level);

        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(76, 104, 71, 104, 71, 108);

        CloseCombat close_combat = new CloseCombat(120, 100);
        Flamethrower flamethrower = new Flamethrower(90, 100);
        FireBlast fireBlast = new FireBlast(110, 85);
        SlackOff slackOff = new SlackOff(0, 0);


        super.setMove(close_combat, flamethrower, fireBlast, slackOff);

    }

}
